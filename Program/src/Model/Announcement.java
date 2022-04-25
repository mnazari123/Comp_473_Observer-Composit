package Model;

public class Announcement {
    private String title;
    private String text;

    public Announcement() {
        this.title = "";
        this.text = null;
    }

    public Announcement(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

}
