package pl.waw.sgh;

public class ArraysToD {

    public static void main(String[] args) {

        int[][] arr2D = new int[3][4];
        int[] colSum =new int[arr2D[0].length];

        arr2D[0][3] = 56;
        arr2D[0][0] = 676;
        arr2D[1][1] = 596;
        arr2D[2][2] = 245;
        arr2D[2][3] = 867;
        int sum = 0;
        int x=0;


        System.out.println("Length of arr2D = " + arr2D.length);
        System.out.println("Cols of arr2D = " + arr2D[0].length);
        for (int i = 0; i < arr2D.length; i++) {

            //process every cell
            for (int j = 0; j < arr2D[0].length; j++) {
                System.out.print(arr2D[i][j] + "\t");// \t równe odstępy
                sum = sum + arr2D[i][j];
                colSum[j] += arr2D[i][j];
                /*v+= arr2D[i][j];*/
            }
                System.out.println("|  " + sum );
                sum = 0;
            }
            System.out.println("-----------------   =");
           for(int k=0;k<colSum.length;k++) {
               System.out.print( colSum[k]+"\t");
               x+= colSum[k];
           }
        System.out.println("=  "+x);
        }
    }


