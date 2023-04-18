import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysBasic {


    /***
     *
     * @param args
     * Arrays Basics
     * Started 16/04/2023
     */

    //Binary Search
   /* Given a sorted array of size N and an integer K, find the position(0-based indexing)
    at which K is present in the array using binary search.

    Example 1:

    Input:
    N = 5
    arr[] = {1 2 3 4 5}
    K = 4
    Output: 3
    Explanation: 4 appears at index 3.

    Example 2:

    Input:
    N = 5
    arr[] = {11 22 33 44 55}
    K = 445
    Output: -1
    Explanation: 445 is not present.

    Your Task:
    You dont need to read input or print anything. Complete the function binarysearch() which takes arr[],
    N and K as input parameters and returns the index of K in the array. If K is not present in the array, return -1.


    Expected Time Complexity: O(LogN)
    Expected Auxiliary Space: O(LogN) if solving recursively and O(1) otherwise.*/

    // 1st problem Binary Search
    public  static  int binarySearchIndex(int[] arr,int len, int key){
        // -1 for if key is not match with given array its pring -1;
        int temp = -1;
        for(int i=0; i<len; i++){
            if(arr[i] == key){
                temp =i;
            }
        }
        return  temp;
    }
    // let's try by using recursion;
    public static int binarySearchIndex2(int[] arr, int len, int key){
        // recursion
        int temp = -1;
        /*if(len !=0){
            if(arr[len-1] == key){
                System.out.println(arr[len-1]);
              return temp =arr[len-1];
            }
       } */
  //   return  binarySearchIndex2(arr,len-1, key);
        System.out.println(helper(arr, len, key));
       return helper(arr, len ,key);
   // return temp;
    }

    // helper method
    public static int helper(int[] arr, int len, int key){
        //int len = arr.length;
        int temp = -1;
        if(len != 0){
            if(arr[len-1] == key){
                return  temp = arr[len-2];
            }
            return helper(arr,len-1, key);
        }
        return temp;
    }

    // Check if two arrays are equal or not

    /*Example 1:

    Input:
    N = 5
    A[] = {1,2,5,4,0}
    B[] = {2,4,5,0,1}
    Output: 1
    Explanation: Both the array can be
    rearranged to {0,1,2,4,5}
    Example 2:

    Input:
    N = 3
    A[] = {1,2,5}
    B[] = {2,4,15}
    Output: 0
    Explanation: A[] and B[] have only
    one common value.*/
    public static boolean check(long[] A, long[] B, int N){
        // lets Sort the Arrays
        Arrays.sort(A);
        Arrays.sort(B);
        boolean result = Arrays.equals(A, B);
        System.out.println(result);
        return result;
    }



    //3rd question Reverse array in groups
  /*  Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

            Note: If at any instance, there are no more subarrays of size greater than or equal to K,
             then reverse the last subarray (irrespective of its size). You shouldn't return any array,
             modify the given array in-place.

    Example 1:

    Input:
    N = 5, K = 3
    arr[] = {1,2,3,4,5}
    Output: 3 2 1 5 4
    Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.

    Example 2:

    Input:
    N = 4, K = 3
    arr[] = {5,6,8,9}
    Output: 8 6 5 9


    Your Task:
    You don't need to read input or print anything. The task is to complete the function reverseInGroups()
    which takes the array, N and K as input parameters and modifies the array in-place. */

   public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int len =0;
        int m = Math.min(n,k);
        while(len<=m){
            Collections.swap(arr,m-1,len);
            len+=k;
            m = Math.min((m+k),n);
        }
    }
   // correct solution
   public static void reverseInGroups2(ArrayList<Integer> arr, int n, int k) {
     for(int i=0;i<n;i=i+k) {
         int left=i;
         int right=Math.min(n-1,k+i-1);
         while(left<right) {
             Collections.swap(arr,left++,right--);
         }
     }
  }


   // 4th problem Search an Element in an array
 /*  Given an integer array and another integer element. The task is to find if the given element is present in array or not.

            Example 1:

    Input:
    n = 4
    arr[] = {1,2,3,4}
    x = 3
    Output: 2
    Explanation: There is one test case
    with array as {1, 2, 3 4} and element
    to be searched as 3.  Since 3 is
    present at index 2, output is 2.
    Example 2:

    Input:
    n = 5
    arr[] = {1,2,3,4,5}
    x = 5
    Output: 4
    Explanation: For array elements
    {1,2,3,4,5} element to be searched
    is 5 and it is at index 4. So, the
    output is 4.
    Your Task:
    The task is to complete the function search() which takes the array arr[], its size N and the element X as inputs and returns
     the index of first occurrence of X in the given array. If the element X does not exist in the array, the function should return -1

*/
   public static int search(int[] arr, int len, int key){
       int temp=0;
       for(int i=0; i<len; i++){
           if(arr[i] == key){
               temp = i;
               break;
           }else{
               temp = -1;
           }
       }
       return temp;
   }

   // recursion
    public static int search1(int[] arr, int len, int key){
       int temp =0;
       if(len != -1){
           if(arr[len-1] == key){
               temp = len;
           }else{
               temp = -1;
           }
           search(arr,--len,key);
       }
       return temp;
    }


