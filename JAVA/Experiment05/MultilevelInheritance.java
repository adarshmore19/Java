class MarineAnimal {
    void habitat() {
        System.out.println("Marine animals live in oceans.");
    }
}

class Fish extends MarineAnimal {
    void breathe() {
        System.out.println("Fish breathe through gills.");
    }
}

class Shark extends Fish {
    void hunt() {
        System.out.println("Shark hunts smaller fish.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Shark s = new Shark();

        s.habitat();
        s.breathe();
        s.hunt();
    }
}