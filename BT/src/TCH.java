import java.util.Scanner;

public class TCH {
    private static double tinhDienTichTamGiac(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn hình bạn muốn tính diện tích:");
        System.out.println("1. Hình vuông");
        System.out.println("2. Hình chữ nhật");
        System.out.println("3. Tam giác");
        System.out.println("4. Hình tròn");
        System.out.print("Nhập lựa chọn của bạn: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhập độ dài cạnh của hình vuông: ");
                double side = scanner.nextDouble();
                System.out.println("Diện tích hình vuông là: " + (side * side));
                break;
            case 2:
                System.out.print("Nhập chiều dài của hình chữ nhật: ");
                double length = scanner.nextDouble();
                System.out.print("Nhập chiều rộng của hình chữ nhật: ");
                double width = scanner.nextDouble();
                System.out.println("Diện tích hình chữ nhật là: " + (length * width));
                break;
            case 3:
                System.out.print("Nhập độ dài cạnh a của tam giác: ");
                double a = scanner.nextDouble();
                System.out.print("Nhập độ dài cạnh b của tam giác: ");
                double b = scanner.nextDouble();
                System.out.print("Nhập độ dài cạnh c của tam giác: ");
                double c = scanner.nextDouble();
                System.out.println("Diện tích tam giác là: " + tinhDienTichTamGiac(a, b, c));
                break;
            case 4:
                System.out.print("Nhập bán kính của hình tròn: ");
                double radius = scanner.nextDouble();
                System.out.println("Diện tích hình tròn là: " + (Math.PI * radius * radius));
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }

        scanner.close();
    }
}
