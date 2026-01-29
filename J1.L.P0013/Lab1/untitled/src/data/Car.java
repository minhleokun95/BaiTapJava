package data;

// "extends Vehicle" nghĩa là Car là con của Vehicle, hưởng hết tài sản của cha
public class Car extends Vehicle {
    private String type; // Kiểu dáng (sport, travel...)
    private int yearOfManufacture; // Năm sản xuất

    // Constructor
    public Car(String id, String name, String color, double price, String brand, String type, int yearOfManufacture) {
        // super(...) là gọi constructor của cha để nạp các thông tin chung
        super(id, name, color, price, brand);
        this.type = type;
        this.yearOfManufacture = yearOfManufacture;
    }

    // Hàm showInfo của riêng Car (ghi đè lên hàm của Cha)
    @Override
    public void showInfo() {
        // Gọi hàm in của cha trước
        super.showInfo();
        // In thêm thông tin riêng của con
        System.out.printf(" %-10s | %-5d |\n", type, yearOfManufacture);
    }
}