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
 * @created: 28-March-2025 11:16 PM
 */


public class DocumentContext {
    private SachState state;

    public void setState(SachState state){
        this.state = state;
    }

    public void applyState(){
        this.state.handleRequest();
    }
}
