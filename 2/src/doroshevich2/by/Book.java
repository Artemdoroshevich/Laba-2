package doroshevich2.by;

public class Book {

    private String title;
    private int price;
    private boolean hasPictures;

    public Book() {}

    public Book(String title, int price, boolean hasPictures) {
        this.title = title;
        this.price = price;
        this.hasPictures = hasPictures;
    }

    @Override
    public String toString() {
        return  "title = '" + title + '\'' +
                ", price = " + price +
                "$, hasPictures = " + hasPictures;
    }

    public void println(){
        System.out.println(this);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHasPictures(boolean hasPictures) {
        this.hasPictures = hasPictures;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public boolean arePictures() {
        return hasPictures;
    }
}
