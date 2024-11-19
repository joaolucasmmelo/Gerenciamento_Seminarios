package site.um.javajiraya.javacore.Gassociacao.ExSeminarios;

public class Seminar {
    private String title;
    private Student[] students;
    private Local adress;

    public Seminar(String titulo) {
        this.title = title;
    }

    public Seminar(String title, Student[] students) {
        this.title = title;
        this.students = students;
    }

    public Seminar(String title, Student[] students, Local adress) {
        this.title = title;
        this.students = students;
        this.adress = adress;
    }

    public Local getAdress() {
        return adress;
    }

    public void setAdress(Local adress) {
        this.adress = adress;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
