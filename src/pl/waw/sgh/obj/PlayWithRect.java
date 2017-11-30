package pl.waw.sgh.obj;

public class PlayWithRect {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setParams(3,5);
        double r1Surface = r1.calcSurface();
        System.out.println(r1Surface);

        Rectangle r2 = new Rectangle();
        r2.setParams(4,6);
        r2.sideA = 10; // A = 4, became 10
        System.out.println(r2.calcSurface());

        Rectangle r3 = new Rectangle();
        System.out.println(r3.calcSurface());



    }
}
