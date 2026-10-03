import java.util.*;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        library.addBook(new Book("101", "Suç ve Ceza", "Dostoyevski"));
        library.addBook(new Book("102", "1984", "George Orwell"));

        do {
            System.out.println("\n--- KÜTÜPHANE OTOMASYONU ---");
            System.out.println("1. Kitapları Listele");
            System.out.println("2. Yeni Kitap Ekle");
            System.out.println("3. Kitap Ödünç Al");
            System.out.println("4. Kitap İade Et");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Kitap Adı: ");
                    String title = scanner.nextLine();
                    System.out.print("Yazar: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(isbn, title, author));
                    break;
                case 3:
                    System.out.print("Ödünç alınacak ISBN: ");
                    String bIsbn = scanner.nextLine();
                    library.borrowBook(bIsbn);
                    break;
                case 4:
                    System.out.print("İade edilecek ISBN: ");
                    String rIsbn = scanner.nextLine();
                    library.returnBook(rIsbn);
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        } while (choice != 0);

        scanner.close();
    }
}