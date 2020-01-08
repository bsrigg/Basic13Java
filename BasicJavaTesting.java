public class BasicJavaTesting{
    public static void main(String[] args){
        BasicJava bJ = new BasicJava();
        bJ.PrintTo255();
        bJ.PrintOddTo255();
        bJ.PrintSum();
        int[] myArray = {1,3,5,-7,9,13};
        bJ.IterateArray(myArray);
        bJ.FindMax(myArray);
        bJ.GetAve(myArray);
        System.out.println(bJ.OddArray());
        bJ.GreaterThanY(myArray, 5);
        int[] newArray = bJ.SquareArray(myArray);
        for(int i : newArray){
            System.out.println(i);
        }
        int[] nextArray = bJ.EliminateNegativesFromArray(myArray);
        for(int i : nextArray){
            System.out.println(i);
        }
        int[] x = {1,5,10,-2};
        int[] thirdArray = bJ.MaxMinAvg(x);
        for(int i : thirdArray){
            System.out.println(i);
        }
        int[] b = {1,5,10,-2,20,500,5};
        int[] finalArray = bJ.ShiftValuesInArray(b);
        for(int i : finalArray){
            System.out.println(i);
        }
    }
}