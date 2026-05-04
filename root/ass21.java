package root;

class Person {
    int age; float weight, height; String dob, address;
    void setPerson(int a, float w, float h, String d, String addr) {
        age = a; weight = w; height = h; dob = d; address = addr;
    }
}

class Employee extends Person {
    float salary; String dateOfJoining; int experience;
    void setEmp(float s, String doj, int exp) { salary = s; dateOfJoining = doj; experience = exp; }
}

class Student extends Person {
    int roll; String[] listOfSubjects; int[] marks;
    void setStudent(int r, String[] sub, int[] m) { roll = r; listOfSubjects = sub; marks = m; }
    void calculateGrade() { System.out.println("Grade calculated for Roll: " + roll); }
}

class Technician extends Employee {
    void work() { System.out.println("Technician is maintaining equipment."); }
}

class Professor extends Employee {
    String[] courses = new String[5]; int cCount = 0;
    void addCourse(String c) { courses[cCount++] = c; }
    void display() { System.out.println("Professor Salary: " + salary); }
}

public class ass21 {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.setPerson(45, 70, 175, "01-01-1980", "Kolkata");
        prof.setEmp(90000, "10-05-2010", 15);
        prof.addCourse("Data Structures");
        prof.display();

        Technician tech = new Technician();
        tech.work();
    }
}
