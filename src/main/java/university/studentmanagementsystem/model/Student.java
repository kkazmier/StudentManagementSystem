package university.studentmanagementsystem.model;

public class Student extends Person {
    private double grade;
    private String studentID;
    
    public void Student(String name, int age, double grade) {
        super.setName(name);
        super.setAge(age);
        this.grade = grade;
    }
    
    @Override
    public String getName() {
        return super.getName();
    }
    
    @Override
    public int getAge() {
        return super.getAge();
    }
    
    public double getGrade() {
        return grade;
    }
    
    public String GetStudentId() {
        return studentID;
    }
    
    public void setGrade(double grade) {
        this.grade = grade;
    }
}
