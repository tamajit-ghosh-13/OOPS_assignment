package root;

class Student {
    String name; int roll; String[] subjects;
    Student(String n, int r, String[] s) { name = n; roll = r; subjects = s; }
}

class MarkSheet {
    String name; int[] marks = new int[5];
    int count = 0;
    void addMark(String n, int m) { this.name = n; marks[count++] = m; }
    void print() {
        System.out.print("Student: " + name + " | Marks: ");
        for (int m : marks) System.out.print(m + " ");
        System.out.println();
    }
}

public class ass18 {
    public static void main(String[] args) {
        MarkSheet m1 = new MarkSheet();
        m1.addMark("Student 1", 85); m1.addMark("Student 1", 90); m1.addMark("Student 1", 78);
        m1.print();
    }
}
