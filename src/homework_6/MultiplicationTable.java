package homework_6;

public class MultiplicationTable {
    void calculate(int x, int y) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
    void printHeaders(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
    }
    void printDetails(int size){
        for (int i = 1; i <= size; i++) {
            System.out.printf("-", i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        table.printHeaders(3);
        table.printDetails(15);
        table.calculate(3, 3);
    }
}
