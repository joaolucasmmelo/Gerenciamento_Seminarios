package site.um.javajiraya.javacore.Gassociacao.Projeto_Seminarios_Github;

public class Professor {
    private String name;
    private String expertise;
    private int ssn;
    private String password;
    private Seminar[] seminars;

    public Professor(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    public Professor(String name, String expertise, Seminar[] seminars) {
        this.name = name;
        this.expertise = expertise;
        this.seminars = seminars;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
