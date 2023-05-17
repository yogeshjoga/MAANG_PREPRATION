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


    // 3rd jumbling ovwels

    public static String modify (String s) {
        String name = "";
        String add = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                name += s.charAt(i);
        }
        int count = name.length() - 1;
        int inc = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                add += name.charAt(inc);
                inc++;
            } else {
                add += s.charAt(i);
            }
        }
        return add;
    }


    public static String revStr(String S) {

        String rev ="";
        for(int i=0; i<S.length(); i++){
            rev = S.charAt(i)+ rev;
        }
        return rev;
    }

    public static String upper(String str){
         // to convert char array
        char[] ch = str.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for(int i=0; i<str.length(); i++){
            if(ch[i] == ' '){
                ch[i+1] = Character.toUpperCase(ch[i+1]);
            }
        }
        System.out.println(new String(ch));
         return new String(ch);
    }

    public static String conRev( String s1, String s2){
         // concat 1st
        String con = s1+s2;
        String rev = "";
        for(int i=0; i<con.length(); i++){
            // reverse the string
            rev = con.charAt(i)+rev;
        }
        System.out.println(rev);
        return rev;
    }


      public   static String delAlternate(String S) {
            String rem = "";
            for(int i=0; i<S.length(); i++){
                if(i%2 == 0){
                    rem += S.charAt(i);
                }
            }
          System.out.println(rem);
            return rem;
        }

        // camel case uppercase char's count
    public static int uppperCaseCount(String s){
         int total = 0;
         // for printing purpose
        String prnt = "";
         for(int i=0; i<s.length(); i++){
             if(java.lang.Character.isUpperCase(s.charAt(i))){
                 prnt+= s.charAt(i);
                 total++;
             }
         }
        System.out.println(total+ " "+ prnt);
         return total;
    }




        public static void main(String[] args){
            // 1st problem
            String str = "1010101010";
            binaryCheck(str);
            // 2nd problem is removing spaces from give line
            String str1 = "Hello this is yogesh joga";
            removeSpace(str1);
            // modify strings
            String s1 = "apple";
            modify(s1);

            // reverse string
            String s = "hello";
            revStr(s);

            // to upper case
            String upper = "i love siri" ;
            upper(upper);

            // String concat and reverse
            String conReverse = "I love you sireesha ";
            String con2 = "Bangram";
            conRev(conReverse,con2);

            // delete the odd index positions
            String oddIndex = "Hello siri baby Love YOu";
            delAlternate(oddIndex);

            // uppercase count
            String upperCaseCunt = "HelloBABYsiriDarling";
            uppperCaseCount(upperCaseCunt);

        }

}
