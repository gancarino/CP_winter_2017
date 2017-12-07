package pl.waw.sgh.shapes;

public class triangle extends Shape {


    @Override
    public double calcSurface() {
        double x= parA*parB*1/2;
        return x;
    }
}
