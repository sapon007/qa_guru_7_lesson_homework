public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi("A3", 2015, "белый", 2000000);
        Volkswagen volkswagen = new Volkswagen("Passat B8", 2016, "черный", 2100000);
        Mazda mazda = new Mazda("6", 2017, "красный", 2800000);

        audi.addOption("Камера заднего вида");
        audi.addOption("Бесключевой доступ");
        audi.buyCar("Audi");
        audi.printOptions();
    }
}
