package polymorfisme;
public class Silver extends Pelanggan {
    public Silver(String nama, String id, double hargaJasa, double hargaProduk) {
        super(nama, id, hargaJasa, hargaProduk);
    }
    public double hargaJasaDisc() {
        return super.getHargaJasa() - (super.getHargaJasa() * 0.1);
    }
    public double hargaBarangDisc() {
        return super.getHargaProduk() - (super.getHargaProduk() * 0.1);
    }
    public double total(){
        return this.hargaBarangDisc() + this.hargaJasaDisc();
    }
    public void Display(){
        super.Display();
        System.out.println(super.toString() + "\nHarga Jasa\t\t: " + this.getHargaJasa() + "\nHarga Produk\t\t: " + this.getHargaProduk() + "\nHarga jasa setelah diskon: " + this.hargaJasaDisc() + "\nHarga produk setelah diskon:" + this.hargaBarangDisc() + "\nTotal Pembayaran\t: " + this.total());
    }
}
