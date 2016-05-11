package polymorfisme;
public class Premium extends Pelanggan {
    public Premium(String nama, String id, double hargaJasa, double hargaProduk) {
        super(nama, id, hargaJasa, hargaProduk);
    }
    public double hargaJasaDisc() {
        return super.getHargaJasa() - (super.getHargaJasa()* 0.2);
    }
    public double hargaBarangDisc() {
        return this.getHargaProduk() - (this.getHargaProduk() * 0.1);
    }
    public double total(){
        return this.hargaJasaDisc() + this.hargaBarangDisc();
    }
    public void Display(){
        super.Display();
        System.out.println(super.toString() + "\nHarga Jasa\t\t: " + this.getHargaJasa() + "\nHarga Produk\t\t: " + this.getHargaProduk() + "\nHarga jasa setelah diskon: " + this.hargaJasaDisc() + "\nHarga produk setelah diskon:" + this.hargaBarangDisc() + "\nTotal Pembayaran\t: " + this.total());
    }
}
