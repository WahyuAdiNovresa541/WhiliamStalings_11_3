package bank;
public class Akun {
    private int nomorakun;
    private double saldo;
    private double bunga;
    private String tanggalbuat;

    public Akun(int nomorakun, double saldo, double bunga, String tanggalbuat) {
        this.nomorakun = nomorakun;
        this.saldo = saldo;
        this.bunga = bunga;
        this.tanggalbuat = tanggalbuat;
    }

    public int getnomorakun() {
        return nomorakun;
    }

    public double getsaldo() {
        return saldo;
    }
    
    public double getbunga() {
        return bunga;
    }

    public String gettanggalbuat() {
        return tanggalbuat;
    }

    public void penyetoran(double jumlah){
        saldo += jumlah;
    }

    public void penarikan(double jumlah){
        saldo -= jumlah;
    }

    @Override
    public String toString(){
        return "\nNomor Akun : " + nomorakun + "\nsaldo : " + saldo + "\nBunga yang Diterima : " + 
        bunga + "\nTanggal Pembuatan : " + tanggalbuat + "\n";
    }
}
