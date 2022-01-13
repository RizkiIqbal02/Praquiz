package praquiz;

public class Contoh {
    public String hewan;
    public int ekor;

    public Contoh (String binatang, int buntut){
        this.hewan = binatang;
        this.ekor = buntut;
    }

    public static void main(String[] args) {
        Contoh contoh = new Contoh( "Syarif", 9);
        String[] namaHewan = new String[3];
        namaHewan[0]= "Kucing";
        namaHewan[1]= "Syarif";
        namaHewan[2]= "Buaya";
        System.out.println(namaHewan[0]);
        System.out.println(namaHewan[1]);
        System.out.println(namaHewan[2]);
    }
}
