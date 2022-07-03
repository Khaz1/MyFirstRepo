public class BodyMassIndex {
    public static void main(String[] args) {
        double growth = calcGrowth(1.5, 2.2);
        int weight = calcWeight(45, 150);
        double total = calcTotal(growth, weight);
        System.out.println(total);
    }

    static double calcTotal(double growth, int weight) {
        double result;
        result = (double) weight / (growth * growth); // конечно же можно было использовать метод Math. возводящий в степень
        return result;
    }

    static int calcWeight(int from, int to) {
        int result;
        result = (int) (from + Math.random() * (to - from));
        return result;
    }

    static double calcGrowth(double from, double to) {
        double result;
        result = (from + Math.random() * (to - from));
        return result;
    }
}