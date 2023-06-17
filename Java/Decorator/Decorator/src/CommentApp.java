import Comments.Client;
import Comments.CommentService;
import Comments.DefaultCommentService;
import Decorator.SpamFilteringCommentDecorator;
import Decorator.TrimmingCommentDecorator;

public class CommentApp {
    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는 게 하는 거보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
