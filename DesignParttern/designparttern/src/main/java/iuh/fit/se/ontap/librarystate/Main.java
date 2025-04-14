/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.ontap.librarystate;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 11:17 PM
 */


public class Main {
    public static void main(String[] args) {
        DocumentContext context = new DocumentContext();
        context.setState(new ChuanBiSach());
        context.applyState();
        context.setState(new GiaoSach());
        context.applyState();
        context.setState(new HuySach());
        context.applyState();
    }
}
