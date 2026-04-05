package data;

// abstract nghĩa là lớp trừu tượng (khuôn mẫu chung, không tạo đối tượng trực tiếp từ nó)
public abstract class Vehicle {
    // Khai báo các thuộc tính chung đề bài yêu cầu
    protected String id;
    protected String name;
    protected String color;
    protected double price;
    protected String brand;

    // Constructor (Hàm khởi tạo - để nạp dữ liệu vào)
    public Vehicle(String id, String name, String color, double price, String brand) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    // Các hàm Get/Set (để lấy và sửa dữ liệu)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Hàm showInfo để in thông tin ra màn hình (các con sẽ dùng lại)
    public void showInfo() {
        System.out.printf("| %-8s | %-15s | %-10s | %-10.1f | %-10s |",
                id, name, color, price, brand);
    }
}
