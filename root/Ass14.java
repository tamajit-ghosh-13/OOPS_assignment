package root;

class Complex {
    double real, imag;

    // (i) Initialize real and imaginary parts to 0
    Complex() { this.real = 0; this.imag = 0; }

    // (ii) Initialize imaginary part to 0, real part to user value
    Complex(double r) { this.real = r; this.imag = 0; }

    // (iii) Initialize both to user defined values
    Complex(double r, double i) { this.real = r; this.imag = i; }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    Complex multiply(Complex c) {
        double r = this.real * c.real - this.imag * c.imag;
        double i = this.real * c.imag + this.imag * c.real;
        return new Complex(r, i);
    }

    void print() { System.out.println(real + " + " + imag + "i"); }
}

public class ass14 {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(4, -2);
        System.out.print("Sum: "); c1.add(c2).print();
        System.out.print("Product: "); c1.multiply(c2).print();
    }
}
