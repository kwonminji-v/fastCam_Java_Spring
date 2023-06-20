package FastCampus.model;

public class MovieVO {
    private String title;
    private String day;
    private String name;
    private String jangre;
    private int time;
    private int age;

    public MovieVO() {

    }

    public MovieVO(String title, String day, String name, String jangre, int time, int age) {
        this.title = title;
        this.day = day;
        this.name = name;
        this.jangre = jangre;
        this.time = time;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJangre() {
        return jangre;
    }

    public void setJangre(String jangre) {
        this.jangre = jangre;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", day='" + day + '\'' +
                ", name='" + name + '\'' +
                ", jangre='" + jangre + '\'' +
                ", time=" + time +
                ", age=" + age +
                '}';
    }
}
