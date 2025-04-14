/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.ontap.librarydecorate;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 11:00 PM
 */

public class BasicSach implements Sach{
    private String title;
    private String author;

    public BasicSach(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void muonSach() {
        System.out.println("Da muon sach " + this.title);
    }

}
