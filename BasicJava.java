public class BasicJava{
    public void PrintTo255(){
        for(int i =1; i<=255; i++){
            System.out.println(i);
        }
    }
    public void PrintOddTo255(){
        for(int i =1; i<=255; i+=2){
            System.out.println(i);
        }
    }
    public void PrintSum(){
        int sum = 0;
        for(int i =0; i<=255; i++){
            sum = sum +i;
            System.out.println("New number: " + i + " Sum: "+ sum);
        }
    }
    public void IterateArray(int[] myArray){
        for(int i : myArray){
            System.out.println(i);
        }
    }
    public void FindMax(int[] myArray){
        int max = myArray[0];
        for(int i : myArray){
            if(max < i){
                max = i;
            }
        }
        System.out.println("Maximum Number is " + max);
    }
    public void GetAve(int[] myArray){
        float ave = 0;
        int  num = 0;
        for(int i : myArray){
            num += 1;
            ave += i;
        }
        ave = ave/num;
        System.out.println("The Average Number is " + ave);
    }
    public int[] OddArray(){
        int[] newArray;
        int idx = 0;
        newArray = new int[129];
        for(int i=1; i<=255; i+=2){
            newArray[idx] = i;
            System.out.println(idx + " " + newArray[idx]);
            idx += 1;
        }

        return newArray;
    }
    public void GreaterThanY(int[] myArray, int searchValue){
        int count = 0;
        for(int i : myArray){
            if( i > searchValue){
                count += 1;
            }
        }
        System.out.println("I counted " + count + " Array elements greater then " + searchValue);
    }
    public int[] SquareArray(int[] myArray){
        int idx =0;
        for(int i : myArray){
            myArray[idx] = i*i;
            System.out.println(myArray[idx]);
            idx +=1;
        }
        return myArray;
    }
    int[] negativeArray = {-3,-2,-5,1,16};
    public int[] EliminateNegativesFromArray(int[] negativeyArray){
        int idx = 0;
        for(int i : negativeArray){
            if( i < 0){
                negativeArray[idx] = 0;
            }
            System.out.println(negativeArray[idx]);
            idx +=1;
        }
        return negativeArray;
    }
    
    public int[] MaxMinAvg(int[] x){
        int[] myProduct = {x[0], x[0], 0};
        int count = 0;
        for(int i : x){
            if(i > myProduct[0]){myProduct[0] = i;}
            if(i < myProduct[1]){myProduct[1] = i;}
            myProduct[2] += i;
            count += 1;
        }
        myProduct[2] = myProduct[2]/count;
        return myProduct;
    }
    public int[] ShiftValuesInArray(int[] x){
        int idx = 0;
        for(int i=0; i< x.length-1; i++){
            x[i] = x[i+1];
        }
        x[x.length-1] = 0;
        return x;
    }
}