import java.util.*;

public class MediumStrings {


    /**
     * Strings medium problems started
     * let's understand the concepts and String
     *
     * @param args
     */
    // for printing the values creating the School level object
    School school = new School();


    //  Parenthesis Checker
    // its not working screenshot is there in resource folder
    static boolean ispar(String x) {
        Stack<Character> stack = new Stack();
        if (x.length() % 2 == 1) return false;

        for (char ch : x.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }


    static boolean ispar1(String x) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : x.toCharArray()) {
            if (stack.isEmpty() || ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if ((ch == '}' && stack.peek() == '{') ||
                        (ch == ')' && stack.peek() == '(') ||
                        (ch == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else return false;
            }        }
        return stack.isEmpty();
    }

    // Equal point in a string of brackets
    public static long countSub(String str) {
        long lo = 0L;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ')'){
                lo++;
            }
        }
        return lo;
    }







    public static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        int count = 0;
        for(String lo: s){
            if(lo.equals(word1)){
                count++;

//                while(!lo.equals(word2)){
//                    count++;
//                    if(lo.equals(word2)){
//                        break;
//                    }
//                }

            }else if(!lo.equals(word2)){
                count++;
            }
            if(lo.equals(word2)){
                System.out.println(count);
                return count;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int shortestDistance1(ArrayList<String> s, String word1, String word2) {


        for(int i=0; i<s.size(); i++){

        }

        return 0;
    }



    //
    public  static boolean areKAnagrams(String s1, String s2, int k) {
        if(s1.length() != s2.length()) return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int temp =0;
        for(int i=0; i<s1.length(); i++){
            if(c1[i] == c2[i]){
                temp++;
            }
        }
        System.out.println(temp);
        if(temp > k ) return false;
        return true;
    }

    /**
     *
     * Given two strings of lowercase alphabets and a value K, your task is to complete the given function which tells if  two strings are K-anagrams of each other or not.
     *
     * Two strings are called K-anagrams if both of the below conditions are true.
     * 1. Both have same number of characters.
     * 2. Two strings can become anagram by changing at most K characters in a string.
     *
     * Example:
     *
     * Input:
     * str1 = "fodr", str2="gork"
     * k = 2
     * Output:
     * 1
     * Explanation: Can change fd to gk
     */

    public  static boolean areKAnagrams1(String s1, String s2, int k) {
        if(s1.length() != s2.length()) return false;
        int []count=new int[256];

        for(int i=0;i<s1.length();i++) {
            count[s1.charAt(i)]++;
        }

        for(int i=0;i<s2.length();i++) {
            count[s2.charAt(i)]--;
        }
        int neg=0;
        int pos=0;
        for(int i=0;i<256;i++) {
            if(count[i]>0)
                pos+=count[i];

            if(count[i]<0)
                neg+=count[i];
        }
        int val=Math.max(neg,pos);
        if(val>k)
            return false;

        return true;
    }


    // Reverse words in a given string

    /**
     *Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
     *
     * Example 1:
     *
     * Input:
     * S = i.like.this.program.very.much
     * Output: much.very.program.this.like.i
     * Explanation: After reversing the whole
     * string(not individual words), the input
     * string becomes
     * much.very.program.this.like.i
     * Example 2:
     *
     * Input:
     * S = pqr.mno
     * Output: mno.pqr
     * Explanation: After reversing the whole
     * string , the input string becomes
     * mno.pqr
     *
     */

   public static String reverseWords(String S)
    {
        String[] words = S.split("\\.");
        String rev = "";
        for(int i=words.length-1; i>=0; i--){
            rev+=words[i];
            if(i>0){
                rev+=".";
            }

        }
        return rev;
    }


    //===========================================================================================
    // string roatation ===========================================Check if string is rotated by two places

    /**
     *
     *Check if string is rotated by two places
     *
     * Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating another string 'a' by exactly 2 places.
     *
     * Example 1:
     *
     * Input:
     * a = amazon
     * b = azonam
     * Output: 1
     * Explanation: amazon can be rotated anti
     * clockwise by two places, which will make
     * it as azonam.
     * Example 2:
     *
     * Input:
     * a = geeksforgeeks
     * b = geeksgeeksfor
     * Output: 0
     * Explanation: If we rotate geeksforgeeks by
     * two place in any direction , we won't get
     * geeksgeeksfor.
     *
     * Your Task:
     * The task is to complete the function isRotated() which takes two strings as input parameters and checks if given strings can be formed by rotations.
     * The function returns true if string 1 can be obtained by rotating string 2 by two places, else it returns false.
     */


    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length() <=2 || str2.length() <= 2){
            if(str1.equals(str2)) return true;
            else return false;
        }

        if(str1.length() != str2.length()){
            return false;
        }

        int n=str1.length();
        str1 = str1.concat(str1);
        if(str1.indexOf(str2) == 2 || str1.indexOf(str2) == n-2){
            return true;
        }
        return false;
    }

    // Romain numbers

    /**
     *Given a string in roman no format (s)
     *  your task is to convert it to an integer . Various symbols and their values are given below.
     * I 1
     * V 5
     * X 10
     * L 50
     * C 100
     * D 500
     * M 1000
     *
     * Example 1:
     *
     * Input:
     * s = V
     * Output: 5
     * Example 2:
     *
     * Input:
     * s = III
     * Output: 3
     *
     */

    public static  int romToInt(String str){
        // Adding the all pairs
        // to get these paris and process
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L', 50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int len = str.length()-1;
        int res = map.get(str.charAt(len--));
        for(int first, next; len>=0; len--){
            first =map.get(str.charAt(len));
            next = map.get(str.charAt(len+1));

            res += first < next ? (-first) : first;
        }
        System.out.println(" Roman to Int : "+str+" : "+res);
        return  res;
    }


    // Isomorphic Strings

    /**
     * Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
     * Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible
     * for every character of str1 to every character of str2 while preserving the order.
     *
     * Note: All occurrences of every character in str1 should map to the same character in str2
     *
     * Example 1:
     *
     * Input:
     * str1 = aab
     * str2 = xxy
     * Output: 1
     * Explanation: There are two different
     * charactersin aab and xxy, i.e a and b
     * with frequency 2and 1 respectively.
     * Example 2:
     *
     * Input:
     * str1 = aab
     * str2 = xyz
     * Output: 0
     * Explanation: There are two different
     * charactersin aab but there are three
     * different charactersin xyz. So there
     * won't be one to one mapping between
     * str1 and str2.
     *
     */
    //Function to check if two strings are isomorphic.
    // this is my approach, its not working some test cases
    public static boolean areIsomorphic(String str1,String str2)
    {
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 != len2) return false;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<len1-1; i++){
            if(ch1[i] == ch1[i+1]){
                count1++;
            }
        }
        for(int i=0; i<len1-1; i++){
            if(ch2[i] == ch2[i+1]){
                count2++;
            }
        }
         System.out.println(count1);
         System.out.println(count2);

        if(count1 == 0 && count2 == 0) return false;
        else if(count1 == count2) return true;
        return false;
    }

    // Hashmap algo used
    public static boolean areIsomorphic1(String str1,String str2)
    {

        if(str1.length() != str2.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();

        boolean match = true;
        for(int i=0; i<str1.length(); i++){

            if(map.containsKey(str1.charAt(i))){
                if(str2.charAt(i) == map.get(str1.charAt(i))){
                    continue;
                }else{
                    match = false;
                    break;
                }
            }else{
                if(map.containsValue(str2.charAt(i))){
                    match = false;
                    break;
                }
                map.put(str1.charAt(i),str2.charAt(i));
            }
        }
        if(!match) return false;

        return true;

    }




    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {


        boolean[] arr = new boolean[26];
        Arrays.fill(arr,false);
        int index;

        for(int i=0; i<str.length(); i++){
            char c= Character.toLowerCase(str.charAt(i));
            if(Character.isLetter(c)){
                index = c - 'a';
                arr[index] = true;
            }
        }
        for(int i=0; i<=25; i++){
            if(arr[i] == false){
                return false;
            }
        }
        return true;
    }

    //Divisible by 7
    public static int isDivisable(String s){
        int sum = 0;
        for(int i=0; i<=s.length()-1; i++){
            sum = ((sum * 10)+s.charAt(i) -'0')%7;
        }
        System.out.println(sum);
        return sum == 0 ? 1 : 0;
    }




    public static void main(String[] args) {
        //  Parenthesis Checker
        String pran = "(){}{[]";
        ispar1(pran);

        // parenthesis equal points
        String equalPon = "((()))))((";
        countSub(equalPon);

        // shortestDistance in string
        ArrayList<String> li = new ArrayList<>();
        li.add("hello");
        li.add("this");
        li.add("is");
        li.add("yogi");
        li.add("how");
        li.add("are");
        li.add("you");
        String w1 = "hello";
        String w2 = "you";
        shortestDistance(li, w1,w2);

        String s1 = "aaaaa";  //zjwusu wetkfj
        String s2 = "bbbbb";
        int key = 1;
        areKAnagrams(s1,s2,key);
        areKAnagrams1(s1,s2,key);

        // Reverse words in a given string
        String revStr = "yogi.joga.darling.siri.i.love.you";
        reverseWords(revStr);

        //Check if string is rotated by two places
        String rote = "amazon";
        String rote2 = "azonma";
        isRotated(rote,rote2);

        // Roman number to integer
        String romTo = "IV";
        romToInt(romTo);

        //areIsomorphic
        String areIso1 = "aad";
        String areIso2 = "xxy";
        areIsomorphic1(areIso1,areIso2);

        //checkPangram
        String stpar ="Bawds jog, flick quartz, vex nymph";
        checkPangram(stpar);

        //is divisable into 7
        isDivisable("1234557890");


    }
}
