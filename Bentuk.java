// Kelas Induk
public class Bentuk {
    private String warna;

    // Constructor Bentuk
    public Bentuk(String warna) {
        this.warna = warna;
    }

    // Getter dan Setter untuk Encapsulation
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void printInfo() {
        System.out.println("Bentuk berwarna " + warna);
    }
}