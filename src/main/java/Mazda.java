import java.util.HashSet;
import java.util.Iterator;

public class Mazda extends Cars {
    public Mazda(String model, int yearOfManufacture, String color) {
        super("Mazda", model, yearOfManufacture, color);
    }

    private HashSet<String> engines = new HashSet<>();

    public void addEngines(String engine) {
        engines.add(engine);
    }

    public void deleteEngines(String engine) {
        engines.remove(engine);
    }

    public void findEngines(String engine) {
        if (engines.contains(engine)) {
            System.out.println("Есть");
        } else {
            System.out.println("Нет");
        }
    }

    public void printEngines(String model) {
        Iterator iterator = engines.iterator();
        System.out.println("Список доступных двигателей для Mazda " + model + ":");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
