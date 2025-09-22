package mid1.nested.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final int maxLength;

    private final List<Book> bookList = new ArrayList<>();

    public Library(int length) {
        this.maxLength = length;
    }

    public void addBook(String title, String author) {

        if (bookList.size() >= maxLength) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        bookList.add(new Book(title, author));
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : bookList) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }

    private static class Book {

        private final String title;

        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
