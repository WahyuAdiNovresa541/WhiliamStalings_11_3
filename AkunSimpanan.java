package bank;
public class AkunSimpanan extends Akun {
    public AkunSimpanan(int nomorakun, double saldo, double bunga, String tanggalbuat) {
        super(nomorakun, saldo, bunga, tanggalbuat);
    }

    @Override
    public void penarikan(double jumlah) {
        if (jumlah <= getsaldo()) {
            super.penarikan(jumlah);
        } else {
            System.out.println();
            System.out.println("penarikan Gagal... Tabungan tidak boleh minus.");
        }
    }

    @Override
    public String toString(){
        return "\nSimpanan Akun" + super.toString();
    }
}
