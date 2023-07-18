import java.util.Scanner;

public class Monney {
    public static void main(String[] args) {
        float rate = 23000f;
        System.out.println("Hãy nhập tiền USD: ");
        Scanner scanner= new Scanner(System.in);
        int dollar= Integer.parseInt(scanner.nextLine());
        System.out.println("Đổi sang tiền VND là: " + dollar*rate);
    }
}
