package projects.find_best_book;


public class Book {
    private String title;
    private String author;
    private String genre;
    private double price;
    private double rating;
    public Book(String title, String author, String genre, double price, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return title + " by " + author + " [" + genre + "] - $" + price + " (" + rating + ")";
    }

}
