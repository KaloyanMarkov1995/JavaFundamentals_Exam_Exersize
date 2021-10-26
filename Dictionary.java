import java.util.*;
import java.util.stream.Collectors;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] wordDefinitions = scan.nextLine().split(" \\| ");
        Map<String, List<String>> dictionary = new TreeMap<>();

        for (int i = 0; i < wordDefinitions.length; i++) {
          String[]  wordDefinition = wordDefinitions[i].split(": ");
            if (!dictionary.containsKey(wordDefinition[0]))
            {
                dictionary.put(wordDefinition[0], new ArrayList<String>());
            }
           else
            {
                dictionary.get(wordDefinition[0]).add(wordDefinition[1]);
            }

        }
        String[] testWords = scan.nextLine().split(" \\| ");
        String command = scan.nextLine();



        switch (command){
            case"Test":
                for (int i = 0; i < testWords.length; i++) {
                    if(dictionary.containsKey(testWords[i])){
                        System.out.println(dictionary.containsKey(wordDefinitions[i]));


                    }
                }


                break;
            case"Hand Over":
                for(var entry:dictionary.entrySet()){
                    System.out.println(entry.getKey());
                }
                break;

        }


    }
}
