package task01;

public class Main {
    /**
     * Задача по расчету индекса массы тела
     **/
    public static void main(String[] args) {
        double growth = calcGrowth(1.5, 2.2);
        double weight = calcWeight(45, 150);
        double total = calcBodyIndex(growth, weight);
        System.out.println(total);
    }
    static double calcGrowth(double from, double to) {
        return (from + Math.random() * (to - from));
    }
    static double calcWeight(int from, int to) {
        return (from + Math.random() * (to - from));
    }
    static double calcBodyIndex(double growth, double weight) {
        return weight / (growth * growth);
    }
}