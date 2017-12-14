package pl.waw.sgh;

public class TestCountingPoint {

    public static void main(String[] args) {

        int[] testPoints = new int[]{50, 120, 450, 1090, 1200};
        for (int p : testPoints) {
            System.out.println("For " + p + " impPoints: " + ImpTable.getInstance().getImpPoints(p));
        }
        ImpTable.printTable();


    }
}