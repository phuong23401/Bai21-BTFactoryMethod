import java.util.Scanner;

public class Circle implements Shape {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String draw() {
        System.out.print("Nhập bán kính hình tròn: ");
        int radius = Integer.parseInt(scanner.nextLine());

        int perimeter = (int) (2 * Math.PI * radius);
        int area = (int) (Math.PI * radius * radius);
        return "Hình tròn có bán kính = " + radius + ", chu vi = " + perimeter + ", diện tích = " + area;
    }
}
