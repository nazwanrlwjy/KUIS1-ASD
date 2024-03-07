import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    public String kode;
    public String nama;
    public double harga;
    public int stok;

    public Barang(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}

class TransaksiBarang {
    private Barang[] barangs;
    private ArrayList<Barang> pembelian = new ArrayList<>();

    public TransaksiBarang(Barang[] barangs) {
        this.barangs = barangs;
    }

    public void lakukanPembelian(String kodeBarang, int jumlah) {
            boolean ditemukan = false;
            for (Barang barang : barangs) {
                if (barang.getKode().equals(kodeBarang)) {
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan.");
            }
        
    }

    public void tampilkanBarangPembelian() {
        System.out.println("===============================");
        System.out.println("     Daftar Barang Dibeli");
        System.out.println("===============================");
        System.out.printf("%-10s %-20s %-10s %-10s%n", "Kode", "Nama", "Harga", "Jumlah");
        for (Barang barang : pembelian) {
            System.out.printf("%-10s %-20s %-10.2f %-10d%n",
                    barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
        }
    }
    public void tampilkanBarang() {
        System.out.println("=====================");
        System.out.println("   Daftar Barang:");
        System.out.println("=====================");
        System.out.printf("%-10s %-20s %-10s %-10s%n", "Kode", "Nama", "Harga", "Stok");
        for (Barang barang : barangs) {
            System.out.printf("%-10s %-20s %-10.2f %-10d%n",
                    barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
        }
    }
    }