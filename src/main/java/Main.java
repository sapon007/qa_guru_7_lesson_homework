public class Main {
    public static void main(String[] args) {
        Audi audiA3 = new Audi( "A3", 2016, "белый");
        Audi audiA6 = new Audi( "A6", 2017, "черный");
        Volkswagen volkswagenPassat = new Volkswagen("Passat", 2016, "коричневый");
        Volkswagen volkswagenTiguan = new Volkswagen("Tiguan", 2017, "синий");
        Mazda mazda6 = new Mazda("6", 2017, "красный");

        audiA3.addEngines("1.4 150 л.с");
        audiA3.addEngines("2.0 190 л.с");
        audiA3.printEngines("A3");

        audiA6.addEngines("1.8 190 л.с");
        audiA6.addEngines("2.0 190 л.с.");
        audiA6.addEngines("2.0 249 л.с");
        audiA6.addEngines("3.0 333 л.с");
        audiA6.deleteEngines(0);
        audiA6.printEngines("A6");


    }
}
