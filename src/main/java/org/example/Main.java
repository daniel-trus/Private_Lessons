package org.example;


public class Main {
    public static void main(String[] args) {


        Car car = Car.builder().
                brand("Audi").
                model("A4").
                color("Czarny").
                gearbox(true).
                build();

        System.out.println(car.getColor());


//        Book ksiazka1 = new Book("Wiedźmin","Andrzej","Sapkowski",1950,"Fantasy",
//                "Man", 2000, 300, true,0.88, 59.9);
//
//
//        System.out.println("Książka 1: ");
//        System.out.println("Tytuł: " + ksiazka1.getTitle());
//        System.out.println("Imię i nazwisko: " + ksiazka1.getAuthor().name + " " + ksiazka1.getAuthor().surname);
//        System.out.println("Publikacja: " + ksiazka1.getPublishYear());
//
//
//        System.out.println("_____________________");
//
//
////        ksiazka1.bookInfo(1);
//
//
//        Book ksiazka2 = new Book("Piekło");
//        System.out.println(ksiazka2.title);
//
////        int id = 2;
////        ksiazka2.bookInfo(id);
//
////        Author author1 = new Author();
////        author1.authorInfo();
//
//        Author author1 = new Author("Andrzej", "Sapkowski", 1950, "Fantasy", "Man");  //wywołanie kontruktora zadeklarowanego
//        Author author2 = new Author();  //wywołanie kontruktora domyślnego
//        Author author3 = new Author("Jacek");
//        author1.setName("Jan");
//        author1.authorInfo();
//        author1.setName("Piotr");
//        System.out.println(author1.getName());
//
//
//        ksiazka2.priceAfterDiscount(0.25);
//        double newPrice1 = ksiazka1.priceAfterDiscount(0.15);



//        System.out.println("Cokolwiek" + " " + "koniec");
//
////        konkatynacja (eng. concat)
//
//        int a = 5;
//        int b;
//        b = 6;
//        int c,d;
//        System.out.println(a > b);
//        a = 7;
//        System.out.println(a > b);
//        final double x = 25;
////        x = 28;
//        c = 10;
//        d = 10;
////        && --> and
////        || --> or
//        System.out.println((a > b || 5 > 6) && c == d);
    }
}
