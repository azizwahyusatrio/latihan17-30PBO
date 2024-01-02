/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahaiswa;

/**
 *
 * @author ASUS
 */
public class MahaSiswa {
    private String nama;
    private int umur;
    
    public Mahasiswa(String nama, int umur) {
       this.nama = nama;
       this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void displayInfo() {
        System.out.println("Saya " + getNama() + " umur " + getUmur());
    }
    
    class MahasiswaBaru extends Mahasiswa {
        private int nim;
        
        public MahasiswaBaru(String nama, int umur, int nim) {
            super(nama, umur);
            this.nim = nim;
        }
        
        public int getNim() {
            return nim;
        }
        
        @Override
        public void displayInfo() {
            System.out.println("Saya " + getNama() + " umur " + getUmur() + " dengan nim " + nim);
        }
    }
    
    class MahasiswaLama extends Mahasiswa {
        private int angkatan;
        
        public MahasiswaLama(String nama, int umur, int angkatan) {
            super(nama, umur);
            this.angkatan = angkatan;
    }
    }
    
    public int getAngkatan() {
        return angkatan;
    }
    
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " saya angkatan " + angkatan);
    }
}

    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa(nama: "aziz", umur:19);
        Mahasiswa.MahasiswaBaru mahasiswaBaru = mahasiswa.new MahasiswaBaru(nama: "aziz", umur: 19, nim:22166026);
        MahasiswaBaru.displayInfo();
        Mahasiswa.MahasiswaLama mahasiswaLama = mahasiswa.new MahasiswaLama(nama:"joko", umur:22, angkatan 2019);
        mahasiswaLama.displayInfo();
    }


