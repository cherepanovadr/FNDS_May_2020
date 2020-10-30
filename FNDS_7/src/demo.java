public class demo {
    public static void main(String[] args) {
        int[] num = {5};
        num = increment(num, 16);
        System.out.println(num);


    }

    private static int[] increment(int[] num, int amount) {
        num[0] += amount;
        return num;
    }
    private static void print(String name) {

    }
    private static void print1(String name1) {
    }
    private static void print(String name2, int name) {
    }
}
