public class App {
    public static void main(String[] args) throws Exception {
        double harmonicSeries = 0;
        double[] orn = new double[] { 1, 2, 3, 4, 5 };
        for (double i : orn) {
            harmonicSeries += (1 / i);
        }
        double harmonicMean = (orn.length / harmonicSeries);
        System.out.println(harmonicMean);
    }
}
