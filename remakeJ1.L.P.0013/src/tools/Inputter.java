package tools;

import java.util.Scanner;

public class Inputter {
    public static Scanner sc = new Scanner(System.in);

    // Hàm nhập số nguyên (dùng cho Menu hoặc Năm sản xuất)
    public static int inputInt(String msg, int min, int max) {
        if (min > max) {
            int t = min; min = max; max = t;
        }
        int data;
        do {
            try {
                System.out.print(msg);
                data = Integer.parseInt(sc.nextLine());
                if (data >= min && data <= max) return data;
                System.out.println("Please enter a number between " + min + " and " + max);
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer number.");
            }
        } while (true);
    }

    // Hàm nhập số thực (dùng cho Giá tiền, Tốc độ)
    public static double inputDouble(String msg, double min) {
        double data;
        do {
            try {
                System.out.print(msg);
                data = Double.parseDouble(sc.nextLine());
                if (data >= min) return data;
                System.out.println("Please enter a number >= " + min);
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a real number.");
            }
        } while (true);
    }

    // Hàm nhập chuỗi không được để trống (dùng cho Tên, Hãng...)
    public static String inputStr(String msg) {
        String data;
        do {
            System.out.print(msg);
            data = sc.nextLine().trim();
            if (!data.isEmpty()) return data;
            System.out.println("Input cannot be empty!");
        } while (true);
    }
}