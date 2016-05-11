package polymorfisme;

public class NonAnggota extends Pelanggan {

    public NonAnggota(String nama, String id, double hargaJasa, double hargaProduk) {
        super(nama, id, hargaJasa, hargaProduk);
    }

    public double hargaJasaDisc() {
        return super.getHargaJasa();
    }

    public double hargaBarangDisc() {
        return super.getHargaProduk();
    }

    public double total() {
        return super.getHargaJasaDisc() + super.getHargaProdukDisc();
    }

    public void Display() {
        super.Display();
        System.out.println("Harga Jasa\t\t: " + this.getHargaJasa() + "\nHarga Produk\t\t: " + this.getHargaProduk() + "\nTotal Pembayaran\t: " + this.total() + "\n---Tidak ada diskon untuk non anggota---");
    }
}
