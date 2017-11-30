package pl.waw.sgh.shapes;

public class Shape {

    double parA;
    double parB;

    public void setParams(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    //@Override
    public String toString() {
        return "Shape{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        if (Double.compare(shape.parA, parA) != 0) return false;
        return Double.compare(shape.parB, parB) == 0;
    }

}
