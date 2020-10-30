package Lists;

import java.util.Scanner;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] digits = scanner.nextLine().split(" ");
        StringBuilder text = new StringBuilder(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        int index = 0;
//9992 562 8933
        //29 13 23 =67
        //26+13=39-28=11
//This is some message for you
        for (String digit : digits) {
            int sum = 0;
            int digitNum = Integer.parseInt(digit);
            for (int i = 0; i < digit.length(); i++) {
                int current = digitNum % 10;
                sum += current;
                digitNum = digitNum / 10;
            }

            index= sum;
            if (index >= 0 && index < text.length()) {
                String cur = text.substring(index,index+1);
                sb.append(cur);
                text.delete(index,index+1);

            } else {
                while (index > text.length()) {
                    index = index - text.length();
                }
                String cur = text.substring(index,index+1);
                sb.append(cur);
                text.delete(index,index+1);
            }
        }
        System.out.println(sb.toString());
    }
}
