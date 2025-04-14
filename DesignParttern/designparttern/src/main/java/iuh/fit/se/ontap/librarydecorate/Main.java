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
 * @created: 28-March-2025 11:08 PM
 */


public class Main {
    public static void main(String[] args) {
        Sach basicSach = new BasicSach("Dat", "DAT TRAN");
        Sach SachWithMuonSach = new MuonSachTiengViet(basicSach);
        Sach MuonSachTiengAnh = new MuonSachTiengAnh(basicSach);
        SachWithMuonSach.muonSach();
        MuonSachTiengAnh.muonSach();
    }
}
