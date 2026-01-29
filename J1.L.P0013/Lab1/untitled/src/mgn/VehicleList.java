package mgn;

import data.Car;
import data.Motorbike;
import data.Vehicle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import tools.Inputter;

public class VehicleList {
    // Đây là nơi lưu trữ tất cả xe
    private ArrayList<Vehicle> list = new ArrayList<>();

    // 1. Hàm tìm vị trí của xe trong danh sách theo ID
    public int findByID(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(id)) return i;
        }
        return -1; // Không tìm thấy
    }

    // 2. Chức năng Thêm xe mới
    public void addVehicle() {
        int choice;
        do {
            System.out.println("\n1. Add Car | 2. Add Motorbike");
            choice = Inputter.inputInt("Your choice: ", 1, 2);

            String id = Inputter.inputStr("Enter ID: ");
            if (findByID(id) != -1) {
                System.out.println("ID already exists! Add failed.");
            } else {
                String name = Inputter.inputStr("Enter Name: ");
                String color = Inputter.inputStr("Enter Color: ");
                double price = Inputter.inputDouble("Enter Price: ", 0);
                String brand = Inputter.inputStr("Enter Brand: ");

                if (choice == 1) { // Thêm Car
                    String type = Inputter.inputStr("Enter Type: ");
                    int year = Inputter.inputInt("Enter Year: ", 1900, 2026);
                    list.add(new Car(id, name, color, price, brand, type, year));
                } else { // Thêm Motorbike
                    double speed = Inputter.inputDouble("Enter Speed: ", 0);
                    boolean license = Inputter.inputStr("Require License? (Y/N): ").equalsIgnoreCase("Y");
                    list.add(new Motorbike(id, name, color, price, brand, speed, license));
                }
                System.out.println("Added successfully!");
            }
            String cont = Inputter.inputStr("Continue adding? (Y/N): ");
            if (!cont.equalsIgnoreCase("Y")) break;
        } while (true);
    }

    // 3. Chức năng Xóa xe
    public void deleteVehicle() {
        String id = Inputter.inputStr("Enter ID to delete: ");
        int pos = findByID(id);
        if (pos == -1) {
            System.out.println("Vehicle does not exist.");
        } else {
            String confirm = Inputter.inputStr("Are you sure you want to delete? (Y/N): ");
            if (confirm.equalsIgnoreCase("Y")) {
                list.remove(pos);
                System.out.println("Deleted successfully!");
            }
        }
    }

    // 4. Chức năng Hiển thị tất cả
    public void showAll() {
        if (list.isEmpty()) {
            System.out.println("The list is empty!");
            return;
        }
        for (Vehicle v : list) {
            v.showInfo();
        }
    }

    // 5. Chức năng Hiển thị giảm dần theo giá
    public void showDescendingByPrice() {
        if (list.isEmpty()) return;

        // Tạo một bản sao để sắp xếp, không làm hỏng danh sách gốc
        ArrayList<Vehicle> tempList = new ArrayList<>(list);

        Collections.sort(tempList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle v1, Vehicle v2) {
                return Double.compare(v2.getPrice(), v1.getPrice());
            }
        });

        for (Vehicle v : tempList) {
            v.showInfo();
            if (v instanceof Motorbike) {
                ((Motorbike) v).makeSound(); // Gọi tiếng kêu nếu là xe máy
            }
        }
    }
}