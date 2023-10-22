import java.util.HashMap;
import java.util.Map;

public class Volkswagen extends Cars {

    public Volkswagen(String model, int yearOfManufacture, String color) {
        super("Volkswagen", model, yearOfManufacture, color);
    }

    private HashMap<String, String> engines = new HashMap<String, String>();

    public void addEngines(String engineCapacity, String enginePower) {
        engines.put(engineCapacity, enginePower);
    }

    public void deleteEngines(String engineCapacity) {
        engines.remove(engineCapacity);
    }

    public void findEngines(String engineCapacity) {
        if (engines.get(engineCapacity) != null) {
            System.out.println("Есть");
        } else {
            System.out.println("Нет");
        }
    }

    public void printEngines(String model) {
        System.out.println("Список доступных двигателей для Volkswagen " + model + ":");
        for (Map.Entry entry: engines.entrySet()) {
            System.out.println(entry);
        }
    }
}
