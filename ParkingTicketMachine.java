// Kelas ParkingTicketMachine
public class ParkingTicketMachine {
    // Atribut
    public int balance = 0;
    public int ticketPrice = 5000;  // Harga per jam parkir
    public int ticketTime = 0;  // Waktu parkir yang dibeli dalam jam

    // Metode untuk menambahkan uang
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have inserted: Rp" + amount);
        } else {
            System.out.println("Invalid amount. Please insert a valid amount.");
        }
    }

    // Metode untuk mengeluarkan tiket parkir
    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice;
            System.out.println("Ticket issued for " + ticketTime + " hours.");
            balance = balance % ticketPrice;  // Sisa saldo setelah membeli tiket
        } else {
            System.out.println("Insufficient balance. Please insert more money.");
        }
    }

    // Metode untuk mendapatkan waktu parkir yang telah dibeli
    public int getTimePurchased() {
        return ticketTime;
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek ParkingTicketMachine
        ParkingTicketMachine machine = new ParkingTicketMachine();

        // Simulasi
        machine.insertMoney(10000);  // Masukkan Rp10.000
        machine.issueTicket();  // Keluarkan tiket
        System.out.println("Time purchased: " + machine.getTimePurchased() + " hours");
        
        // Masukkan lagi uang
        machine.insertMoney(3000);  // Masukkan Rp3.000
        machine.issueTicket();  // Coba keluarkan tiket lagi
        System.out.println("Time purchased: " + machine.getTimePurchased() + " hours");
    }
}
