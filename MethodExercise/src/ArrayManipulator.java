//import java.util.Scanner;
//
//public class ArrayManipulator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] data = scanner.nextLine().split(" ");
//        int[] array = new int[data.length];
//        for (int i = 0; i < data.length; i++) {
//            array[i] = Integer.parseInt(data[i]);
//        }
//        String input = scanner.nextLine();
//        while (!input.equals("end")) {
//            String[] tokens = input.split(" ");
//            String command = tokens[0];
//            switch (command) {
//                case "exchange":
//                    int index = Integer.parseInt(tokens[1]);
//                    if (index < 0 || index >= array.length) {
//                        System.out.println("Invalid index");
//                    } else {
//                        exchange(array, index);
//                    }
//                    break;
//                case "min": {
//                    String evenorOdd = tokens[1];
//                    if (evenorOdd.equals("even")) {
//                        findMinEven(array);
//                    } else if (evenorOdd.equals("odd")) {
//                        findMinOdd(array);
//                    }
//                    break;
//                }
//                case "max": {
//                    String evenorOdd = tokens[1];
//                    if (evenorOdd.equals("even")) {
//                        findMaxEven(array);
//                    } else if (evenorOdd.equals("odd")) {
//                        findMaxOdd(array);
//                    }
//                    break;
//                }
//                case "first": {
//                    int count = Integer.parseInt(scanner.nextLine());
//                    String evenorOdd = tokens[2];
//                    if (evenorOdd.equals("even")) {
//                        findFirsCountEven(array, count);
//                    } else if (evenorOdd.equals("odd")) {
//                        findFirsCountOdd(array, count);
//                    }
//                }
//                break;
//                case "last": {
//                    int count = Integer.parseInt(scanner.nextLine());
//                    String evenorOdd = tokens[2];
//                    if (evenorOdd.equals("even")) {
//                        findLastcountEven(array, count);
//                    } else if (evenorOdd.equals("odd")) {
//                        findLastcountOdd(array, count);
//                    }
//                }
//                break;
//
//            }
//            input = scanner.nextLine();
//        }
//
//
//    }
//
//    private static void findLastcountOdd(int[] array, int count) {
//        int[] result = new int[0];
//        for (int i = array.length; i >= 0; i--) {
//            if (array[i] % 2 != 0) {
//                result = expandAndAddtoArray(result, array[i]);
//                if (result.length == count) {
//                    break;
//                }
//
//            }
//        }
//        reverseArray(array);
//        printArray(array);
//    }
//
//
//    private static void findLastcountEven(int[] array, int count) {
//        int[] result = new int[0];
//        for (int i = array.length - 1; i >= 0; i--) {
//            if (array[i] % 2 == 0) {
//                result = expandAndAddtoArray(result, array[i]);
//                if (result.length == count) {
//                    break;
//                }
//
//            }
//        }
//        reverseArray(result);
//        printArray(array);
//
//    }
//
//    private static void reverseArray(int[] array) {
//        int[] temp = copyArray(array);
//        for (int i = array.length - 1; i >= 0; i--) {
//            array[i] = temp[array.length - -1 - i];
//        }
//    }
//
//    private static void findFirsCountOdd(int[] array, int count) {
//        int[] result = new int[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                expandAndAddtoArray(result, array[i]);
//                if (result.length == count) {
//                    break;
//                }
//            }
//
//        }
//        printArray(result);
//    }
//
//    private static void findFirsCountEven(int[] array, int count) {
//        int[] result = new int[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                expandAndAddtoArray(result, array[i]);
//                if (result.length == count) {
//                    break;
//                }
//            }
//
//        }
//        printArray(result);
//
//    }
//
//    private static void printArray(int[] array) {
//        System.out.println("[");
//        for (int i = 0; i < array.length; i++) {
//            if (i == 0) {
//                System.out.println(array[i]);
//            } else {
//                System.out.println(", " + array[i]);
//            }
//        }
//        System.out.println("]");
//    }
//
//    private static void expandAndAddtoArray(int[] oldArray, int newElement) {
//        int[] newArray = new int[oldArray.length + 1];
//        for (int i = 0; i < oldArray.length; i++) {
//            newArray[i] = oldArray[i];
//        }
//        newArray[newArray.length - 1] = newElement;
//        return newArray;
//    }
//
//    private static void findMaxOdd(int[] array) {
//        int max = Integer.MIN_VALUE;
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0 && max >= array[i]) {
//                max = array[i];
//                index = i;
//            }
//        }
//        if (index == -1) {
//            System.out.println("No matches");
//        } else {
//            System.out.println(index);
//        }
//    }
//
//    private static void findMaxEven(int[] array) {
//        int max = Integer.MIN_VALUE;
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0 && max >= array[i]) {
//                max = array[i];
//                index = i;
//            }
//        }
//        if (index == -1) {
//            System.out.println("No matches");
//        } else {
//            System.out.println(index);
//        }
//
//    }
//
//    private static void findMinOdd(int[] array) {
//        int min = Integer.MAX_VALUE;
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0 && min >= array[i]) {
//                min = array[i];
//                index = i;
//            }
//        }
//        if (index == -1) {
//            System.out.println("No matches");
//        } else {
//            System.out.println(index);
//        }
//    }
//
//    private static void findMinEven(int[] array) {
//        int min = Integer.MAX_VALUE;
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0 && min >= array[i]) {
//                min = array[i];
//                index = i;
//            }
//        }
//        if (index == -1) {
//            System.out.println("No matches");
//        } else {
//            System.out.println(index);
//        }
//    }
//
//    private static void exchange(int[] array, int index) {
//        int[] temp = copyArray(array);
//        int count = 0;
//        for (int i = index + 1; i < temp.length; i++) {
//            array[count] = temp[i];
//            count++;
//
//        }
//        for (int i = 0; i <= index; i++) {
//            array[count] = temp[i];
//
//        }
//    }
//
//    private static int[] copyArray(int[] array) {
//        int[] newarray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            newarray[i] = array[i];
//        }
//        return newarray;
//    }
//}
