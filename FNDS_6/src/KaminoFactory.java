import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int DNALength = Integer.parseInt(scanner.nextLine());
        int count = 1;
        int max = 1;
        int cycle = 0;
        int total = 0;
        int superCycle = 0;
        int sum = 0;
        int superSum = 0;
        int startingIndex = 0;
        int BestStartingIndex = 500;

        int[] superDNA = new int[DNALength];
        String input = scanner.nextLine();
        while (!input.equals("Clone them!")) {
            String[] row = input.split("!+");
            int[] num = new int[row.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(row[i]);
                sum += num[i];
            }
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] == 1 && num[i] == num[i + 1]) {
                    startingIndex = i;
                    count++;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    count = 1;
                }
            }
            boolean TheBest = false;
            boolean StartIndex = false;
            cycle++;
            if (max > total) {
                BestStartingIndex=startingIndex;
                TheBest = true;
                total = max;
                superCycle = cycle;
                superSum = sum;
                superDNA = num;
            } else if (max == total && !TheBest) {
                if (startingIndex < BestStartingIndex) {
                    BestStartingIndex = startingIndex;
                    superCycle = cycle;
                    superSum = sum;
                    superDNA = num;
                    StartIndex = true;
                } else if (BestStartingIndex == startingIndex&& !StartIndex) {
                    if (sum > superSum) {
                        superCycle = cycle;
                        superSum = sum;
                        superDNA = num;
                    }
                }

            }
            TheBest = false;
            input = scanner.nextLine();
            sum = 0;
            count = 1;
            max = 1;
            StartIndex=false;
        }
            if (input.equals("Clone them!")) {
                System.out.printf("Best DNA sample %d with sum: %d.%n", superCycle, superSum);
                for (int i : superDNA) {
                    System.out.print(i + " ");
                }
            }

        }
    }