import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen = 0, peringkatJuara = 0, totalDokumen = 0, statusPendanaan = 0;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine().trim();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            peringkatJuara = sc.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen >= 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    totalDokumen = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + totalDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1=lolos, 0=tidak lolos) : ");
            statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1) {
                if (jumlahDokumen >= 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    totalDokumen = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + totalDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status : Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan.");
        }

        sc.close();
    }
}