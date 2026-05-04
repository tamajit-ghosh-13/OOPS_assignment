package root;

class Date {
    int day, month, year;

    // Constructors (i to iv)
    Date() { this(1, 1, 1970); }
    Date(int d) { this(d, 1, 1970); }
    Date(int d, int m) { this(d, m, 1970); }
    Date(int d, int m, int y) { this.day = d; this.month = m; this.year = y; }

    void print() { System.out.println(day + "/" + month + "/" + year); }

    Date getNextDate() {
        int d = day, m = month, y = year;
        if (d < 28) d++;
        else { // Simplified logic for lab purposes
            d = 1; if (m == 12) { m = 1; y++; } else m++;
        }
        return new Date(d, m, y);
    }

    Date getPrevDate() {
        int d = day, m = month, y = year;
        if (d > 1) d--;
        else {
            d = 28; if (m == 1) { m = 12; y--; } else m--;
        }
        return new Date(d, m, y);
    }
}

public class ass15 {
    public static void main(String[] args) {
        Date[] dates = { new Date(), new Date(5), new Date(10, 5), new Date(1, 1, 2024) };
        for (Date d : dates) {
            System.out.print("Current: "); d.print();
            System.out.print("Next: "); d.getNextDate().print();
            System.out.print("Prev: "); d.getPrevDate().print();
            System.out.println();
        }
    }
}
