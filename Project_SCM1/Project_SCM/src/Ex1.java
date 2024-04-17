import java.util.Scanner;

public class Ex1 {
	public static int nhap(Scanner input) {
		boolean check = false;
		int n = 0;
		while (!check) {
			System.out.print(" ");
			try {
				n = input.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("Ban phai nhap so! hay nhap lai...");
				input.nextLine();
			}
		}
		return (n);
	}

	public static int UCLN(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return (a);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap a");
		int a = nhap(input);
		System.out.println("Nhap b");
		int b = nhap(input);
		System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + UCLN(a, b));
	}
}