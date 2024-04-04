package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Author implements IShop {
    public static List<Author> authorList = new ArrayList<>();

    private int authorId;
    private String authorName;
    private Boolean sex;
    private int year;


    public Author() {
    }

    public Author(int authorId, String authorName, Boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã tác giả :  ");
        this.authorId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tác giả : ");
        this.authorName = scanner.nextLine();
        System.out.println("Nhập giới tính theo true/false");
        this.sex=Boolean.parseBoolean(scanner.nextLine());
        System.out.println("NHập năm sinh : ");
        this.year = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName  );
    }


}
