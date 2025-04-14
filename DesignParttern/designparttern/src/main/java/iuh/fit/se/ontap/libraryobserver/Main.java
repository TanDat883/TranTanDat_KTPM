/*
 * @(#) $(NAME).java    1.0     3/28/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package iuh.fit.se.ontap.libraryobserver;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 28-March-2025 11:43 PM
 */

public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();
        // Tạo các quan sát viên (Observers)
        Librarian librarian1 = new Librarian("Alice");
        Librarian librarian2 = new Librarian("Bob");
        LibraryUser user1 = new LibraryUser("John");
        LibraryUser user2 = new LibraryUser("Emma");

        library.register(librarian1);
        library.register(librarian2);
        library.register(user1);

        library.addBook("Conan");
        library.addBook("Naruto");
        library.unregister(user1);
        library.BookExpiry("Conan");
    }
}
