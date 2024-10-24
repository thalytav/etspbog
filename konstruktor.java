// Kelas Book
public class Book {
    // Atribut
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public String namaPenerbit;
    public String kategori;

    // Konstruktor untuk menginisialisasi atribut
    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategori = kategori;
    }

    // Metode untuk mencetak detail buku
    public void printDetails() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Penerbit: " + namaPenerbit);
        System.out.println("Kategori: " + kategori);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Book menggunakan konstruktor
        Book buku1 = new Book("Laskar Pelangi", "Andrea Hirata", 2005, "Bentang Pustaka", "Novel");
        Book buku2 = new Book("Clean Code", "Robert C. Martin", 2008, "Prentice Hall", "Teknologi");

        // Memanggil metode printDetails untuk mencetak detail buku
        buku1.printDetails();
        System.out.println();  // Garis pemisah
        buku2.printDetails();
    }
}
