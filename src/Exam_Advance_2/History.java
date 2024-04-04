package Exam_Advance_2;

import java.util.Scanner;
import java.util.Stack;

public class History {
    private static Stack<String> history = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập URL muốn truy cập\n" +
                    "2. Quay lại\n" +
                    "3. Thoát\n");
            System.out.println("***************************************************************");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập URL: ");
                    String url = scanner.nextLine();
                    inputUrl(url);
                    break;
                case 2:
                    goBack();
                    break;
                case 3:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ, chọn lại");
            }
        } while (true);
    }


    private static void inputUrl(String url) {
        //Push này đẩy vào phần tử trên cùng của stack .Cungx trả về phần tử đó
        history.push(url);
        System.out.println("Đã truy cập: " + url);
    }

    private static void goBack() {
        if (!history.isEmpty()) {
            //pop : Trả về phần tử trên cùng của stack, gỡ bỏ nó
            history.pop();
            if (!history.isEmpty()) {
                //peek : tra về phần tử trên cùng của Stack, nhưng không bỏ nó
                System.out.println("URL hiện tại: " + history.peek());
            } else {
                System.out.println("Không có URL nào ");
            }
        } else {
            System.out.println("Không có URL nào");
        }
    }
}
