
import java.util.Scanner;

public class Dientich {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập chiều dài của hình chữ nhật: ");
		double chieuDai = scanner.nextDouble();
		System.out.println("Nhập chiều rộng của hình chữ nhật: ");
		double chieuRong = scanner.nextDouble();

		double dienTich = chieuDai * chieuRong;

		System.out.println("Diện tích của hình chữ nhật là: " + dienTich);

		scanner.close();
	}
}