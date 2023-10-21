public abstract class Cars {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private String color;

    public Cars(String brand, String model, int yearOfManufacture, String color) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
    }

    public abstract void addEngines(String engine);

    public abstract void deleteEngines(int index);

    public abstract void findEngines(String engine);

    public abstract void printEngines(String model);
}
