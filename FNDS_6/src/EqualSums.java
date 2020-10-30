import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] row = scanner.nextLine().split(" ");
//        int sum = 0;
//        int sum2 = 0;
//        boolean Found = false;
        int[] num = new int[row.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(row[i]);
        }
//        if (row.length == 1) {
//            System.out.println("0");
//            return;
//        }
//        for (int i = 0; i < num.length; i++) {
//            sum += num[i];
//            if (sum == num[i + 1]) ;
//            {
//                for (int j = i + 2; j < num.length; j++) {
//                    sum2 += num[j];
//                }
//                if (sum == sum2) {
//                    System.out.println(i + 1);
//                    Found = true;
//                }
//            }
//            }
//        if (!Found && row.length > 1) {
//            System.out.println("no");
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < num.length; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += num[j];
            }
            int rightSum = 0;
            for (int j = i + 1; j < num.length; j++) {
                rightSum += num[j];
            }
            if (leftSum == rightSum) {
                index = i;
                flag = true;
                break;
            }
        }
    if (flag){
        System.out.println(index);
            } else {
        System.out.println("no");
    }
    }
}



