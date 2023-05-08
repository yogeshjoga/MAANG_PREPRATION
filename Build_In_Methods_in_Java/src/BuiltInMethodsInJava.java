import java.time.Clock;
import java.util.Random;

public class BuiltInMethodsInJava {
    /**
     *
     * @param args
     */

    public static void helloInts(int num1, int num2){

        Random ran = new Random();
        // here we are using for each method
        ran.ints(num1).forEach(System.out::println);
        ran.ints(num1,num2);

    }



    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 200;

        helloInts(num1, num2);





//        Math.max(10,50);
//        double result = Math.fma(10,20,2);
//        System.out.println(result);
//
//        System.out.println("Hello world!");
//
//        // here initialize object
//        MathBuildInMethods mathBuildInMethods = new MathBuildInMethods();
//
//
//        /**
//         * Math.max()
//         * Math.min()
//         * here let's solve the problems
//         */
//        int minNum = 13;
//        int maxNum = 104;
//        mathBuildInMethods.mathMinMax(minNum, maxNum);
    }
}