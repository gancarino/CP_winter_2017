package pl.waw.sgh;

public class Arrays {

    public static Double sumDoubles(Double[] arr) {

        Double sum =0d;
        // Take each element from arr and reference it as el
        for (Double el : arr) {
            sum += el;
            }

        return sum;

    }


    public static void main(String[] args) {
        // Primitive  type int
        /*int[] myIntArr = new int[5];*/
        // object oriented
        Integer[] myIntArr = new Integer[5];

        Double[] myDbArr = new Double[] {3223.5, 535.45, 56546.65 };

        myIntArr[0] = 4343;
        myIntArr[1] = 523453;
        myIntArr[2] = 34134;

        Integer sum = 0;

        for(int i=0; i<myIntArr.length; i++)  {
            System.out.println("myIntArr, element " + i + "=" + myIntArr[i] );
            if(myIntArr[i]!=null) {
                sum=sum+myIntArr[i];
            }

            //Equivalent
            //sum+=myIntArr[i];
        }
        System.out.println("Sum:" + sum);

        Double sumD = sumDoubles(myDbArr);
        System.out.println("Sum of Doubles ="+ sumD);
    }
}