// 5th problem   Cyclically rotate an array by one
/*Given an array, rotate the array by one position in clock-wise direction.


    Example 1:

    Input:
    N = 5
    A[] = {1, 2, 3, 4, 5}
    Output:
            5 1 2 3 4


    Example 2:

    Input:
    N = 8
    A[] = {9, 8, 7, 6, 4, 2, 1, 3}
    Output:
            3 9 8 7 6 4 2 1*/
     public static void rotate(int[] arr, int n){
         int first = arr[n-1];
         for(int i=n-1; i>0; i--){
             arr[i] = arr[i-1];
         }
         arr[0] =first;
     }

     // 6th problem Find minimum and maximum element in an array
    /* Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.



            Example 1:

    Input:
    N = 6
    A[] = {3, 2, 1, 56, 10000, 167}
    Output:
    min = 1, max =  10000
//User function Template for Java

/*
 class pair
{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}


   class Compute
 {
   // static pair getMinMax(long a[], long n)
    {

*/

    public static long[] getMinMax(long arr[], long len){
        /*  pair class object return type*/
            long[] getmm = new long[1];
            int arrLen = arr.length;
            Arrays.sort(arr);
            long min = arr[0];
            long max = arr[arrLen-1];
            getmm[0]= min;
            getmm[1]= max;
            return getmm;
    }










    public static void main(String[] args) {
        System.out.println("Ishq love ------");
        // 1st solution
        // indexpos  0 1 2 3 4 5 6 7 8 9
        int[] arr=  {1,2,3,4,5,6,7,8,9,10};
        int len = 10;
        int key =10;
        binarySearchIndex(arr, len, key);
        // recursion
        binarySearchIndex2(arr, len, key);

        // Array equals
        long[] A = {1,3,2,7,4,6,5};
        long[] B = {2,1,4,3,6,5,7};
        int N = 7;
        check(A,B,N);

        // 3rd solution
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(12);
        arrlist.add(11);
        arrlist.add(10);
        arrlist.add(9);
        int lens = 4;
        int arrKey = 10;
        reverseInGroups2(arrlist,lens,arrKey);


        // Search an Element in an array
        int[] arrSearch = {1,2,3,4,5,6,7,8,9,10};
        int lenSer = 10;
        int keySarch =9;
        search( arrSearch,  lenSer,  keySarch);


        // fifth problem solution
        int[] arrRo ={1,2,3,4,5};
        int lenRo = 5;
        rotate(arrRo,lenRo);

        // get min max
        long[] arrMin = {10,200,300,400,1000};
        long minLen = 5;
        getMinMax(arrMin, minLen);

    }
}
