public class App {
    public static void main(String[] args) throws Exception {
        Boxer boxer1 = new Boxer("Cumhuriyet", 86, 25);
        Boxer boxer2 = new Boxer("Gericiler", 75, 1);

        Ring dovus = new Ring(boxer1, boxer2);

        dovus.fight();
    }
}
