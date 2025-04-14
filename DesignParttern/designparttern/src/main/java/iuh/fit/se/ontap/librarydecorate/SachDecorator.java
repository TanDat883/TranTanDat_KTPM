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
 * @created: 28-March-2025 11:04 PM
 */

public abstract class SachDecorator implements Sach{
    protected Sach sach;

    public SachDecorator(Sach sach) {
        this.sach = sach;
    }

    @Override
    public void muonSach() {
        sach.muonSach();
    }
}
