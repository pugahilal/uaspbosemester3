package uasno1;
public class uasno1 {
    // Atribut
    private String nama;
    private int umur;

    // Konstruktor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode Getter dan Setter
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

    // Metode untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
public class MahasiswaBaru extends Mahasiswa {
    // Atribut tambahan untuk MahasiswaBaru
    private int nim;

    // Konstruktor
    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }

    // Metode Getter dan Setter untuk MahasiswaBaru
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    // Override metode displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM: " + nim);
    }
}
public class MahasiswaLama extends Mahasiswa {
    // Atribut tambahan untuk MahasiswaLama
    private int angkatan;

    // Konstruktor
    public MahasiswaLama(String nama, int umur, int angkatan) {
        super(nama, umur);
        this.angkatan = angkatan;
    }

    // Metode Getter dan Setter untuk MahasiswaLama
    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    // Override metode displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Angkatan: " + angkatan);
    }
}
public class Main {
    public static void main(String[] args) {
        // Membuat objek MahasiswaBaru
        MahasiswaBaru mahasiswaBaru = new MahasiswaBaru("John", 20, 12345);
        mahasiswaBaru.displayInfo();

        System.out.println(); // Spasi antara output

        // Membuat objek MahasiswaLama
        MahasiswaLama mahasiswaLama = new MahasiswaLama("Alice", 22, 2019);
        mahasiswaLama.displayInfo();
    }
}