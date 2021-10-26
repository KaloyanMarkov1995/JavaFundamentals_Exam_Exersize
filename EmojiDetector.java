import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String regex = "([:]{2}|[\\*]{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        long coolThreshold = 1;

        for (int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))) {
                int digit =Integer.parseInt(String.valueOf(text.charAt(i)));
                coolThreshold *= digit;
            }
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int found = 0;

        List<String> coolEmojis = new ArrayList<>();

        while(matcher.find()){
            long emojiNum = 0;
       String emojiText = matcher.group("emoji");
       String textToPrint = matcher.group();
            for (int i = 0; i < emojiText.length(); i++) {
                int num = emojiText.charAt(i);
                emojiNum += num;
            }
         found++;
            if(emojiNum>coolThreshold){
                coolEmojis.add(textToPrint);
            }
        }

        System.out.println("Cool threshold: "+ coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",found);
        for (String emoji: coolEmojis) {
            System.out.println(emoji);
        }

    }
}
