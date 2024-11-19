package site.um.javajiraya.javacore.Gassociacao.Projeto_Seminarios_Github;

public class Seminar {
    private String title;
    private Student[] studentsSeminar;
    private Local adress;

    public Seminar(String title, Local adress) {
        this.title = title;
        this.adress = adress;
    }

    public Local getAdress() {
        return adress;
    }

    public void setAdress(Local adress) {
        this.adress = adress;
    }

    public Student[] getStudents() {
        return studentsSeminar;
    }

    public void setStudentsSeminar(Student[] studentsSeminar) {
        this.studentsSeminar = studentsSeminar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
