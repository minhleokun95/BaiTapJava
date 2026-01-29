package data;

public class Motorbike extends Vehicle {
    private double speed;            // Tốc độ
    private boolean licenseRequired; // Có cần bằng lái không

    // Constructor
    public Motorbike(String id, String name, String color, double price, String brand, double speed, boolean licenseRequired) {
        super(id, name, color, price, brand);
        this.speed = speed;
        this.licenseRequired = licenseRequired;
    }

    // Hàm đặc biệt yêu cầu đề bài: Tạo tiếng kêu
    public void makeSound() {
        System.out.println("Tin tin tin");
    }

    // Ghi đè hàm in thông tin
    @Override
    public void showInfo() {
        super.showInfo(); // In phần chung
        // In phần riêng (speed, license)
        System.out.printf(" %-10.1f | %-10s |\n", speed, licenseRequired ? "Yes" : "No");
    }
}