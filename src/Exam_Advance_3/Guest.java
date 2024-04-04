package Exam_Advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Guest {
    private static Queue<String> customers = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập tên khách hàng chờ mua vé xem phim\n" +
                    "2. Khách tiếp theo\n" +
                    "3. Thoát");
            System.out.println("***************************************************************");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên khách hàng: ");
                    String customer = scanner.next();
                    addCustomer(customer);
                    break;
                case 2:
                    nextCustomer();
                    break;
                case 3:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ,chon lại");
            }
        } while (true);
    }
    private static void addCustomer(String customer) {
        customers.add(customer);
        System.out.println("Đã thêm khách hàng: " + customer);
    }
    private static void nextCustomer() {
        if (!customers.isEmpty()) {
            //poll : là và loại bỏ phấn đấu của hàng đợi này hoặc trả về null nều hàng đợi này trống
            String nextCustomer = customers.poll();
            System.out.println("Khách hàng tiếp theo: " + nextCustomer);
        } else {
            System.out.println("Không còn khách hàng trong hàng đợi.");
        }
    }
}

