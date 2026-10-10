import java.util.Scanner;

// Kelas Utama untuk Menjalankan Program & Menu Interaktif
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU PROGRAM GEOMETRI ===");
            System.out.println("1. Bujur Sangkar");
            System.out.println("2. Lingkaran");
            System.out.println("3. Silinder");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi: ");
                    double sisi = scanner.nextDouble();
                    System.out.print("Masukkan warna bujur sangkar: ");
                    String warnaBS = scanner.next();
                    BujurSangkar bs = new BujurSangkar(sisi, warnaBS);
                    bs.printInfo();
                    break;
                case 2:
                    System.out.print("Masukkan radius lingkaran: ");
                    double radius = scanner.nextDouble();
                    System.out.print("Masukkan warna lingkaran: ");
                    String warnaLingkaran = scanner.next();
                    Lingkaran lingkaran = new Lingkaran(radius, warnaLingkaran);
                    lingkaran.printInfo();
                    break;
                case 3:
                    System.out.print("Masukkan tinggi silinder: ");
                    double tinggi = scanner.nextDouble();
                    System.out.print("Masukkan radius silinder: ");
                    double radiusSilinder = scanner.nextDouble();
                    System.out.print("Masukkan warna silinder: ");
                    String warnaSilinder = scanner.next();
                    Silinder silinder = new Silinder(tinggi, radiusSilinder, warnaSilinder);
                    silinder.printInfo();
                    break;
                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}