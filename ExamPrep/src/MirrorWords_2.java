/*
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> main = new HashMap<>();
        //key - first word, value - reversed
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        StringBuilder mainmain = new StringBuilder();

        int count = 0;
        String pairsRegex = "([@#])(?<first>[A-Za-z]{3,})\\1([@#])(?<second>[A-Za-z]{3,})\\1";
        Pattern patternPairs = Pattern.compile(pairsRegex);
        Matcher matcherPairs = patternPairs.matcher(sb);
        while (matcherPairs.find()) {
            String first = matcherPairs.group("first");
            String second = matcherPairs.group("second");
            StringBuilder temp = new StringBuilder();
            temp.append(second);
            StringBuilder reversed = temp.reverse();
            if(first.equals(reversed.toString())){
                main.putIfAbsent(first,second);
                mainmain.append(first);
                mainmain.append(second);

            }
            temp.delete(0,second.length());
            count++;
        }
        if (count > 0) {
            System.out.printf("%d word pairs found!%n", count);
        } else {
            System.out.println("No word pairs found!");
        }
        if (main.size() >0){
            System.out.println("The mirror words are:");
            String name ="";
            main
                .entrySet()
                .stream()
                .forEach(entry-> name += (entry.getKey() +" <=> " + entry.getValue()));


        } else{
            System.out.println("No mirror words!");
        }
    }


}

*/
