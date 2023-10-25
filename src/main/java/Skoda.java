import java.util.ArrayDeque;

public class Skoda extends Cars{
    public Skoda(String model, int yearOfManufacture, String color) {
        super("Skoda", model, yearOfManufacture, color);
    }

    private ArrayDeque<String> engines = new ArrayDeque<>();

    public void addEngines(String engine) {
        engines.push(engine);
    }

    public void deleteLastAddedEngine() {
        engines.poll();
    }

    public void findEngines(String engine) {
        if(engines.contains(engine)) {
            System.out.println("Есть");
        } else {
            System.out.println("Нет");
        }
    }

    public void printEngines(String model) {
        System.out.println("Список доступных двигателей для Skoda " + model + ":");
        int size = engines.size();
        for(int i = 0; i < size; i++) {
            System.out.println(engines.pop());
        }

    }
}
