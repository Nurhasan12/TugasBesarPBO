package SmartMarbotAPP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author INFINIX USER
 */
public class PendaftaranAnggota {
    private final List<Registrasi> daftarPendaftaran = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    
    // Metode untuk menambahkan anggota baru secara manual
    public void tambahAnggota() {
        System.out.println("\n=====Masukkan Data Diri Anggota Baru atau Alumni=====");
        System.out.print("\nNama : ");
        String nama = scanner.nextLine();
        System.out.print("Alamat : ");
        String alamat = scanner.nextLine();
        System.out.print("Jenis Kelamin : ");
        String jenisKelamin = scanner.nextLine();
        System.out.print("Tahun Masuk: ");
        int tahunMasuk = scanner.nextInt();
        scanner.nextLine(); // baris baru
        // Pilih jenis anggota (aktif/alumni)
        System.out.print("Jenis Anggota (Aktif/Alumni): ");
        String jenisAnggota = scanner.nextLine();
        
        System.out.print("Tahun Keluar (Isi 0 Jika anggota baru) : ");
        int tahunKeluar = scanner.nextInt();
        scanner.nextLine(); // baris baru

        Registrasi anggota;

        if ("Aktif".equalsIgnoreCase(jenisAnggota)) {
            anggota = new AnggotaAktif();
            ((AnggotaAktif) anggota).inputAnggotaAktif(nama, alamat, jenisKelamin, tahunMasuk);
        } else if ("Alumni".equalsIgnoreCase(jenisAnggota)) {
            anggota = new Alumni();
            ((Alumni) anggota).inputAlumni(nama, alamat, jenisKelamin, tahunMasuk, tahunKeluar);
        } else {
            System.out.println("Jenis anggota tidak valid.");
            return;
        }

        tambahAnggota(anggota);
        System.out.println("\n======Anggota berhasil ditambahkan=====");
    }
      
    // menambahkan anggota baru
    public void tambahAnggota(Registrasi anggota) {
        daftarPendaftaran.add(anggota);
    }
    
    // menampilkan semua anggota
    public void tampilkanAnggota() {
        for (Registrasi anggota : daftarPendaftaran) {
            System.out.println("\nNama: " + anggota.getNama());
            System.out.println("Alamat: " + anggota.getAlamat());
            System.out.println("Jenis Kelamin: " + anggota.getJenisKelamin());
            System.out.println("Tahun Masuk: " + anggota.getTahunMasuk());
            System.out.println("Tahun Keluar: " + anggota.getTahunKeluar());
            System.out.println("Lama Bertugas: " + anggota.hitungLamaBertugas() + " tahun");
            System.out.println("------------------------------");
        }
    }
    
    //metode untuk menampilkan jumlah anggota
    public void tampilkanJumlahAnggota() {
        System.out.println("=================================");
        System.out.println("Jumlah Anggota dan Alumni : "+ daftarPendaftaran.size());
        System.out.println("=================================");
    }
    
    // metode untuk mmengecek anggota aktif
    public void AnggotaAktif(){
         System.out.println("\n===== Anggota Aktif =====");
        for (Registrasi anggota : daftarPendaftaran) {
            if (anggota instanceof AnggotaAktif) {
                System.out.println("\nNama: " + anggota.getNama());
                System.out.println("Alamat: " + anggota.getAlamat());
                System.out.println("Jenis Kelamin: " + anggota.getJenisKelamin());
                System.out.println("Tahun Masuk: " + anggota.getTahunMasuk());
                System.out.println("------------------------------");
            }
        }
    }
    
    //metode untuk mengecek alumni
    public void Alumni(){
        System.out.println("\n===== Alumni =====");
        for (Registrasi anggota : daftarPendaftaran) {
            if (anggota instanceof Alumni) {
                System.out.println("\nNama: " + anggota.getNama());
                System.out.println("Alamat: " + anggota.getAlamat());
                System.out.println("Jenis Kelamin: " + anggota.getJenisKelamin());
                System.out.println("Tahun Masuk: " + anggota.getTahunMasuk());
                System.out.println("Tahun Keluar: " + anggota.getTahunKeluar());
                System.out.println("Lama Bertugas: " + anggota.hitungLamaBertugas() + " tahun");
                System.out.println("------------------------------");
            }
        }
    }
}

