import java.util.Objects;

/**
 * Created by Jarred on 2/7/2017.
 */
public class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(){

    }

    public Student(int id, String name){
        this.name = name;
        this.id = id;
    }

    public Student(Student student){
        this(student.id, student.name, student.gpa);
    }

    public Student[] getSmartStudents(Student[] students){
        if(students == null)return null;
        Student[] smartStudents = new Student[students.length];
        int index = 0;
        for(int i = 0; i<students.length; i++){
            if(students[i].getGpa() > 11.0){
                smartStudents[index] = students[i];
                index++;
            }
        }
        return smartStudents;
    }

    public Student[] removeStudent(Student[] students, int index){
        if(students == null)return null;
        Student[] newList = new Student[students.length];
        if(index < 0)return null;
        for(int i = 0; i < students.length; i++){
            if(i >= index){
                newList[i-1] = students[i];
            }
            else{
                newList[i] = students[i];
            }
        }
        return newList;
    }

    public Student[] createRandomStudents(){
        Student[] students = new Student[100];
        for (int i = 0; i < 100; i++) {
            if(i == 0){
                students[0].setID(2);
            }
            else{
            students[i].setID(i*2);
            }
        }
        return students;
    }

}
