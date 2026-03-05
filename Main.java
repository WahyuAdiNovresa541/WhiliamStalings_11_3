package bank;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.print("Masukkan Nomor Akun : ");
    int nomor = scan.nextInt();

    System.out.print("Masukkan Saldo Awal : ");
    double saldo = scan.nextDouble();

    System.out.print("Masukkan Bunga : ");
    double bunga = scan.nextDouble();
    scan.nextLine();

    System.out.print("Masukkan Tanggal Pembuatan : ");
    String tanggal = scan.nextLine();
    
    System.out.println();
    System.out.println("Pilih Jenis Akun");
    System.out.println("1. Akun Simpanan");
    System.out.println("2. Akun Giro");
    System.out.print("Pilihan : ");
    int pilihan = scan.nextInt();
    Akun akun;

    if (pilihan == 1) {
        akun = new AkunSimpanan(nomor, saldo, bunga, tanggal);
    } else {
        System.out.print("Masukkan Limit Ceruk : ");
        double limit = scan.nextDouble();
        akun = new AkunGiro(nomor, saldo, bunga, tanggal, limit);
    }

    System.out.println();
    System.out.println("1. Penyetoran");
    System.out.println("2. Penarikan");
    System.out.print("Pilih Transaksi : ");
    int transaksi = scan.nextInt();

    System.out.println();
    System.out.print("Masukkan Jumlah : ");
    double jumlah = scan.nextDouble();

    if (transaksi == 1) {
        akun.penyetoran(jumlah);
    } else {
        akun.penarikan(jumlah);
    }

    System.out.println("\nData Akun Setelah Transaksi:");
    System.out.println(akun.toString());

    scan.close();
    }
}
