package pl.waw.sgh.shapes;

public class PlayWithShapes {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setParams(4, 6);
        Rectangle r2 = new Rectangle();
        r2.setParams(4,6);
        //new Rectangle();

        if (r1.equals(r2))
        System.out.println("r1 equal to r2 ");
        /*System.out.println(r1.calcSurface());*/
        System.out.println(r1);
    }
}