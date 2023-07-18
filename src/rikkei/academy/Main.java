package rikkei.academy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        float width; //Khai báo biến chiều rộng
        float height; //Khai báo biến chiều cao
        Scanner scanner = new Scanner(System.in); //Khai báo đối tượng Scaner để thực hiện các chức năng nhập liệu trong JAVA CORE
        System.out.println("Enter width: ");
        width = scanner.nextFloat(); // Nhập chiều rộng
        System.out.println("Enter height: ");
        height = scanner.nextFloat(); //Nhập chiều cao
        float area = width*height; //Khai báo biến area đồng thời tính diện tích
        System.out.println("Area is: "+area); //In ra kết quả diện tích của hình

    }
}
