package data;

// "extends Vehicle" nghĩa là Car là con của Vehicle, hưởng hết tài sản của cha
public class Car extends Vehicle {
    private String type;
    private int yearOfManufacture;

    // Constructor
    public Car(String id, String name, String color, double price, String brand, String type, int yearOfManufacture) {
        super(id, name, color, price, brand);
        this.type = type;
        this.yearOfManufacture = yearOfManufacture;
    }

    // Hàm showInfo của riêng Car (ghi đè lên hàm của Cha)
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf(" %-10s | %-5d |\n", type, yearOfManufacture);
    }
}