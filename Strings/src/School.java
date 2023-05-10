public class School {
    /**
     *
     * @Author_Yogesh-Joga
     *
     * Strings --> School level problems
     *
     */

    // 1st problem Check for Binary
    // its working fine
     public  static boolean binaryCheck(String str){
         // iterating the string char's
         for(int i=0; i<str.length(); i++){
             if(str.charAt(i) != '0' && str.charAt(i) != '1'){
                 System.out.println(false);
                 return  false;
             }
         }
         System.out.println(true);
         return true;
     }

     // 2nd problem is remove spaces in given line
    public static String removeSpace(String str){
         return str.replace(" ","");
    }


    public static void main(String[] args) {
         // 1st problem
        String str = "1010101010";
          binaryCheck(str);
          // 2nd problem is removing spaces from give line
        String str1 = "Hello this is yogesh joga";
        removeSpace(str1);

    }
}
