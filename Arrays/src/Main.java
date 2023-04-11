import java.net.StandardSocketOptions;
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

    // fifth problem  Print alternate elements of an array

    public static void alternateElements(int[] arr, int n){
        for(int i=0; i<n; i+=2){
            System.out.print(arr[i]+" ");
        }
    }

    //Palindromic Array

    /**
     * palindromic array we need to check the every array number is palindrome or not
     * if we will go old approach it may takes more time and space
     * we will go String classes, we have string function .reverse() this fun will reverse the object
     * lets do it
     * @param args
     */

    public static  int palindromicArray(int[] arr, int len){
        StringBuilder stringBuilder = new StringBuilder();
        int rev=0;
        for(int i=0; i<len; i++){
            stringBuilder.append(arr[i]).reverse();
            rev = Integer.parseInt(stringBuilder.toString());
            if(arr[i] != rev){
                return 0;
            }
            stringBuilder.setLength(0);
        }
        return 1;
    }

    // Arrays (Sum of array)
    public  static  long sumOfArray(long[] arr, int len){
        long sum = 0;
        for(int i=0; i<len; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        // array un-sorted array
        int[] arr = {121,222,111};
        // here higest is 12 and second highest is 11, our required output is 11;
        int len = arr.length;
        secondLarg(arr,len);

        // Second sum------------------------
        int num = 5;
        seriesOfSum(num);
        seriesOfSum2(num);

        // third sum-----------------------------
        indexValueEqualsToPostion( arr, len);

        // four sum--------
        sumOfArrayElements( arr,  len);

        // fifth problem---
       alternateElements(arr,len);

        // sixth problem ---------------
        palindromicArray(arr,len);

        // seventh problem
        long[] arr1 ={1,3,4,5,6,7,20};
        int len1 = 7;
        sumOfArray(arr1,len1);
    }
}