
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("d: ");
		double chieuDai = scanner.nextDouble();
		System.out.println("r: ");
		double chieuRong = scanner.nextDouble();

		double dienTich = chieuDai * chieuRong;

		System.out.println("S: " + dienTich);

		scanner.close();
	}
}
