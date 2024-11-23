package Kendaraan;

public class Car extends Vehicle {
    int jumlahPintu;

    public Car(String merek, int jumlahRoda, int jumlahPintu) {
        super(merek, jumlahRoda);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void nyalakan() {
        System.out.println("Mobil " + merek + " dinyalakan dengan kunci.");
    }

    public void bukaBagasi() {
        System.out.println("Bagasi mobil " + merek + " dibuka.");
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
