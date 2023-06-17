import java.util.Objects;

public class GitHubIssue implements Cloneable{
    private int id;
    private String title;
    private GitHubRepository repository;
    public int getId() {
        return id;
    }

    public GitHubIssue(GitHubRepository repository) {
        this.repository = repository;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GitHubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        /* 깊은 복사를 수행하는 부분 */
        GitHubRepository newRepository = new GitHubRepository();

        newRepository.setUser(this.repository.getUser());
        newRepository.setName(this.repository.getName());

        GitHubIssue gitHubIssue = new GitHubIssue(newRepository);
        gitHubIssue.setId(this.id);
        gitHubIssue.setTitle(this.title);

        /*return super.clone(); // 기본적으로 얕은 복사를 수행 */
        return gitHubIssue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        GitHubIssue that = (GitHubIssue) obj;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }
}
