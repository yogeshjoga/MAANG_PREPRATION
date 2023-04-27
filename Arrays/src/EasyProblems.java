import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

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


    // 4th problem

    /*Given an array A of positive integers.
    Your task is to find the leaders in the array.
    An element of array is leader if it is greater than or equal to all the elements to its right side.
     The rightmost element is always a leader.

    Example 1:
    Input:
    n = 6
    A[] = {16,17,4,3,5,2}
    Output: 17 5 2
    Explanation: The first leader is 17
    as it is greater than all the elements
    to its right.  Similarly, the next
    leader is 5. The right most element
    is always a leader so it is also
    included.


    Example 2:
    Input:
    n = 5
    A[] = {1,2,3,4,0}
    Output: 4 0


    Your Task:
    You don't need to read input or print anything.
     The task is to complete the function leader()
      which takes array A and n as input parameters and returns
      an array of leaders in order of their appearance.

*/
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[n-1];
        result.add(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            if(arr[i] >= max){
                max = arr[i];
                result.add(arr[i]);
            }
        }
        Collections.reverse(result);
        return result;
    }

/*
    Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array.
    Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

            Note: Retun the index of Equilibrium point. (1-based index)

    Example 1:

    Input:
    n = 5
    A[] = {1,3,5,2,2}
    Output: 3
    Explanation:
    equilibrium point is at position 3
    as elements before it (1+3) =
    elements after it (2+2).


    Example 2:

    Input:
    n = 1
    A[] = {1}
    Output: 1
    Explanation:
    Since its the only element hence
    its the only equilibrium point.*/


    public static int equilibriumPoint(long a[], int n) {
        if(n==1) return 1;
        long sum=0,currsum=0;

        for(int i=0;i<n;i++)//for  total sum of arr
            sum+=a[i];

        int k=-1;

        for(int i=1;i<n;i++){
            currsum+=a[i-1]; // it  store prefix sum
            if(currsum==sum-a[i]-currsum)
            {
                k=i+1;
                break;
            }
        }

        return k;

    }

    // 6th problem Stock buy and sell
    /*The cost of stock on each day is given in an array A[] of size N. Find all the segments of days on which you buy
    and sell the stock so that in between those days  for which profit can be generated

            Note: Since there can be multiple solutions, the driver code will print 1 if your answer is correct,
            otherwise, it will return 0. In case there's no profit the driver code will print the string "No Profit" for a correct solution.

    Example 1:

    Input:
    N = 7
    A[] = {100,180,260,310,40,535,695}
    Output:
            1
    Explanation:
    One possible solution is (0 3) (4 6)
    We can buy stock on day 0,
    and sell it on 3rd day, which will
    give us maximum profit. Now, we buy
    stock on day 4 and sell it on day 6.
    Example 2:

    Input:
    N = 5
    A[] = {4,2,2,2,4}
    Output:
            1
    Explanation:
    There are multiple possible solutions.
    one of them is (3 4)
    We can buy stock on day 3,
    and sell it on 4th day, which will
    give us maximum profit.*/

    public static ArrayList<ArrayList<Integer>> stockBuyAndSell(int[] arr, int len){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int buy = 0;
        int sell = 0;
        for(int i=0; i<len-1; i++){
            if(arr[buy] < arr[i+1]) {
                sell++;
            }else{
                if(buy < sell){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(buy);
                list.add(sell);
                result.add(list);
                }
               buy = i+1;
                sell = i+1;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(buy);
        list.add(sell);
        result.add(list);
        return result;
    }



   //Largest subarray with 0 sum

    /*Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

    Example 1:

    Input:
    N = 8
    A[] = {15,-2,2,-8,1,7,10,23}
    Output: 5
    Explanation: The largest subarray with
    sum 0 will be -2 2 -8 1 7.
    Your Task:
    You just have to complete the function maxLen() which takes two arguments an array A and n,
    where n is the size of the array A and returns the length of the largest subarray with 0 sum.*/
   public static int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int currSum = 0 , start = 0 , end = -1;
        int largest = 0;

        for(int i=0;i<n;i++){
            currSum += arr[i];

            if(currSum == 0) {
                start = 0 ; end = i;
                largest = Math.max(largest,end-start+1);
            }else if(map.containsKey(currSum)){
                start = map.get(currSum) + 1;
                end = i;
                largest = Math.max(largest,end-start+1);
            }else{
                map.put(currSum, i);
            }
        }
        return largest;
    }


    // 7th Array Subset of another array
   /* Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not.
   Both the arrays can be sorted or unsorted.
    Example 1:
    Input:
    a1[] = {11, 1, 13, 21, 3, 7}
    a2[] = {11, 3, 7, 1}
    Output:
    Yes
    Explanation:
    a2[] is a subset of a1[]
    Example 2:
    Input:
    a1[] = {1, 2, 3, 4, 5, 6}
    a2[] = {1, 2, 4}
    Output:
    Yes
    Explanation:
    a2[] is a subset of a1[]
    Example 3:
    Input:
    a1[] = {10, 5, 2, 23, 19}
    a2[] = {19, 5, 3}
    Output:
    No
    Explanation:
    a2[] is not a subset of a1[]*/
    public static String isSubset( long a1[], long a2[], long n, long m) {
        int temp = -1;
        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++){
                if(a1[i] == a2[j]){
                    temp++;
                    break;
                }
            }
        }
        if(temp == m){
            return "Yes";
        }
        return "No";
    }
    // 2nd approach sorting
    public  static String isSubset2( long a1[], long a2[], long n, long m){
        Arrays.sort(a1);
        Arrays.sort(a2);
        int temp = 0;
        int j =0;
        for(int i=0; i<n; i++){
            if(m<=j){
                break;
            }else{
                if(a1[i] == a2[j] ){
                    temp++;
                    j++;
                }
            }

        }
        if(temp == m){
            return "Yes";
        }
        return "No";
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
    //    subarraySum(arr,len,key);

        // missing array element
        int[] arrMaE = {1,2,3,4,5,6,7,8,10};
        int lenMaE = 9;
   //     missingArrayElement(arrMaE, lenMaE);

        // sort the 012 s
        int[] arrSort ={ 10,11,2,20,1,30,13};
        int lenSort = 7;
        sort012(arrSort, lenSort);
        // 2nd approach solution
    //    sort012222(arrSort, lenSort);

        // 4th problem
        int[] arrLead ={16,17,1,2,3,5,2};
        int lenLead = 7;
      //  leaders(arrLead, lenLead);


        // 5th
        long[] arrEq  = {1,2,3,2,1};
        int lenEq = 5;
     //   equilibriumPoint(arrEq,lenEq);

        // 6th Largest subarray with 0 sum
        int[] arrMaxlen ={17,-2,2,-8,1,7,12};
        int lenMaxLen = 7;
       // maxLen(arrMaxlen, lenMaxLen);

        // 7th Array Subset of another array
        long[] arr1 ={1,2,3,4,1,1,5,6};
        long len1 = 8;
        long[] arr2 = {1,2,3,4,1};
        long len2 = 5;
     //   isSubset(arr1, arr2,len1,len2);

        isSubset2(arr1, arr2,len1,len2);

    }
}
