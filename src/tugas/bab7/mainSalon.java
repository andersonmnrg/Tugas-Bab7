package polymorfisme;
public class mainSalon {
    public static void main(String[] args) {
        System.out.println("==  SALON  ==");
        NonAnggota nonAnggota = new NonAnggota("doni","10005545",455000,125000);
        Premium premium = new Premium("dana","10001125",562000,68000);
        Gold gold = new Gold ("dodo","1000665",354000,552000);
        Silver silver = new Silver("dodi","10005548",455300,155000);
        Pelanggan[] pelanggan = new Pelanggan[4];
        pelanggan[0] = nonAnggota;
        pelanggan[1] = premium;
        pelanggan[2] = gold;
        pelanggan[3] = silver;
        for (int i = 0; i < pelanggan.length; i++) {
            pelanggan[i].Display();
            System.out.println("");
        }
    }
}
