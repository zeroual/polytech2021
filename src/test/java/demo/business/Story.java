package demo.business;

public class Story {
    private  Long id;
    private String content;

    public Story(String content) {
        this.content = content;
    }

    public Story(Long id, String content) {

        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
