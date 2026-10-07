import java.util.Scanner;
public class StudiKasus109 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int hargaPerCup=18000, jumlahCup, uangbayar,
        totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.println("Masukkan jumlah cup :");
        jumlahCup=sc.nextInt();
        System.out.println("Masukkan uang bayar :");
        uangbayar=sc.nextInt();

        totalHarga=jumlahCup*hargaPerCup;
        diskon=0;
        totalBayar=0;
        kembalian=0;
        kurang=0;

        System.out.println("Total harga yang diperoleh :"+totalHarga);


        if (totalHarga>=100000) {
            diskon=totalHarga*10/100;
            totalBayar=totalHarga-diskon;
            System.out.println("Diskon yang diperoleh :"+diskon);
            System.out.println("Total bayar diperoleh :"+totalBayar);
        } else {
            diskon=0;
        }
        if (uangbayar>=totalBayar) {
            kembalian=uangbayar-totalBayar;
            System.out.println("Kembalian :"+kembalian);

        } else {
            kurang=totalBayar-uangbayar;
            System.out.println("Uang tidak cukup, kurang Rp"+kurang);
        }

    }
}