package Kendaraan;

import java.util.ArrayList;
import java.util.List;

public class VehicleDemo {
    public static void main(String[] args) {
        // 1. Heterogeneous Collection
        List<Vehicle> kendaraan = new ArrayList<>();
        kendaraan.add(new Car("Toyota", 4, 4));
        kendaraan.add(new Motorcycle("Harley Davidson", 2, true));
        kendaraan.add(new Car("Honda", 4, 2));
        kendaraan.add(new Motorcycle("Yamaha", 2, false));

        // Menampilkan semua detail kendaraan dan perilaku
        for (Vehicle v : kendaraan) {
            v.tampilkanDetail(); // Polymorphic behavior
            v.nyalakan(); // Polymorphic behavior

            // 2. instanceof dan Object Casting
            if (v instanceof Car) {
                Car mobil = (Car) v; // Downcasting untuk metode spesifik
                mobil.bukaBagasi();
            } else if (v instanceof Motorcycle) {
                Motorcycle motor = (Motorcycle) v; // Downcasting untuk metode spesifik
                motor.atraksiWheelie();
            }
            System.out.println();
        }

        // 3. Polymorphic Arguments
        System.out.println("Pengujian Argumen Polimorfik:");
        ujiKendaraan(new Car("Tesla", 4, 4));
        ujiKendaraan(new Motorcycle("Ducati", 2, false));
    }

    // Metode dengan argumen polimorfik
    public static void ujiKendaraan(Vehicle kendaraan) {
        System.out.println("Menguji kendaraan:");
        kendaraan.nyalakan();
        kendaraan.tampilkanDetail();
    }
}
