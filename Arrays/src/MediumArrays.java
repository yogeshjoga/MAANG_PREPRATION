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

    public static void main(String[] args) {
        System.out.println("Hello world!");
        // 1st algo kadane
        long arr[] ={-8,1,2,3,4,-5,2,-9};
        int len = 8;
        maxSubArraySum(arr,len);
    }

}
