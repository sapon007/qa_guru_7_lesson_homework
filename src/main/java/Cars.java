public class Cars {
    private String model;
    private int yearOfManufacture;
    private String color;
    private int price;

    public Cars(String model, int yearOfManufacture, String color, int price) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
    }

    public void buyCar(String brand) {
        System.out.println("Поздравляем! Вы купили " + brand + " " + model + " за " + price);
    }
}
