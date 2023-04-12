public class Main {
    public static void main(String[] args) {

        Thread a = new Thread(new ChronometreThreading("first"));
        Thread b = new Thread(new ChronometreThreading("second"));
        Thread c = new Thread(new ChronometreThreading("third"));
        a.start();
        b.start();
        c.start();
    }
}