public class _10RegularExpressionMatching {


    public static void main(String[] args) {


        System.out.println(isMatch("aab","c*a*b"));

    }



    public static boolean isMatch(String s, String p) {

//        System.out.println("p :"+ p.length());
//        System.out.println("s :"+ s.length());

        boolean status = false;
        if (!p.contains(".") && !p.contains("*") && p.length() != s.length()){
            System.out.println(0);
            return false;
    }

        for (int i = 0; i < p.length(); i++) {


            if (p.charAt(i) == '*'){
                if (p.charAt(i - 1) != s.charAt(i)) {
                    System.out.println(1);
                    status = false;
                }
            } else if (p.charAt(i) == '.' && p.charAt(i+1) == '*') {
                i++;
            } else if (p.charAt(i) == '.') {

            } else{
                if (p.charAt(i) != s.charAt(i)){
                    System.out.println(2);
                    status = false;
                }

            }


        }
        
        return status;

    }
}
