package SmartMarbotAPP;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author INFINIX USER
 */
public class SmartMarbotApp {
    
    
        private static void menuUmumkanTugas(PendaftaranAnggota pendaftaranManager) {
        System.out.println("-------------------------");
        System.out.println("-----Tugas Marbot-----");
        System.out.println("-------------------------");
        System.out.println("1. Adzan");
        System.out.println("2. Menjaga Kebersihan Masjid dan sekitar masjid.");
        System.out.println("3. Membuka dan Menutup Tempat Ibadah.");
        System.out.println("4. Memelihara Fasilitas Masjid.");
        System.out.println("5. Menjaga Ketersediaan Perlengkapan Ibadah.");
        System.out.println("6. Berkoordinasi dengan Pengurus Masjid.");
    }
        
        
    public static void main(String[] args) throws IOException, InterruptedException {
        PendaftaranAnggota pendaftaranManager = new PendaftaranAnggota();
        
        
        // anggota aktif
        AnggotaAktif anggotaAktif1 = new AnggotaAktif();
        anggotaAktif1.inputAnggotaAktif("Abdul", "Demak", "Laki-laki", 2020);
        
        AnggotaAktif anggotaAktif2 = new AnggotaAktif();
        anggotaAktif2.inputAnggotaAktif("Awabin", "Grobogan", "Laki-laki", 2022);
        
        AnggotaAktif anggotaAktif3 = new AnggotaAktif();
        anggotaAktif3.inputAnggotaAktif("Rizal", "Semarang", "Laki-laki", 2021);
        
        //alumni
        Alumni alumni1 = new Alumni();
        alumni1.inputAlumni("saiful", "Solo", "Laki-laki", 2017, 2021);

        Alumni alumni2 = new Alumni();
        alumni2.inputAlumni("Rohmat", "Pati", "Laki-laki", 2018, 2020);
        
        // Menambahkan anggota ke manajemen pendaftaran
        pendaftaranManager.tambahAnggota(anggotaAktif1);
        pendaftaranManager.tambahAnggota(anggotaAktif2);
        pendaftaranManager.tambahAnggota(anggotaAktif3);
        pendaftaranManager.tambahAnggota(alumni1);
        pendaftaranManager.tambahAnggota(alumni2);
        
        while (true) {    
            System.out.println("\n=================================");
            System.out.println("Selamat Datang di SmartMarbotApp");
            System.out.println("=================================");
            System.out.println("==============MENU===============");
            System.out.println("1. Tugas");
            System.out.println("2. Tambah Anggota Marbot");
            System.out.println("3. Anggota Aktif Marbot");
            System.out.println("4. Alumni Marbot ");
            System.out.println("5. Jumlah Anggota aktif dan alumni Marbot");
            System.out.println("0. Keluar");

            Scanner scanner = new Scanner(System.in);
            System.out.print("\nSilahkan Masukkan Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            

            switch (pilihan) {
                case 1:
                    menuUmumkanTugas(pendaftaranManager);
                    waitForUserInput();
                    break;
                case 2:
                    pendaftaranManager.tambahAnggota();
                    waitForUserInput();
                    break;
                case 3:
                    pendaftaranManager.AnggotaAktif();
                    waitForUserInput();
                    break;
                case 4:
                    pendaftaranManager.Alumni();
                    waitForUserInput();
                    break;
                case 5:
                    pendaftaranManager.tampilkanJumlahAnggota();
                    waitForUserInput();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                default :
                    System.out.println("Pilihan tidak valid");
        
            }
        }
    }

    private static void waitForUserInput() {
        System.out.println("\nTekan 0 Untuk Kembali Ke Menu Utama");
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        while (input != 0) {
            System.out.println("Input : ");
            input = scanner.nextInt();
        }
    }   
}

