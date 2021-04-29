import java.util.Scanner;

public class FactoryPatternDemo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Hình tròn");
            System.out.println("2. Hình vuông");
            System.out.println("3. Hình chữ nhật");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());

            if (choose == 0) {
                System.exit(0);
            } else {
                ShapeFactory shapeFactory = new ShapeFactory();
                Shape shape = shapeFactory.getShape(choose);
                System.out.println(shape.draw());
            }
        }
    }
}
