/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.ontap.librarystrategy;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 10:41 PM
 */

public class Book {
    private String ten;
    private String theLoai;
    private String tacGia;

    public Book(String ten, String theLoai, String tacGia) {
        this.ten = ten;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ten='" + ten + '\'' +
                ", theLoai='" + theLoai + '\'' +
                ", tacGia='" + tacGia + '\'' +
                '}';
    }
}
