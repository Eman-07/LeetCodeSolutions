import java.util.HashMap;

public class _13RomanToInteger {


    public static void main(String[] args) {
        String s;
        s = "MMCDXXV";

//        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
//        map.put('I', 1);
//        map.put('V',5);
//        map.put('X',10);
//        map.put('L',50);
//        map.put('C',100);
//        map.put('D',500);
//        map.put('M',1000);

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


        for (char c : parts) {
            System.out.println(c);
        }
        for (int i = 0; i < parts.length ; i++) {

            if(parts[i] == 'I') {
                if (i != parts.length - 1) {
                    if (parts[i] == 'I' & parts[i + 1] == 'V') {
                        sum += 4;
                        i++;
                    } else if (parts[i] == 'I' & parts[i + 1] == 'X') {
                        sum += 9;
                        i++;
                    }else sum +=1;
                } else
                    sum += 1;
            } else if (i != parts.length - 1) {

                 if (parts[i] == 'X' && parts[i + 1] == 'L') {
                    sum +=40;
                    i++;
                } else if (parts[i] == 'C' & parts[i + 1] == 'D') {
                    sum += 400;
                    i++;
                } else if (parts[i] == 'X' && parts[i + 1] == 'C') {
                    sum +=90;
                    i++;
                } else if (parts[i] == 'C' && parts[i + 1] == 'M') {
                    sum +=900;
                    i++;
                }

            } else if (parts[i] == 'X' && parts[i + 1] == 'L') {
                sum +=40;
                i++;
            } else if (parts[i] == 'C' & parts[i + 1] == 'D') {
                sum += 400;
                i++;
            } else if (parts[i] == 'X' && parts[i + 1] == 'C') {
                sum +=90;
                i++;
            } else if (parts[i] == 'C' && parts[i + 1] == 'M') {
                sum +=900;
                i++;
            } else if (parts[i] == 'V'){
                sum += 5;
            } else if (parts[i] == 'X') {
                sum +=10;
            } else if (parts[i] == 'L') {
                sum +=50;
            } else if (parts[i] == 'C') {
                sum +=100;
            } else if (parts[i] == 'D') {
                sum +=500;
            } else if (parts[i] == 'M') {
                sum +=1000;
            }

            System.out.println(parts[i] +":"+sum);
        }

        System.out.println("Sum is : "+sum);

    }
}
