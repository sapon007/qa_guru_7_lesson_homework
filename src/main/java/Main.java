public class Main {
    public static void main(String[] args) {
        Audi audiA3 = new Audi( "A3", 2016, "белый");
        Audi audiA6 = new Audi( "A6", 2017, "черный");
        Volkswagen volkswagenPassat = new Volkswagen("Passat B8", 2016, "коричневый");
        Volkswagen volkswagenTiguan = new Volkswagen("Tiguan 2", 2017, "синий");
        Mazda mazda6 = new Mazda("6", 2018, "красный");
        Skoda skodaSuperb = new Skoda("Superb", 2019, "зеленый");

        audiA3.addEngines("1.4 125 л.с");
        audiA3.addEngines("1.4 125 л.с"); // можно дубли хранить
        audiA3.addEngines("1.4 150 л.с");
        audiA3.addEngines("2.0 190 л.с");
        audiA3.printEngines("A3");
        System.out.println("Есть ли двигатель 1.4 150 л.с?");
        audiA3.findEngines("1.4 150 л.с");
        System.out.println("Есть ли двигатель 1.5 150 л.с?");
        audiA3.findEngines("1.5 150 л.с");

        audiA6.addEngines("1.8 190 л.с");
        audiA6.addEngines("2.0 190 л.с");
        audiA6.addEngines("2.0 249 л.с");
        audiA6.addEngines("3.0 333 л.с");
        audiA6.deleteEngines(0);
        audiA6.printEngines("A6");

        volkswagenPassat.addEngines("1.4", "125 л.с");
        volkswagenPassat.addEngines("1.4", "150 л.с"); // перезапишет предыдущую запись
        volkswagenPassat.addEngines("1.8", "180 л.с");
        volkswagenPassat.printEngines("Passat B8");
        System.out.println("Есть ли двигатель 1.8?");
        volkswagenPassat.findEngines("1.8");
        System.out.println("Есть ли двигатель 2.0?");
        volkswagenPassat.findEngines("2.0");

        volkswagenTiguan.addEngines("1.4", "125 л.с");
        volkswagenTiguan.addEngines("1.4", "150 л.с");
        volkswagenTiguan.addEngines("1.8", "180 л.с");
        volkswagenTiguan.addEngines("2.0", "180 л.с");
        volkswagenTiguan.addEngines("2.0", "220 л.с"); // перезапишет предыдущую запись
        volkswagenTiguan.deleteEngines("1.8");
        volkswagenTiguan.printEngines("Tiguan 2");

        mazda6.addEngines("2.0 150 л.с");
        mazda6.addEngines("2.0 150 л.с"); // дубликат не добавится
        mazda6.addEngines("2.5 192 л.с");
        mazda6.addEngines("2.5 194 л.с");
        mazda6.deleteEngines("2.5 194 л.с");
        mazda6.printEngines("6");
        System.out.println("Есть ли двигатель 2.0 150 л.с?");
        mazda6.findEngines("2.0 150 л.с");
        System.out.println("Есть ли двигатель 1.5 150 л.с?");
        mazda6.findEngines("1.5 150 л.с");

        skodaSuperb.addEngines("1.4 150 л.с");
        skodaSuperb.addEngines("2.0 190 л.с");
        skodaSuperb.addEngines("2.0 220 л.с");
        skodaSuperb.addEngines("2.0 280 л.с");
        skodaSuperb.deleteLastAddedEngine();
        skodaSuperb.printEngines("Superb");
        System.out.println("Есть ли двигатель 2.0 190 л.с?");
        skodaSuperb.findEngines("2.0 190 л.с");
        System.out.println("Есть ли двигатель 1.5 150 л.с?");
        skodaSuperb.findEngines("1.5 150 л.с");

    }
}
