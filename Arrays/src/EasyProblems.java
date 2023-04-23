import java.util.ArrayList;
import java.util.Arrays;

public class EasyProblems {
    /***
     * here started easy problems
     * lets go thorough it
     * learns easy and basic datastructures and learn very fast
     * @param args
     */


    // let's say write some easy problems and solution best time complexity


    // 1st problem
    //
  /*  Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

    In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

    Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

    Example 1:

    Input:
    N = 5, S = 12
    A[] = {1,2,3,7,5}
    Output: 2 4
    Explanation: The sum of elements
    from 2nd position to 4th position
    is 12.


    Example 2:

    Input:
    N = 10, S = 15
    A[] = {1,2,3,4,5,6,7,8,9,10}
    Output: 1 5
    Explanation: The sum of elements
    from 1st position to 5th position
    is 15.


    Your Task:
    You don't need to read input or print anything. The task is to complete the function subarraySum() which takes arr, N,
    and S as input parameters and returns an ArrayList containing the starting and ending positions of the first such occurring subarray
    from the left where sum equals to S. The two indexes in the array should be according to 1-based indexing. If no such subarray is found,
    return an array consisting of only one element that is -1.*/


   public static ArrayList<Integer> subarraySum(int[] arr, int len, int key){
       // lets create ArrayList
       ArrayList<Integer>  result = new ArrayList<>();
       // lets declare variables to store values
       int sum =0;
       int left =0;
       // validation to if key sum is zero return the -1
       if(key == 0){
           result.add(-1);
           return result;
       }
        // intput 1 2 3 4 5; key is 10; 1+2+3+4 = 10; sum the values
       for(int i=0; i< len; i++){
           sum+= arr[i];
           while(sum>key){
               sum -= arr[left++];
           }
           // adding index positions
           if(sum == key){
               result.add(left+1);
               result.add(i+1);
               return result;
           }
       }
       // for returning the method
       result.add(-1);
       return result;
    }

    /*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

    Example 1:

    Input:
    N = 5
    A[] = {1,2,3,5}
    Output: 4
    Example 2:

    Input:
    N = 10
    A[] = {6,1,2,8,3,4,7,10,5}
    Output: 9*/

    // missing array Element wrong solution

    /*
    public static int  missingArrayElement(int[] arr, int len){
        Arrays.sort(arr);
        int temp = 0;
        int count = arr[0];
        int hh = 0;
        for(int i=0; i<len; i++){
            // 1 2 3 5
            if(arr[i] == count+hh){
                temp = count + hh++;

            }else{
                temp = count+1;
            }
        }
        System.out.println("this is the missing array element : "+temp);
        return  temp;
    }
  */

    public static int  missingArrayElement(int[] arr, int len){

        int sum =0;
        for(int i=0; i<len-1; i++){
            sum+=arr[i];
        }
        int miss = (len*(len+1))/2;
        int x = miss-sum;
        System.out.println("this is the missing array element : "+ x );
        return x;

    }

    // 3rd Easy problem Sort an array of 0s, 1s and 2s
   /* Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
    Example 1:
    Input:
    N = 5
    arr[]= {0 2 1 2 0}
    Output:
            0 0 1 2 2
    Explanation:
            0s 1s and 2s are segregated
    into ascending order.
            Example 2:

    Input:
    N = 3
    arr[] = {0 1 0}
    Output:
            0 0 1
    Explanation:
            0s 1s and 2s are segregated
    into ascending order.*/

    public static void sort012(int[] arr, int len){
        /**
         * Arrays sort method also working
         * but its not good approach to solve DSA problems
         */
        // Arrays.sort(arr);

        // lets develop

        // time limit exceeded
        int temp = 0;
        for(int i=0; i<len-1; i++){
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i= -1;
            }
        }
        for(int aa: arr){
            System.out.print(aa+ " ");
        }
    }

 // correct solution

    public static void sort012222(int[] arr, int len){
     //   Arrays.sort(a);
     int high = len-1;
     int mid = 0;
     int low = 0;
     while(mid <= high){
         switch(arr[mid]){
             case 0:
                 swap(arr, low++, mid++);
                 break;
             case 1:
                 mid++;
                 break;
             case 2:
                 swap(arr, mid, high--);
                 break;
         }
     }
 }

    // swap Call
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }





    /**
     * main method started here
     * @param args
     */
    public static void main(String[] args) {
       // add sum of array elements subarraySum
        int[] arr ={23,4,5,7,8,2};
        int len =6;
        int key = 16;
        subarraySum(arr,len,key);

        // missing array element
        int[] arrMaE = {1,2,3,4,5,6,7,8,10};
        int lenMaE = 9;
        missingArrayElement(arrMaE, lenMaE);

        // sort the 012 s
        int[] arrSort ={ 10,11,2,20,1,30,13};
        int lenSort = 7;
        sort012(arrSort, lenSort);
        // 2nd solution
        sort012222(arrSort, lenSort);


    }
}
