package root;

class Employee {
    String name, id, address; float salary;
    Employee(String n, String i, String a, float s) { name = n; id = i; address = a; salary = s; }
}

class Dept {
    String name, location; int year;
    Employee[] emps = new Employee[50];
    int count = 0;

    Dept(String n, String l, int y) { name = n; location = l; year = y; }
    void add(Employee e) { emps[count++] = e; }
    
    void printAnnualBudget() {
        float total = 0;
        for (int i = 0; i < count; i++) total += (emps[i].salary * 12);
        System.out.println("Annual salary for " + name + " department: " + total);
    }
}

public class ass17 {
    public static void main(String[] args) {
        Dept it = new Dept("Information Technology", "Kolkata", 2000);
        for (int i = 1; i <= 5; i++) {
            it.add(new Employee("Emp " + i, "ID" + i, "Street " + i, 5000.0f));
        }
        it.printAnnualBudget();
    }
}
