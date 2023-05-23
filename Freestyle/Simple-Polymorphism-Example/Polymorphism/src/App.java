class Animal {
    public void sesCikar() {
        System.out.println("Hayvanlar türlerine göre farklı bir ses çıkarır.");
    }
}

class Bird extends Animal {
    public void sesCikar() {
        System.out.println("Karga sesleri...");
    }
}

class Cat extends Animal {
    public void sesCikar() {
        System.out.println("Kedi miyavlıyor...");
    }
}

public class App {

    public static void sesCikar(Animal animal) {
        animal.sesCikar();
    }

    public static void main(String[] args) throws Exception {
        sesCikar(new Cat());
    }
}