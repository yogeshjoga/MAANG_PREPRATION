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

    }
}
