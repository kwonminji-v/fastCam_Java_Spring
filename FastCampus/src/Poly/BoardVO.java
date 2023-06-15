package Poly;

public class BoardVO extends Object {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "BoardVO{" +
                "title='" + title + '\'' +
                '}';
    }
}
