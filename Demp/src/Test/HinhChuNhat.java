package Test;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();
        System.out.println("Nhập chiều rộng của hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        double chuVi = 2 * (chieuDai + chieuRong);

        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);

        scanner.close();
    }
}
