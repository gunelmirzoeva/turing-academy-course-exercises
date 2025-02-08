package projects.find_best_book;

import java.util.*;
import java.util.stream.Collectors;

public class BookManager {

    public static List<Book> getBookList() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Atomic Habits", "James Clear", "self-improvement", 15.99, 4.34));
        books.add(new Book("1984", "George Orwell", "Dystopian", 8.99, 4.5));
        books.add(new Book("Think and Grow Rich", "Napoleon Hill", "self-improvement", 10.99, 4.17));
        books.add(new Book("The 48 Laws of Power", "Robert Greene", "self-improvement", 18.00, 4.07));
        books.add(new Book("The Art of Seduction", "Robert Greene", "self-improvement", 17.00, 4.03));
        books.add(new Book("Ego Is the Enemy", "Ryan Holiday", "self-improvement", 16.99, 4.25));
        books.add(new Book("Elon Musk", "Walter Isaacson", "biography", 20.36, 4.7));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 8.99, 4.27));

        return books;
    }
    public static List<Book> getAffordableBooks(List<Book> books, double price) {
        return books.stream()
                .filter(book -> book.getPrice() < price)
                .collect(Collectors.toList());
    }

    public static List<Book> getSortedBooks(List<Book> books) {
        return books.stream()
                .sorted(Comparator.comparingDouble(Book::getPrice))
                .collect(Collectors.toList());
    }

    public static void getMaxRatedBooks(List<Book> books) {
        Optional<Double> maxRated = books.stream().map(Book::getRating).max(Double::compareTo);
        if (maxRated.isPresent()) {
            List<Book> maxRatedBooks = books.stream().filter(book -> book.getRating() == maxRated.get())
                    .collect(Collectors.toList());

            maxRatedBooks.forEach(System.out::println);
        }
    }

    public static void groupByGenre(List<Book> books) {
        Map<String, List<Book>> booksByGenre = books.stream().collect(Collectors.groupingBy(Book::getGenre));
        booksByGenre.forEach((genre, bookList) -> {
            System.out.println("Genre: " + genre);
            bookList.forEach(System.out::println);
            System.out.println();
        });
    }
}
