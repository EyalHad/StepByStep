package Interfaces.Comparable;

public class Truck implements Comparable<Truck>{

    private int licencePlate;
    private final String model;
    private final int yearModel;
    private double currentWeight;

    public Truck(int licencePlate, String model, int yearModel, double currentWeight) {
        this.licencePlate = licencePlate;
        this.model = model;
        this.yearModel = yearModel;
        this.currentWeight = currentWeight;
    }

    public Truck(int licencePlate, String model, int yearModel) {
        this.licencePlate = licencePlate;
        this.model = model;
        this.yearModel = yearModel;
        this.currentWeight = 0;
    }

    public int getLicencePlate() { return licencePlate; }
    public void setLicencePlate(int licencePlate) { this.licencePlate = licencePlate; }
    public String getModel() { return model; }
    public int getYearModel() { return yearModel; }
    public double getCurrentWeight() { return currentWeight; }
    public void setCurrentWeight(double currentWeight) { this.currentWeight = currentWeight; }

//    @Override
//    public int compareTo(Truck other) {
//        // when using Collection.sort(List<Truck> list)
//        // this method will produce an ascending order
//        return (int)(this.currentWeight - other.currentWeight);
//    }

    @Override
    public int compareTo(Truck other) {
        // when using Collection.sort(List<Truck> list)
        // this method will produce an descending  order
        return (int)(other.currentWeight - this.currentWeight);
    }

//    @Override
//    public int compareTo(Truck other) {
//        // use build method in java
//        return Double.compare(this.currentWeight, other.currentWeight);
//    }

//    @Override
//    public int compareTo(Truck other) {
//        if (this.currentWeight > other.currentWeight) return 1;
//        if (this.currentWeight < other.currentWeight) return -1;
//        return 0;
//    }


    @Override
    public String toString() {
        return "Truck[" +
                " Plate number = " + licencePlate +
                "| model = '" + model + '\'' +
                "| year = " + yearModel +
                "| currentWeight = " + currentWeight +
                " ]";
    }
}
