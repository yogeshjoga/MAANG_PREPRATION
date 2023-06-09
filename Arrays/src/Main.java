import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /**
     *
     * @Author Yogesh Joga
     *  Solving Geeks for Geeks
     *  Arrays School level problems
     *  started 09/04/2023
     *  lets start daily one problem
     *
     *  this class contains only School level problems based on Arrays concept
     *  from Geeks for Geeks
     *  Arrays, School level problems
     *  ordering from GFG..
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
     *
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


    // Count of smaller elements
    public static long smallerElement(long[] arr, long len, long key){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= key) {
                count = i + 1;
            }
        }
        return  count;
    }

    // 9th sum of array
    public  static int sumOfArrays(int[] arr, int len){
        int sum =0;
        for(int i=0; i<len; i++){
            sum+=arr[i];
        }
        return sum;
    }

    // 10th problem
    public static void arrayElementsPrint(int[] arr, int len){
        // im using for each loop
        for (int pr: arr){
            System.out.println(pr+" ");
        }
    }

    // 11th Swap kth elements
    /**
     * Input:
     *     N = 8, K = 3
     *     Arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
     *     Output: 1 2 6 4 5 3 7 8
     *     Explanation: Kth element from beginning is
     *    3 and from end is 6.
     */
    public  static  void swapKthElement(int[] arr, int len, int key){
        int temp = arr[key-1];
        arr[key-1] = arr[len - key];
        arr[len - key] = temp;

    }

    // 12 th problem Display longest name
    public static String displayLongestName(String[] names, int len){
        String temp = names[0];
        for(int i=0; i<len; i++){
            if(names[i].length() >= temp.length()){
                temp = names[i];
            }
        }
       // System.out.println(temp);
        return temp;
    }

    // 13th problem Find Index
    public static int[] findIndex(int[] arr, int len, int key){
        int[] findInd = new int[len];
        int temp =0;
        for(int i=0; i<len; i++){
            if(arr[i]==key){
                findInd[temp] =i;
                temp++;
            }
        }
        for (int arr22212: findInd) {
            System.out.println(arr22212);
        }

        return findInd;
    }

    // this is right solution
   public static int[] findIndex2(int[] a, int N, int key) {
        int[] start ={-1,-1};
        int flag = 0;
        for(int i=0;i<N;i++){
            if(a[i]==key && flag == 0 ){
                start[0] = i;
                flag = 1;
            }
            if(a[i]==key){
                start[1] = i;
            }
        }
        return start;
    }

    // Is perfect array
    public static boolean isPerfectArray(int[] arr, int len){
        int[] rev = new int[len];
        int temp =0;
        for (int i=len-1; i>=0; i--){

                rev[temp] = arr[i];
                temp++;
            }
       // if(rev == arr){
        if(Arrays.equals(rev, arr)){
            System.out.println("ture");
            return true;
        }
        System.out.println("false");
        return false;
    }

   // At least two greater elements
  /* Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.


    Example 1:

    Input :
    a[] = {2, 8, 7, 1, 5}
    Output :
            1 2 5
    Explanation :
    The output three elements have two or
    more greater elements.
    --------------------
    Example 2:
    Input :
    a[] = {7, -2, 3, 4, 9, -1}
    Output :
       -2 -1 3 4*/

     public static long[] twoGraterElements(long[] arr, long len){
        long[] great = new long[arr.length-2];
        Arrays.sort(arr);
        for(int i=0; i<len-2; i++){
            great[i] = arr[i];
        }
         System.out.println("Greater elements are printed ");
        for(long pr : great){
            System.out.println(pr);
        }
        return great;
     }

     //Smaller and Larger
    public static int[] smallerAndlarger(int[] arr, int len, int key){
         int f = 0;
         int l = 0;
         for(int i=0; i<len; i++){
             if(arr[i] >= key ){
                 f++;
             }
             if(arr[i] <= key){
                 l++;
             }
         }
         return new int[] {f,l};
    }
    // Java Arrays | Set 1
   /* For a given array of price of items,you have to calculate the average of all prices upto 2 decimal places.
    Note: Sum is printed automatically, you only need to calculate and return the average



    Example 1:

    Input:
            5
            1 2 3 4 5
    Output:
            15 3.00
    Explanation:
    Sum of the array is 15, hence
    average is 15/5=3.00.

    Example 2:

    Input:
            9
            2 55 85 656 52 554 545 5 2
    Output:
            1956 217.33
    Explanation:
    Sum of the array is 1956, hence
    average is 1956/9= 217.33.*/

    public static String sumArrDiv(int[] arr, int len){
        float temp =0;
        for(int i=0; i<len; i++){
            temp+= arr[i];
        }
        return String.format("%.2f",temp/len);
    }

    // Print the left element
   /* Given a array of length N, at each step it is reduced by 1 element. In the first step the maximum element would be removed,
    while in the second step minimum element of the remaining array would be removed,
   in the third step again the maximum and so on. Continue this till the array contains only 1 element.
    And find the final element remaining in the array.

    Example 1:
    Input:
    N = 7
    A[] = {7, 8, 3, 4, 2, 9, 5}
    Ouput:
            5
    Explanation:
    In first step '9' would be removed, in 2nd step
    '2' will be removed, in third step '8' will be
    removed and so on. So the last remaining
    element would be '5'.

    Example 2:
    Input:
    N = 8
    A[] = {8, 1, 2, 9, 4, 3, 7, 5}
    Ouput:
            4*/
    public static long leftElement(long[] arr, long len){
        Arrays.sort(arr);
        int temp = arr.length;
        // print left element
        return (len%2==0)?(arr[temp/2-1]):(arr[temp/2]);
    }


   /* Given a number N. Your task is to check whether it is fascinating or not.
    Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3,
     and when both these products are concatenated with the original number,
     then it results in all digits from 1 to 9 present exactly once.

     Example 1:

    Input:
    N = 192
    Output: Fascinating
    Explanation: After multiplication with 2
    and 3, and concatenating with original
    number, number will become 192384576
    which contains all digits from 1 to 9.

    Example 2:

    Input:
    N = 853
    Output: Not Fascinating
    Explanation: It's not a fascinating
    number.
    Your Task:
    You don't need to read input or print anything. Your task is to complete the function fascinating()
     which takes the integer n parameters and returns boolean(True or False) denoting the answer.
*/

   public static boolean fascinating(long num) {
       // answer seen
        if(num>=0 && num<=99) return false;
        long pluse3 = num*3;
        long pluse2 =num*2;
        String s = num+ ""+pluse2+""+pluse3;
        int[] arr = new int [10];
        for(int i=0; i<9; i++) arr[i] =s.charAt(i)-48;
        Arrays.sort(arr);
        for(int i=0; i<9; i++) if(arr[i] !=i) return false;
        return true;

    }

   /* Given a stream of incoming numbers, find average or mean of the stream at every point.
     Example 1:
    Input:
    n = 5
    arr[] = {10, 20, 30, 40, 50}
    Output: 10.00 15.00 20.00 25.00 30.00
    Explanation:
            10 / 1 = 10.00
            (10 + 20) / 2 = 15.00
            (10 + 20 + 30) / 3 = 20.00
    And so on.

     Example 2:
    Input:
    n = 2
    arr[] = {12, 2}
    Output: 12.00 7.00
    Explanation:
            12 / 1 = 12.00
            (12 + 2) / 2 = 7.00


    Your Task:
    You don't need to read input or print anything. Your task is to complete the function streamAvg()
     which takes the array of integers arr and n as input parameters and returns an array of type float
     denoting the average at every point in the stream.

*/
    //Average in a stream
    public static float[] avgInStream(int[] arr, int len){
        float temp =0;
        float[] sum = new float[len];
        for(int i=0; i<len; i++){
            temp+=arr[i];
            sum[i] = temp/(i+1);
        }
        return sum;
    }


    //

   /* A and B are good friend and programmers. They are always in a healthy competition with each other.
    They decide to judge the best among them by competing. They do so by comparing their three skills as per their values.
    Please help them doing so as they are busy.Set for A are like [a1, a2, a3]
    Set for B are like [b1, b2, b3]

    Compare ith skill of A with ith skill of B
            if a[i] > b[i] , A's score increases by 1
            if a[i] < b[i] , B's score increases by 1
            if a[i] = b[i] , nothing happens

    Example 1:

    Input :
    A = {4, 2, 7}
    B = {5, 6, 3}
    Output :
            1 2

    Example 2:

    Input :
    A = {4, 2, 7}
    B = {5, 2, 8}
    Output :
            0 2

    Your Task:
    You don't need to read input or print anything. Your task is to complete the function scores()
    which takes the array A[], B[] as inputs and two reference variables ca and cb to store the final answer.
    Store the score of A in ca and score of B in cb.*/


    public static void scores(long[] a, long[] b) {
        // store the answer as
        // GFG.ca=3;
        // GFG.cb=5;
        // Your code goes here

     int [] res = new int[2];

      // GFG.ca=0;  this is for GFG code input variables
      //  GFG.cb=0;
       int temp =0;
       int temp1= 0;

        for(int i=0; i<a.length; i++){
            if(a[i] > b[i]){
                temp++;
              //  GFG.ca++;
            }if(a[i] < b[i]){
                temp1++;
             //   GFG.cb++;
            }
            res[0]= temp;
            res[1]= temp1;

        }
    }





    // MAIN method started

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

        // 8th problem
        long [] arr2 ={ 1,2,3,4,5,6,8,9,10,11};
        long len2 = 10;
        long key = 9;
        smallerElement(arr2,len2, key);

        //9th problem sum of array elements
        sumOfArrays(arr, len);

        // 10th problem
        arrayElementsPrint(arr, len);

        // 11th problem
        int key1= 3;
        swapKthElement(arr, len, key1);

        //12th problem the largest String name
        String[] names ={ "yogi", "hello", "deart", "yogesh Billa", "i love you siri"};
        int lent = 5;
        displayLongestName(names, lent);

        ///
        int[] arr22 ={1,10,122,122,3232,34,53,534,5343,34,645,4645,4545,6454,4545,6454,56,10};
        int len22 = arr22.length;
        int key2 = 10;
        findIndex( arr22,  len22,  key2);


        int[] perfectArr = {1,2,3,2,1};
        int arrLen = 5;
        isPerfectArray(perfectArr, arrLen);


        // greatest elements
        long[] arra2 = {1,5,6,9,0,4,3,10};
        long grat1 = arra2.length;
        twoGraterElements(arra2, grat1);

        // array set
        sumArrDiv(arr, len);


        // print Left Element
        long[] arrLong = {1,5,2,3,7,9,6,4};
        long lenArr = 8;
        leftElement(arrLong,lenArr);

        // fascinating number
        fascinating(lenArr);

        // Average in a stream
        avgInStream( arr,  len);

        // 22 problem
        // arrays completed
        long[] yogi ={1,2,3,4};
        long[] balu ={11,2,31,4};
        scores( yogi,  balu);



    }
}