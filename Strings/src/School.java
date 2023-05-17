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

        }

}
