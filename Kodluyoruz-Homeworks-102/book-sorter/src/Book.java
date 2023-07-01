public class Book implements Comparable<Book> {
    public String name;
    public String author;
    public int pages;
    public int date;

    public Book(String name, String author, int pages, int date) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.date = date;
    }

    public Book() {

    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    public int getPageNum() {
        return this.pages;
    }

    // Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi,
    // yayın tarihi değişkenlerinden oluşmaktadır.

}
