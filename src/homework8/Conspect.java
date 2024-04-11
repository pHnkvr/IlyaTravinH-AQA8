package homework8;

public class Conspect {
    private String name;
    private String surname;
    private String patronymic;
    private String subject;
    private int pages;
    private int prom;
    private String color;
    private String college;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getProm() {
        return prom;
    }

    public void setProm(int prom) {
        this.prom = prom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Conspect(String name, String surname, String patronymic, String subject, int pages, int prom, String color, String college) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.subject = subject;
        this.pages = pages;
        this.prom = prom;
        this.color = color;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Conspect{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", subject='" + subject + '\'' +
                ", pages=" + pages +
                ", prom=" + prom +
                ", color='" + color + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
