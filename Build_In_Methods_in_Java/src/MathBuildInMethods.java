import java.util.Random;

public class MathBuildInMethods {
    /**
     * @Math-class_Build_in_Methods
     * let's start the math class build in methods in java
     * Math class methods are very important to learn
     * if we know all java math class methods programmer life make easier.
     */


    /**
     * @Yogesh-Joga
     * Here we need to more working with math lib
     * build-in Methods from java
     * the package name- java.lang.Math --> here Math is class name
     * Lets gone through some Math class predefined methods--
     *
     * learn part-wise we will split into chunks
     */

    // 1st method is Math.max();
    // 2nd method is Math.min();

    public static void mathMinMax(int num1, int num2){
        // let's print the max number 1st
        int maxNum = Math.max(num1,num2);
        System.out.println("Here we need to find which is max number :"+maxNum);

        // let's print the min number
        int minNum = Math.min(num1, num2);
        System.out.println("Here we will print the min number  : " + minNum);

    }



    // 3rd Math.abs();
    // 4th Math.round();
    public static void mathAbsRound(int num1, int num2){
        // Math.abs() absolute values it returns only positive values
        int mathAbs = Math.abs(num1);

        // Math.round()  -- round mean round-figure values
        // ex: 1.787 = 2 this is the round figure value right
        int mathRound = Math.round(num2);
        System.out.println("abs --- : "+ mathAbs);
        System.out.println("round ---- :"+ mathRound);

    }


    // 5th Math.pow();
    // 6th Math.sqrt();
    // 7th Math.cbrt();
    public static void mathPowSqrtCbrt(int num1, int num2){
        // Math.pow() --> here we can understand power's

        // here all are double data type we need to cast it
        int mathPow = (int) Math.pow(num1,num2);
        int mathSqrt = (int) Math.sqrt(3);
        int mathCbrt = (int) Math.cbrt(2);
        System.out.println("Math pow ---> " + mathPow);
        System.out.println("Math sqrt --> " + mathSqrt);
        System.out.println("Math cbrt --> "+ mathCbrt);

    }

    // 8th Math.signum()
    // 9th Math.ceil();
    // 10th Math.copysign();

    public static void mathSignumCeilCopySign(int num1, int num2){
        int mathSignum = (int) Math.signum(num1);
        int mathCeil = (int) Math.ceil(num1);
        // here we need to know about the copySign method behavior
        double cpysign = 11.0000;
        double mathCopySign =  Math.copySign(cpysign, num1);
        // let's print the values from the initialization variables
        System.out.println("math Signum -->"+mathSignum);
        System.out.println("ceil -->"+mathCeil);
        System.out.println("copy sign --->"+ cpysign);
    }


    // 11th Math.nextAfter();
    // 12th Math.nextUp();
    // 13th Math.nextDown();

    public static void mathNextAfterUpDown(int num1, int num2){
        // math. nextAfter, nextUp, nextDown.
        int after = (int) Math.nextAfter(num1,num2);

        // here----
        int up = (int) Math.nextUp(num1);

        int down = (int)Math.nextDown(num1);
        System.out.println("next after method ---> "+ after);
        System.out.println("next up method ---> "+ up);
        System.out.println("next down method ---> " + down);
    }


    // 14th Math.floor();
    // 15th Math.floorDiv();
    public static void mathFloorFloorDiv(int num1, int num2){
        //
        int floorMe = (int) Math.floor(num1);
        int floordiv = Math.floorDiv(num1, num2);
    }


    // 16th Math.random();
    // 17th Math.rint();
    // 18th Math.hypot();
    // 19th Math.ulp();
    // 20th Math.getExponent();
    public static void mathRandomRintHypotUlpGetExponent(int num1, int num2){
        // random
        int ran = (int)Math.random();
    }


    // 21st Math.addExact();
    // 22nd Math.subtractExact();
    // 23rd Math.multiplyExact();
    // 24th Math.incrementExact();
    // 25th Math.decrementExact();
    // 26th Math.negateExact();
    // 27th Math.toIntExact();

    // how to genrate the Random number by using ints--> java 8 futures
    public static void helloInts(int num1, int num2){

        Random ran = new Random();
        ran.ints(num1).forEach(System.out::println);
        ran.ints(num1,num2);

    }

}
