package bank;
public class AkunGiro extends Akun{
private double limitceruk;
    public AkunGiro(int nomorakun, double saldo, double bunga, String tanggalbuat, double limitceruk) {
        super(nomorakun, saldo, bunga, tanggalbuat);
        this.limitceruk = limitceruk;
    }

    public double getlimitceruk(){
        return limitceruk;
    }

    @Override
    public void penarikan(double jumlah){
        if (jumlah <= getsaldo() + limitceruk){
            super.penarikan(jumlah);
        } else {
            System.out.println("penarikanal Gagal... Melebihi batas overdraft.");
        }
    }

    @Override
    public String toString() {
        return "\nCek Akun" + super.toString() + "Limit Ceruk : " + limitceruk + "\n";
    }
}