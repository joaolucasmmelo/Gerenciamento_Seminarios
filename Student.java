package site.um.javajiraya.javacore.Gassociacao.Projeto_Seminarios_Github;

public class Student {
    private String name;
    private int age;
    private int ssn;
    private String password;
    private Seminar seminar;

    public Student(String name, int age, int ssn) {
        this.ssn = ssn;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
}
