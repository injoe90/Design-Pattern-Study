public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        GitHubRepository repository = new GitHubRepository();
        repository.setUser("WhiteShip");
        repository.setName("Live-Study");

        GitHubIssue gitHubIssue = new GitHubIssue(repository);
        gitHubIssue.setId(1);
        gitHubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는가");

        System.out.println(gitHubIssue.getUrl());

        GitHubIssue clone = (GitHubIssue) gitHubIssue.clone();

        System.out.println(gitHubIssue != clone);
        System.out.println(clone.equals(gitHubIssue));
        System.out.println(gitHubIssue.getClass() == clone.getClass());

    }
}