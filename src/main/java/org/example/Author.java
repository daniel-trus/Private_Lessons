package org.example;

public class Author {
    String name;
    String surname;
    int born;
    String genre;
    String sex;

    public Author(String newName, String newSurname, int newBorn, String newGenre, String newSex) {
        this.name = newName;
        this.surname = newSurname;
        this.born = newBorn;
        this.genre = newGenre;
        this.sex = newSex;
    }

    public Author() {
        this.name = "";
        this.surname = "";
        this.born = 0;
        this.genre = "";
        this.sex = "";
    }


    public Author(String name) {
        this.name = name;
        this.surname = "";
        this.born = 0;
        this.genre = "";
        this.sex = "";
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBornborn(int born) {
        this.born = born;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBorn() {
        return born;
    }

    public String getGenre() {
        return genre;
    }

    public String getSex() {
        return sex;
    }

    public void authorInfo() {
        System.out.println("++++++");

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Born: " + born);
        System.out.println("Genre: " + genre);
        System.out.println("Sex: " + sex);

        System.out.println("++++++");
    }

}
