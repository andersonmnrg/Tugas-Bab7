
package polymorfisme;
public abstract class Pelanggan {
    protected String nama;
    protected String id;
    protected double hargaJasa;
    protected double hargaJasaDisc;
    protected double hargaProduk;
    protected double hargaProdukDisc;
    protected double total;
    public Pelanggan(String nama, String id, double hargaJasa, double hargaProduk) {
        this.nama = nama;
        this.id = id;
        this.hargaJasa = hargaJasa;
        this.hargaProduk = hargaProduk;
    }
    public String getNama() {
        return nama;
    }
    public String getId() {
        return id;
    }
    public double getHargaJasa() {
        return hargaJasa;
    }
    public double getHargaProduk() {
        return hargaProduk;
    }
    public double getHargaJasaDisc() {
        return hargaJasaDisc;
    }
    public double getHargaProdukDisc() {
        return hargaProdukDisc;
    }
    public double getTotal() {
        return this.getHargaJasaDisc() + this.getHargaProdukDisc();
    }
    public void Display() {
        System.out.println("***" + this.getNama() + "\nID\t\t\t: " + this.getId());
    }
    public abstract double hargaJasaDisc();
    public abstract double hargaBarangDisc();
    public abstract double total();
}


