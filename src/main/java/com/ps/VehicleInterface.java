package com.ps;



import java.util.List;

public interface VehicleInterface {
    List<Vehicle> getAllVehicles();
    List<Vehicle> getVehiclesByPrice(double min, double max);
    List<Vehicle> getVehiclesByMakeModel(String make, String model);
    List<Vehicle> getVehiclesByYear(int min, int max);
    List<Vehicle> getVehiclesByColor(String color);
    List<Vehicle> getVehiclesByMileage(int min, int max);
    List<Vehicle> getVehiclesByType(String type);
}
