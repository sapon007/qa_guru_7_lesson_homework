import java.util.ArrayList;

public class Audi extends Cars {

    public Audi(String model, int yearOfManufacture, String color, int price) {
        super(model, yearOfManufacture, color, price);
    }

    private ArrayList<String> options = new ArrayList<String>();

    public void addOption(String option) {
        options.add(option);
    }

    public void deleteOption(String option) {
        options.remove(option);
    }

    public void findOption(String option) {

    }

    public void printOptions() {
        System.out.println("Список доступных вам опций:");
    }
}
