package SmartMarbotAPP;

/**
 *
 * @author INFINIX USER
 */
public class Anggota implements Registrasi {
    private String nama;
    private String alamat;
    private String jenisKelamin;
    private int tahunMasuk;
    private int tahunKeluar;
    
    // getter dan setter (encapsulation)
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    @Override
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    @Override
    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    
    @Override
    public void setTahunKeluar(int tahunKeluar) {
        this.tahunKeluar = tahunKeluar;
    }
    
    @Override
    public int hitungLamaBertugas() {
        return tahunKeluar - tahunMasuk;
    }
    
    // getter
    @Override
    public String getNama() {
        return nama;
    }
    
    @Override
    public String getAlamat() {
        return alamat;
    }
    
    @Override
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    
    @Override
    public int getTahunMasuk() {
        return tahunMasuk;
    }
    
    @Override
    public int getTahunKeluar(){
        return tahunKeluar;
    }

}
