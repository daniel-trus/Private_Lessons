package org.example;

public class Book {
    String title;
    Author author;
    int publishYear;
    int pages;
    //    char status = 'a';
    boolean hardCover;
    double weigh;
    double price;


    public Book(String newTitle, String newName, String newSurname, int newBorn, String newGenre, String newSex,
                int newPublishYear, int newPages, boolean newHardCover, double newWeigh, double newPrice) {
        title = newTitle;
        author = new Author(newName, newSurname, newBorn, newGenre, newSex);
        publishYear = newPublishYear;
        pages = newPages;
        hardCover = newHardCover;
        weigh = newWeigh;
        price = newPrice;
    }

    public Book(String newTitle) {
        title = newTitle;
        author = new Author();
        publishYear = 0;
        pages = 0;
        hardCover = false;
        weigh = 0.0;
        price = 0.0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isHardCover() {
        return hardCover;
    }

    public void setHardCover(boolean hardCover) {
        this.hardCover = hardCover;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void bookInfo(int id) {
        System.out.println("Book " + id + " info: ");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publish year: " + publishYear);
        System.out.println("Pages: " + pages);
        System.out.println("Hard Cover: " + hardCover);
        System.out.println("Price: " + price);
//        System.out.println("Info about author: ");
//        newAuthor.authorInfo();


        System.out.println("_________");
    }

    public double priceAfterDiscount(double discount) {
        double newPrice = price - (price * discount);
        System.out.println("The new price after discount is: " + newPrice);

        return newPrice;
    }

}

//    byte
//    short
//    int
//    long

//    double
//    float
//    EMBEDDED - systemy wbudowane (jak system w pralce)
