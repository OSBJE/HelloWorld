import java.util.Arrays;

public class ArraysLoops {

    public static void main(String[] args){

        int[] EmptyArray = new int[8];

        EmptyArray[0] = 34;
        EmptyArray[7] = 117;

        System.out.println(EmptyArray[7]);

        for (int i = 0; i < EmptyArray.length; i++) {
            System.out.println((EmptyArray[i]));
        }

        String[] HejMedDig = {"Hej", "med", "dig"};
        System.out.println(java.util.Arrays.toString(HejMedDig));

        String outArray = "";

        for (String word : HejMedDig){
            outArray += word;
            outArray += " ";
        }

        System.out.println(outArray);

        double[] NumberArray = {3.4 , 2.5, 1.2, 6.7};

        System.out.println(NumberArray[2]);

        System.out.println(NumberArray.length);

        // System.out.println(NumberArray[4]);


    }
}
