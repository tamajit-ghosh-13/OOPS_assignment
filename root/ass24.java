package root;

interface Fruit { void hasAPeel(); }
interface Vegetable { void hasARoot(); }

class Tomato implements Fruit, Vegetable {
    public void hasAPeel() { System.out.println("Tomato: Technically a fruit, it has a thin peel."); }
    public void hasARoot() { System.out.println("Tomato: As a plant, it grows from a root system."); }
}

public class ass24 {
    public static void main(String[] args) {
        Tomato t = new Tomato();
        t.hasAPeel();
        t.hasARoot();
    }
}
