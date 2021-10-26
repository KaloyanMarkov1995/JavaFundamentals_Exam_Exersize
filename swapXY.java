import java.util.Scanner;

public class swapXY {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("X = ");
        int x = Integer.parseInt(scan.nextLine());
        System.out.print("Y = ");
        int y = Integer.parseInt(scan.nextLine());

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("X = "+x);
        System.out.println("Y = "+y);

    }

}
