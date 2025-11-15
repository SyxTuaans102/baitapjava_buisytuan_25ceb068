public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal() {
        return this.imag == 0.0;
    }

    public boolean isImaginary() {
        return this.imag == 0.0;
    }

    public boolean equals(double real, double imag) {
        this.real = real;
        this.imag = imag;
        return this.real == this.imag;
    }

    public boolean equals(MyComplex another) {
        this.real = another.real;
        this.imag = another.imag;
        return this.real == this.imag;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        this.real *= right.real;
        this.imag *= right.imag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        this.real /= right.real;
        this.imag /= right.imag;
        return this;
    }

    public MyComplex conjugate() {
        this.real *= -1;
        this.imag *= -1;
        return this;
    }

    @Override
    public String toString() {
        return "(" + real + imag + ')' + ", eg.., " + "(3 + 4i)";
    }
}
