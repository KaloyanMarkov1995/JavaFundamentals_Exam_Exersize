import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String commandData = scan.nextLine();

        while (!commandData.equals("End")){
            String[] command = commandData.split(" +");

            switch (command[0]){
                case"Translate":
                    text = text.replaceAll(command[1],command[2]);
                    System.out.println(text);
                    break;
                case"Includes":
                    if(text.contains(command[1])) {
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case"Start":
                    boolean equal = true;
                    for (int i = 0; i < command[1].length(); i++) {
                        if(text.charAt(i)!=command[1].charAt(i)){
                            equal = false;
                            break;
                        }
                    }
                    if(equal){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    
                    break;
                case"Lowercase":
                    text = text.toLowerCase();
                    System.out.println(text);
                    break;
                case"FindIndex":
                    System.out.println(text.lastIndexOf(command[1]));
                    break;
                case"Remove":
                 StringBuilder newText = new StringBuilder(text);
                 newText.replace(Integer.parseInt(command[1]),Integer.parseInt(command[1])+Integer.parseInt(command[2]),"");
                    System.out.println(newText);
                    break;
            }
            commandData = scan.nextLine();
        }

    }
}
