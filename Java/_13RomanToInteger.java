import java.util.HashMap;

public class _13RomanToInteger {

    public static void main(String[] args) {
        String s;
        s = "MMCDXXV";

        /*
        Exceptions
        IV 4
        IX 9
        XL 40
        XC 90
        CD 400
        CM 900
        * */


        char parts[] = s.toCharArray();

        int sum = 0;




        for (int i = 0; i < parts.length; i++) {
            if (i == parts.length - 1) {
                if (parts[i] == 'I') sum += 1;
                else if (parts[i] == 'V') sum += 5;
                else if (parts[i] == 'X') sum += 10;
                else if (parts[i] == 'L') sum += 50;
                else if (parts[i] == 'C') sum += 100;
                else if (parts[i] == 'D') sum += 500;
                else if (parts[i] == 'M') sum += 1000;

            } else {

                if (parts[i] == 'I' & parts[i + 1] == 'V') {
                    sum += 4;
                    i++;
                } else if (parts[i] == 'I' & parts[i + 1] == 'X') {
                    sum += 9;
                    i++;
                } else if (parts[i] == 'X' & parts[i + 1] == 'L') {
                    sum += 40;
                    i++;
                } else if (parts[i] == 'X' & parts[i + 1] == 'C') {
                    sum += 90;
                    i++;
                } else if (parts[i] == 'C' & parts[i + 1] == 'D') {
                    sum += 400;
                    i++;
                } else if (parts[i] == 'C' & parts[i + 1] == 'M') {
                    sum += 900;
                    i++;
                }else if(parts[i] == 'I'){
                    sum +=1;
                } else if (parts[i] == 'V') sum += 5;
                else if (parts[i] == 'X') sum += 10;
                else if (parts[i] == 'L') sum += 50;
                else if (parts[i] == 'C') sum += 100;
                else if (parts[i] == 'D') sum += 500;
                else if (parts[i] == 'M') sum += 1000;

            }


            System.out.println(parts[i]+":"+sum);
        }


        System.out.println("Sum is : "+sum);

    }
}
