import java.util.*;
public class Book {
    String id;
    String bname;
     String author;
     boolean isAvailable;

    public Book(String id,String bname,String author){
        this.id=id;
        this.bname=bname;
        this.author=author;
        this.isAvailable=true;
    }

    public String getAuthor() {
        return author;
    }

    public String getBname() {
        return bname;
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public String toString(){
        return "ISBN: " + id + " | Kitap: " + bname + " | Yazar: " + author +
                " | Durum: " + (isAvailable ? "Rafta" : "Ödünç Verildi");
    }
}

