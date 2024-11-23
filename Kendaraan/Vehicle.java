package Kendaraan;

public abstract class Vehicle {
    String merek;
    int jumlahRoda;

    public Vehicle(String merek, int jumlahRoda) {
        this.merek = merek;
        this.jumlahRoda = jumlahRoda;
    }

    public abstract void nyalakan(); // Metode abstrak

    public void tampilkanDetail() {
        System.out.println("Merek: " + merek + ", Jumlah Roda: " + jumlahRoda);
    }
}
