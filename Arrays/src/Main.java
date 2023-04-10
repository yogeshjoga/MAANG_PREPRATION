import java.util.ArrayList;

public class Main {
    /**
     *
     * @Author Yogesh Joga
     *  Solving Geeks for Geeks
     *  Arrays School level problems
     *  started 09/04/2023
     *  lets start daily one problem
     */

    // problem is Second-Largest number in array
    public static int secondLarg(int[] arr, int len){
        int prev = -1;
        int max = arr[0];
        for(int i=0; i<len-1; i++){
            if(arr[i] > max){
                prev = max;
                max = arr[i];
            } else if (arr[i] < max && prev < arr[i]  ) {
                prev = arr[i];
            }
        }

        return prev;
    }

        // Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
        // example: input 5, 1+2+3+4+5 = 15;  1 = 1; input: 2, 1+2 = 3;
    public static long seriesOfSum(int num){
        long sum = 0;
        // input 5: 1+2+3+4+5 = 15
        for(int i=1; i<=num; i++){
            sum += i;
        }
        return sum;
    }

    public static long seriesOfSum2(int num){
        long sum = 0;
        // second approach from MATHS
        // input 5: 1+2+3+4+5 = 15
        return sum * (sum+1)/2;
    }


    // problem three Find index postion
    // Value equal to index value Ex: arr 12,32,3,45,67 --> the index position 3 is equal to index value
    public  static ArrayList<Integer> indexValueEqualsToPostion(int[] arr, int len){
        // lets create new ArrayList to return the values and simple to add the index positions
        ArrayList<Integer> indexValue = new ArrayList<>();
        for (int i=0; i<len; i++){
            if(arr[i] == i+1){
                indexValue.add(i+1);
            }
        }
        return  indexValue;
    }


    // problem four sum of array elements
    public  static  int sumOfArrayElements(int[] arr, int len){
        int sum =0;
        for(int i=0; i<len; i++){
            sum+=arr[i];
        }
        return  sum;
    }


    public static void main(String[] args) {

        System.out.println("Hello world!");

        // array un-sorted array
        int[] arr = {2,2,1};
        // here higest is 12 and second highest is 11, our required output is 11;
        int len = arr.length;
    //    secondLarg(arr,len);

        // Second sum------------------------
        int num = 5;
       // seriesOfSum(num);
     //   seriesOfSum2(num);

        // third sum-----------------------------
     //   indexValueEqualsToPostion( arr, len);

        // four sum--------
        sumOfArrayElements( arr,  len);

    }
}