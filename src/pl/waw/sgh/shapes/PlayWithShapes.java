package pl.waw.sgh.shapes;

public class PlayWithShapes {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setParams(4,6);
        Rectangle r2 = new Rectangle();
        r2.setParams(4,6);

        if (r1.equals(r2))
            System.out.println("r1 equal to r2");
/*        if (r1.isEqual(r2))
            System.out.println("r1 isEqual to r2");
*/
        Circle c1 = new Circle();
        //System.out.println(r1.calcSurface());
        System.out.println(r1);
        System.out.println(c1);

        c1.setParams(5,0);
        System.out.println(c1.calcSurface());

        Shape[] shapes = new Shape[4];
        shapes[0] = r1;
        shapes[1] = c1;
        shapes[2] = new Circle();
        shapes[2].setParams(2,0);
        shapes[3] = new NewRectangle();

        for (Shape s : shapes) {
            System.out.println("Shape: " + s);
            System.out.println("Surface: " + s.calcSurface());
            if (s instanceof Rectangle) {
                // System.out.println(((Circle)s).calcSurface());
                System.out.println("Perimeter: " + ((Rectangle)s).calcPerimeter()  );
            }
            System.out.println();
        }

        /*Shape s1 = new Shape();
        System.out.println(s1);*/
    }
}