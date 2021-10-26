import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rawActivationKey = scan.nextLine();
        String commandData = scan.nextLine();

        while(!commandData.equals("Generate")){
            String[] command = commandData.split(">>>");


            switch (command[0]){
                case"Contains":
                    if(rawActivationKey.contains(command[1])){
                        System.out.printf("%s contains %s%n",rawActivationKey,command[1]);
                    }else{
                        System.out.println("Substring not found!");
                    }
                    break;
                case"Flip":
                    int startIndexFlip = Integer.parseInt(command[2]);
                    int endIndexFlip = Integer.parseInt(command[3]);
                    StringBuilder activationKey = new StringBuilder(rawActivationKey);

                    if(command[1].equals("Upper")){
                   String keyFlip = rawActivationKey.substring(startIndexFlip,endIndexFlip);
                   keyFlip = keyFlip.toUpperCase();
                   activationKey.replace(startIndexFlip,endIndexFlip,keyFlip);
                        rawActivationKey = activationKey.toString();
                        System.out.println(activationKey);

                    }else if(command[1].equals("Lower")){
                        String keyFlip = rawActivationKey.substring(startIndexFlip,endIndexFlip);
                        keyFlip = keyFlip.toLowerCase();
                        activationKey.replace(startIndexFlip,endIndexFlip,keyFlip);
                        rawActivationKey = activationKey.toString();
                        System.out.println(activationKey);
                    }
                    break;
                case"Slice":
                    StringBuilder key = new StringBuilder(rawActivationKey);
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    key.replace(startIndex,endIndex,"");
                    rawActivationKey = key.toString();
                    System.out.println(key);

                    break;
            }
          commandData = scan.nextLine();
        }

        System.out.printf("Your activation key is: %s",rawActivationKey);
    }
}
