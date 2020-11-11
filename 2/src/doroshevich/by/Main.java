package doroshevich.by;

import doroshevich2.by.Book;

public class Main {

    public static void println(Book[] arr) {
        for (Book obj : arr) {
            obj.println();
        }
    }

    public static int totalPrice(Book[] arr) {
        int price = 0;
        for (Book obj : arr) {
            price += obj.getPrice();
        }
        return price;
    }

    public static int numOfBooksWithPictures(Book[] arr) {
        int num = 0;
        for (Book obj : arr) {
            if (obj.arePictures())
                num++;
        }
        return num;
    }

    public static void main(String[] args) {
        Book arr[] = {
                new Book("Harry Potter", 15, true),
                new Book("Romeo and Julliet", 18, false),
                new Book(),
                new Book("Sherlock", 12, true),
        };

        arr[2].setTitle("Karlson");
        arr[2].setPrice(10);
        arr[2].setHasPictures(true);
        arr[3].setPrice(24);

        println(arr);
        System.out.println("Total price is: " + totalPrice(arr));
        System.out.println("Number of books with pictures is: " + numOfBooksWithPictures(arr));
    }
}
