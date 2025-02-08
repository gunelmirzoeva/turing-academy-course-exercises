package projects.find_best_book;

import java.util.List;
import java.util.Scanner;

import static projects.find_best_book.BookManager.*;

public class BookManagerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = getBookList();
        System.out.println("Enter your budget: ");
        double price = sc.nextDouble();

        System.out.println("\n----------Filtering Affordable Books-------------\n");
        List<Book> affordableBooks = getAffordableBooks(books, price);
        affordableBooks.forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        System.out.println("\n----------------Sorted By Price-------------------\n");
        List<Book> sortedBooks = getSortedBooks(books);
        sortedBooks.forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        System.out.println("\n-----------------Max Rated Books------------------\n");
        getMaxRatedBooks(books);
        System.out.println("----------------------------------------------------");
        System.out.println("\n---------------Grouping By Genre------------------\n");
        groupByGenre(books);
        System.out.println("----------------------------------------------------");
    }
}
