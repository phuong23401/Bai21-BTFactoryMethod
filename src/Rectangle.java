import java.util.Scanner;

public class Rectangle implements Shape {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String draw() {
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        int width = Integer.parseInt(scanner.nextLine());

        int perimeter = (length + width) * 2;
        int area = length * width;
        return "Hình vuông có chiều dài = " + length + ", chiều rộng = " + width + ", chu vi = " + perimeter + ", diện tích = " + area;
    }
}
