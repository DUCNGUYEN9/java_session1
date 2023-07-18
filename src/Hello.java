import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Name: ");
        String Name = scanner.nextLine();
        System.out.println("Hello " + Name);

    }
}
