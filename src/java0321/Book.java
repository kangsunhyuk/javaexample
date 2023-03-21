package java0321;

public class Book {
    String title;
    String author;
    void show(){
        System.out.println(title + " " + author);
    }
    public Book(){
        this("","홍길동");
    }
    public Book(String title){
        this(title, "작가미상");
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book emtpyBook = new Book("자바를 배우자");
        emtpyBook.show();
    }
}

