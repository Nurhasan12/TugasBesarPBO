package SmartMarbotAPP;

/**
 *
 * @author INFINIX USER
 */
public interface Registrasi {
    void setNama(String nama);
    void setAlamat(String alamat);
    void setJenisKelamin(String jenisKelamin);
    void setTahunMasuk(int tahunMasuk);
    void setTahunKeluar(int tahunKeluar);
    int hitungLamaBertugas();
    
    // getter untuk menampilkan data
    String getNama();
    String getAlamat();
    String getJenisKelamin();
    int getTahunMasuk();
    int getTahunKeluar();
}
