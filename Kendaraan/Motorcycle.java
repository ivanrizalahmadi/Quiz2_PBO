package Kendaraan;

public class Motorcycle extends Vehicle {
    boolean adaSampingan;

    public Motorcycle(String merek, int jumlahRoda, boolean adaSampingan) {
        super(merek, jumlahRoda);
        this.adaSampingan = adaSampingan;
    }

    @Override
    public void nyalakan() {
        System.out.println("Motor " + merek + " dinyalakan dengan kick starter atau tombol.");
    }

    public void atraksiWheelie() {
        System.out.println(merek + " melakukan atraksi wheelie!");
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Ada Sampingan: " + (adaSampingan ? "Ya" : "Tidak"));
    }
}
