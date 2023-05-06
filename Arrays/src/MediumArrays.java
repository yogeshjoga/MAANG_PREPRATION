import java.util.Arrays;

public class MediumArrays {

    /**
     * @Author Yogesh-Joga
     *  Started Medium Arrays Problems 03/may/2023
     * @Goal
     *  I don't have enough knowledge today but end of this class implementation i need to improve my skills.
     */


    // 1st medium problem
    public static long maxSubArraySum(long[] arr, int len){
        /**
         * here Integer.MAX_VALUE and Integer.MIN_VALUE
         * MAX_VALUE --> mean int Highest positive number,  It means size of int is 4Bytes -- 32bit
         * MIN_VALUE --> mean int Highest negative number   constraints:--> -2^31 to 2^31-1
         */
        // int minVal = Integer.MIN_VALUE;
        long minVal = -99992929;
        long  sum = 0L;
        for(int i=0; i<len; i++){
            sum += arr[i];
            if (minVal < sum) {
                minVal = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(minVal);
        return minVal;
    }
   public static int minJumps(int[] arr){
        // its not valid time taken
        // int sum = 0;
        // int jump;
        // for(int i=0; i<arr.length; i=i+jump){
        //     jump=arr[i];
        //     sum++;
        // }
        // return sum;

        int n = arr.length;
        int cnt=0;
        for(int i =1;i<n;i++)
            arr[i]=Math.max(arr[i]+i,arr[i-1]);


        int i =0;
        while(i<n-1)
        {
            if(arr[i]<=i)
                return -1;
            i=arr[i];
            cnt++;
        }
        return cnt;
    }
    public static int kthSmallest(int[] arr, int k)
    {
        Arrays.sort(arr);
        int res =0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(k-1 == i){
                res = arr[i];
            }
        }
        return res;
    }


    // 4th problem
    // Minimize the Heights II

    // wrong solution
    public static int getMinDiff(int[] arr, int n, int k) {
        //   int last = 0;
        //   int fir = 0;

        for(int i=0; i<n-1; i++){
            if(k >= arr[i]){
                arr[i] = arr[i] + k;
            }else{
                arr[i] = arr[i] - k;
            }
        }
        int res = arr[arr.length-1] - arr[0];
        return res;
    }

    // right solution
   public static int getMinDiff1(int[] arr, int n, int k) {
        // here sorting the array
        Arrays.sort(arr);
        int d = arr[n-1] - arr[0];
        int min = 0, max =0;
        for(int i=1;i<n;i++){
            if(arr[i]-k < 0)
                continue;
            max = (int) Math.max(arr[n-1]-k, arr[i-1] + k);
            min = (int) Math.min(arr[0]+k, arr[i]-k);
            d =(int) Math.min(d,(max-min));
        }
        return d;
    }







    public static void main(String[] args) {
        System.out.println("Hello world!");
        // 1st algo kadane
        long arr[] ={-8,1,2,3,4,-5,2,-9};
        int len = 8;
        maxSubArraySum(arr,len);

        // 2nd minJump
        int[] arrInt = {1,2,3,4,5,6,7,8,9,10};
        minJumps(arrInt);

        // 3rd prolblem kth element
        kthSmallest(arrInt,10);

        // 4th problem
      int  k = 3, n = 5;
      int  arrp[] = {3, 9, 12, 16, 20};
        getMinDiff(arrp,n,k);
        getMinDiff1(arrp,n,k);


    }

}
