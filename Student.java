package experimenal;

public class Student {
    private int id;
    private String name;
    private double CGPA;

    public Student() {
    }

    public Student(int id, String name, double cGPA) {
        this.id = id;
        this.name = name;
        CGPA = cGPA;
    }

    public Student(int parseInt, String string, String string2) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }
}
