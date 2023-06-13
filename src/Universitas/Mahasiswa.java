package Universitas;

public class Mahasiswa {
    private String npm, nama, prodi;
    
    public Mahasiswa(String npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
        
    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi; 
    }
    public String getDetail() {
        return "NPM: " + npm + "\nNama: " + nama + "\nProdi: " + prodi;
    }   
}
