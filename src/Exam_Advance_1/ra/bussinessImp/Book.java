package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static Exam_Advance_1.ra.bussinessImp.Author.authorList;
public class Book implements IShop {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private Author author;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private boolean bookStatus;



    // Các constructor
    public Book() {}

    public Book(int bookId, String bookName, String title, int numberOfPages, Author author, float importPrice, float exportPrice, int quantity, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }
    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        this.bookId = scanner.nextInt();
        System.out.println("Nhập tên sách: ");
        this.bookName = scanner.next();
        System.out.println("Nhập tiêu đề sách: ");
        this.title = scanner.next();
        System.out.println("Nhập số trang sách: ");
        this.numberOfPages = scanner.nextInt();
        System.out.println("Nhập giá nhập sách: ");
        this.importPrice = scanner.nextFloat();
        System.out.println("Nhập số lượng sách: ");
        this.quantity = scanner.nextInt();
        System.out.println("Nhập trạng thái sách true/false: ");
        this.bookStatus = scanner.nextBoolean();

        this.exportPrice = this.importPrice * RATE;

        chooseAuthor();
    }

    public void chooseAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh sách tác giả:");
        for (int i = 0; i < authorList.size(); i++) {
            System.out.println((i + 1) + ". " + authorList.get(i).getAuthorName());
        }
        System.out.println("Chọn số thứ tự của tác giả:");
        int authorIndex = scanner.nextInt();
        this.author = authorList.get(authorIndex - 1);
    }
    public void displayData(){
        System.out.println("Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author=" + this.author.getAuthorName() +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", quantity=" + quantity +
                ", bookStatus=" + (this.bookStatus ? "Còn hàng" : "Hết hàng") +
                '}');
    }



}
