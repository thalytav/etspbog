import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodOrder order = new FoodOrder();

        System.out.println("Selamat datang di restoran kami!");
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Item Menu");
            System.out.println("2. Cetak Detail Pesanan");
            System.out.println("3. Tandai sebagai Sudah Dibayar");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Menangkap newline
            
            switch (choice) {
                case 1:
                    // Menambah item menu
                    System.out.print("Masukkan nama item: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan harga item: ");
                    double price = scanner.nextDouble();
                    order.addMenuItem(new MenuItem(name, price));
                    System.out.println("Item menu '" + name + "' telah ditambahkan.");
                    break;
                    
                case 2:
                    // Cetak detail pesanan
                    order.printOrderDetails();
                    break;

                case 3:
                    // Tandai sebagai sudah dibayar
                    order.markAsPaid();
                    System.out.println("Pesanan telah ditandai sebagai sudah dibayar.");
                    break;

                case 4:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan aplikasi kami!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        }
    }
}
