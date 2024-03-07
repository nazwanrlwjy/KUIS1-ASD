class TransaksiBarang {
    private Barang[] barangs;
    private ArrayList<Barang> pembelian = new ArrayList<>();

    public TransaksiBarang(Barang[] barangs) {
        this.barangs = barangs;
        Barang[] daftarBarang = {
            new Barang("K01", "Sabun", 1000, 5),
            new Barang("K02", "Pasta Gigi", 2000, 10),
            new Barang("K03", "Biore", 3000, 23),
            new Barang("K04", "Shampoo", 4000, 55),
            new Barang("K05", "Sikat Gigi", 5000, 65)
    };

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