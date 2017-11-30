package pl.waw.sgh.shapes;

public class Rectangle extends Shape {

/*
    double parA;
    double parB;
*/

    public Rectangle() {
        this.parA = 10;
        this.parB = 15;
    }

    public double calcSurface() {
        return parA * parB;
    }

    public double calcPerimeter() {
        return 2*parA + 2*parB;
    }



    @Override
    public String toString() {
        return "Shape{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}
