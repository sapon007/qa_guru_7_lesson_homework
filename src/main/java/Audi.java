import java.util.ArrayList;

public class Audi extends Cars {

    public Audi(String model, int yearOfManufacture, String color) {
        super("Audi", model, yearOfManufacture, color);
    }

    private ArrayList<String> engines = new ArrayList<>();

    public void addEngines(String engine) {
        engines.add(engine);
    }

    public void deleteEngines(int index) {
        engines.remove(index);
    }

    public void findEngines(String engine) {
        if(engines.contains(engine)) {
            System.out.println("Есть");
        } else {
            System.out.println("Нет");
        }
    }

    public void printEngines(String model) {
        System.out.println("Список доступных двигателей для Audi " + model + ":");
        for(String engine: engines) {
            System.out.println(engine);
        }
    }
}
