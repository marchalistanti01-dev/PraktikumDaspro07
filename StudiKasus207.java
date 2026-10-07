import java.util.Scanner;

public class StudiKasus207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        int juara;
        int jumlahDokumen;
        int statusPKM;

        System.out.print("Masukkan nama mahasiswa: ");
        nama = sc.nextLine();

        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            System.out.print("Masukkan peringkat juara (1/2/3/0): ");
            juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {

                System.out.print("Masukkan jumlah dokumen yang diupload (0-4): ");
                jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status: Dana penghargaan diberikan");
                    System.out.println("Alasan: Meraih juara " + juara
                            + " dan dokumen lengkap.");
                } else {
                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status: Dana penghargaan tidak diberikan");
                    System.out.println("Alasan: Dokumen belum lengkap.");
                    System.out.println("Jumlah dokumen yang masih kurang: "
                            + (4 - jumlahDokumen));
                }

            } else {
                System.out.println("Nama mahasiswa: " + nama);
                System.out.println("Status: Dana penghargaan tidak diberikan");
                System.out.println("Alasan: Bukan peraih juara 1, 2, atau 3.");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Masukkan status pendanaan PKM (1=lolos, 0=tidak lolos): ");
            statusPKM = sc.nextInt();

            if (statusPKM == 1) {

                System.out.print("Masukkan jumlah dokumen yang diupload (0-4): ");
                jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status: Dana penghargaan diberikan");
                    System.out.println("Alasan: PKM lolos pendanaan dan dokumen lengkap.");
                } else {
                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status: Dana penghargaan tidak diberikan");
                    System.out.println("Alasan: Dokumen belum lengkap.");
                    System.out.println("Jumlah dokumen yang masih kurang: "
                            + (4 - jumlahDokumen));
                }

            } else {
                System.out.println("Nama mahasiswa: " + nama);
                System.out.println("Status: Dana penghargaan tidak diberikan");
                System.out.println("Alasan: PKM tidak lolos pendanaan.");
            }
        } else {
            System.out.println("Nama mahasiswa: " + nama);
            System.out.println("Status: Dana penghargaan tidak diberikan");
            System.out.println("Alasan: Jenis kegiatan termasuk Lainnya.");
        }

        sc.close();
    }
}