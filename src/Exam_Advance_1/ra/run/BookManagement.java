package Exam_Advance_1.ra.run;

import Exam_Advance_1.ra.bussinessImp.Author;
import Exam_Advance_1.ra.bussinessImp.Book;

import java.util.*;

import static Exam_Advance_1.ra.bussinessImp.Author.authorList;

public class BookManagement {

    static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập số tác giả và nhập thông tin các tác giả [10 điểm]\n" +
                    "2. Nhập số sách và nhập thông tin các sách [20 điểm]\n" +
                    "3. Sắp xếp sách theo giá xuất sách tăng dần (Comparable/Comparator) [10 điểm]\n" +
                    "4. Tìm kiếm sách theo tên tác giả sách [05 điểm]\n" +
                    "5. Thoát [05 điểm]");
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:addAuthors();
                break;
                case 2:addBook();
                break;
                case 3:sortExportPriceBook();
                break;
                case 4:searchNameAuthorByBook();
                break;
                case 5:System.exit(0);
                default:
                    System.out.println("Nhập lại ko hợp lệ ");
            }
        }while (true);
    }
    private static void addAuthors(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tác giar muốn thêm : ");
        int numberAuthor = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberAuthor; i++) {
            Author author = new Author();
            author.inputData();
            authorList.add(author);
        }
    }
    private static void addBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số sách muốn thêm");
        int numberBook = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberBook; i++) {
            Book book = new Book();
            book.inputData();
            bookList.add(book);
        }
    }
    private static void sortExportPriceBook(){
        Collections.sort(bookList, Comparator.comparing(Book::getExportPrice));
        System.out.println("Danh sách sau sắp xếp");
        for (Book book : bookList){
            book.displayData();
        }
    }
    private static void searchNameAuthorByBook(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập tên sách muốn tìm : ");
        String nameSearch = scanner.nextLine();
        boolean check = false;
        for (Book book : bookList){
            if (book.getAuthor().getAuthorName().contains(nameSearch)){
                book.displayData();
                check = true;
            }
        }
        if (!check){
            System.out.println("Ko có trong danh sach tùm");
        }
    }
}
