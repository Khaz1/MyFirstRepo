package task02;

/**
 * Задача  по составлению таблицы умножения методом двух вложенных циклов
 **/
public class Main {
    public static void main(String[] args) {
        topRowOutput(2, 10);
        bottomRowOutput(6, 10);
    }

    static void topRowOutput(int from, int to) {
        for (int i = from - 1; i <= to; i++) {
            for (int j = from; j < to - 4; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "   \t");
            }
            System.out.println();
        }
    }

    static void bottomRowOutput(int from, int to) {
        for (int i = from - 5; i <= to; i++) {
            for (int j = from; j < to; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "    \t");
            }
            System.out.println();
        }
    }
}

