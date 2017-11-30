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
}
