import java.util.ArrayList;
import java.util.List;

public class Library{
    private  List<Book> books= new ArrayList<>();
    public void addBook (Book book){
        books.add(book);
        System.out.println("[+] Kitap eklendi: " + book.getBname());
    }
    public void listBooks(){
        if (books.isEmpty()){
            System.out.println("Kütüphane de hiç kitap yok.");
            return;
        }
        System.out.println("\n--- KÜTÜPHANE KİTAP LİSTESİ ---");
        for (Book book : books){
            System.out.println(book);
        }
    }
    public void borrowBook(String id){
        for(Book book: books){
            if(book.getId().equals(id)){
                if (book.isAvailable()){
                    book.setAvailable(false);
                    System.out.println("[✓] Başarıyla ödünç alındı: " + book.getBname());
                }
                else {
                    System.out.println("Bu kitap zaten başka üyede.");
                    return;
                }
            }
            System.out.println("Kitap bulunamadı.");
        }
    }
    public void returnBook(String id){
        for (Book book : books) {
            if (book.getId().equals(id)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("[✓] Kitap iade alındı: " + book.getBname());
                } else {
                    System.out.println("[!] Bu kitap zaten kütüphanede.");
                }
                return;
            }
        }
        System.out.println("[X] Kitap bulunamadı!");
    }
    }
