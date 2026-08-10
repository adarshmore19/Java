class MarineAnimal {
    void habitat() {
        System.out.println("Marine animals live in oceans and seas.");
    }
}

class Dolphin extends MarineAnimal {
    void swim() {
        System.out.println("Dolphin swims very fast.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        Dolphin d = new Dolphin();

        d.habitat();
        d.swim();
    }
}