//foodorder
import java.util.ArrayList;
import java.util.List;

public class FoodOrder {
    private List<MenuItem> menuItems;
    private double totalPrice;
    private boolean isPaid;

    public FoodOrder() {
        this.menuItems = new ArrayList<>();
        this.totalPrice = 0.0;
        this.isPaid = false;
    }

    // Menambahkan item menu ke pesanan
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
        totalPrice += item.getPrice();
    }

    // Mendapatkan total harga
    public double getTotalPrice() {
        return totalPrice;
    }

    // Menandai pesanan sebagai sudah dibayar
    public void markAsPaid() {
        this.isPaid = true;
    }

    // Mengecek status pembayaran
    public boolean isPaid() {
        return isPaid;
    }

    // Mencetak daftar item menu yang dipesan
    public void printOrderDetails() {
        System.out.println("Daftar Pesanan:");
        for (MenuItem item : menuItems) {
            System.out.println("- " + item.getName() + ": " + item.getPrice());
        }
        System.out.println("Total Harga: " + totalPrice);
        System.out.println("Status Pembayaran: " + (isPaid ? "Sudah Dibayar" : "Belum Dibayar"));
    }
}