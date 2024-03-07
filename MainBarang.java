/**
 * MainBarang
 */
import java.util.Scanner;
public class MainBarang {
    public static void main(String[] args) {
        // Inisialisasi data barang
        Barang[] daftarBarang = {
                new Barang("K01", "Sabun", 1000, 5),
                new Barang("K02", "Pasta Gigi", 2000, 10),
                new Barang("K03", "Biore", 3000, 23),
                new Barang("K04", "Shampoo", 4000, 55),
                new Barang("K05", "Sikat Gigi", 5000, 65)
        };

        TransaksiBarang transaksi = new TransaksiBarang(daftarBarang);

        Scanner scanner = new Scanner(System.in);
        int pilihan;
        System.out.println("============================");
        System.out.println("  TOKO MAJU MUNDUR CANTIK");
        System.out.println("============================");
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Daftar Barang");
            System.out.println("2. Pembelian");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu [1-4]: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    transaksi.tampilkanBarang();
                    break;
                case 2:
                    transaksi.tampilkanBarang();
                    System.out.print("Masukkan kode barang: ");
                    String kodeBarang = scanner.next();
                    System.out.print("Masukkan jumlah pembelian: ");
                    int jumlah = scanner.nextInt();
                    transaksi.lakukanPembelian(kodeBarang, jumlah);

                    String tambahLagi;
                    do {
                        System.out.print("Tambah pembelian lagi? (y/n): ");
                        tambahLagi = scanner.next();
                        if (tambahLagi.equalsIgnoreCase("y")) {
                            transaksi.tampilkanBarang();
                            System.out.print("Masukkan kode barang: ");
                            kodeBarang = scanner.next();
                            System.out.print("Masukkan jumlah pembelian: ");
                            jumlah = scanner.nextInt();
                            transaksi.lakukanPembelian(kodeBarang, jumlah);
                        } else if (tambahLagi.equalsIgnoreCase("n")) {
                            break;
                        } else {
                            System.out.println("Input tidak valid. Masukkan 'y' atau 'n'.");
                        }
                    } while (true);
                    break;
                case 3:
                    transaksi.tampilkanBarangPembelian();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }
}