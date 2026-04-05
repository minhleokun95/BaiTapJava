package mgn;

import tools.Inputter;

public class Main {
    public static void main(String[] args) {
        VehicleList manager = new VehicleList();
        int choice;

        do {
            System.out.println("\n========= Quản Lý Phương Tiện =========");
            System.out.println("1. Thêm phương tiện mới");
            System.out.println("2. Xóa phương tiện dựa theo ID");
            System.out.println("3. Hiển thị tất cả phương tiện");
            System.out.println("4. Hiển thị phương tiện theo giá tiền");
            System.out.println("Khác, Thoát ");

            choice = Inputter.inputInt("Chọn tùy chọn của bạn", 1, 10);

            switch (choice) {
                case 1: manager.addVehicle(); break;
                case 2: manager.deleteVehicle(); break;
                case 3: manager.showAll(); break;
                case 4: manager.showDescendingByPrice(); break;
                default:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
        } while (true);
    }
}