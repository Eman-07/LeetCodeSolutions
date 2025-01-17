public class _9isPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
        }

    public  static boolean isPalindrome(int x) {

        Integer i = x;
        String s =i.toString();
        char c[] = s.toCharArray();
        boolean status= false;

        for (int j = 0; j <c.length; j++){
            if (c[j] == c[c.length-j-1]){
                status = true;
            }else{
                status = false;
                break;
            }
        }
        return status;
    }


}

