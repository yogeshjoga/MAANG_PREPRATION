import java.time.Clock;

public class BuiltInMethodsInJava {
    /**
     *
     * @param args
     */



    public static void main(String[] args) {
        Math.max(10,50);
        double result = Math.fma(10,20,2);
        System.out.println(result);

        System.out.println("Hello world!");

        // here initialize object
        MathBuildInMethods mathBuildInMethods = new MathBuildInMethods();


        /**
         * Math.max()
         * Math.min()
         * here let's solve the problems
         */
        int minNum = 13;
        int maxNum = 104;
        mathBuildInMethods.mathMinMax(minNum, maxNum);
    }
}