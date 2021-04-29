import java.util.Scanner;

public class Square implements Shape {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String draw() {
        System.out.print("Nhập cạnh hình vuông: ");
        int edge = Integer.parseInt(scanner.nextLine());

        int perimeter = edge * 4;
        int area = edge * edge;
        return "Hình vuông có cạnh = " + edge + ", chu vi = " + perimeter + ", diện tích = " + area;
    }
}
