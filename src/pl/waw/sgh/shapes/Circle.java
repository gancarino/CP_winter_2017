package pl.waw.sgh.shapes;

public class  Circle extends Shape {


    @Override
    public double calcSurface() {
        return Math.PI*Math.pow(parA,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }


}
