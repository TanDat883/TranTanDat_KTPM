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
 * @created: 28-March-2025 11:06 PM
 */

public class MuonSachTiengAnh extends SachDecorator{
    public MuonSachTiengAnh(Sach sach) {
        super(sach);
    }

    @Override
    public void muonSach() {
        super.muonSach();
        System.out.println("Muon Sach Tieng Anh");
    }
}
