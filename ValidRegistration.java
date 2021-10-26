import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "(U\\$)(?<username>[A-Z][a-z]{2,})\\1(P@\\$)(?<password>[A-Za-z]{5,}[0-9]+)\\3";
        int n = Integer.parseInt(scan.nextLine());
        Pattern pattern = Pattern.compile(regex);
        int numRegistrations = 0;


        for (int i = 0; i < n; i++) {
            String email = scan.nextLine();
            Matcher matcher = pattern.matcher(email);

            if(matcher.find()){
                String username = matcher.group("username");
                String password = matcher.group("password");
                numRegistrations++;
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n",username,password);
            }else{
                System.out.println("Invalid username or password");
            }

        }

        System.out.printf("Successful registrations: %d%n",numRegistrations);

    }
}
