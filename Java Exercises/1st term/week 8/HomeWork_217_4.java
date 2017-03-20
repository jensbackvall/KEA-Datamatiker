public class HomeWork_217_4 {

    public static void main(String[] args) {

        printDecrSquare(4, 8);

    }

    public static void printDecrSquare(int min, int max) {
        int range = max - min + 1;
        int tempMax = max;
        for (int i = range; i > 0; i--) {
            for (int j = tempMax; j >= min; j--) {
                System.out.print(j);
            }
        tempMax = tempMax - 1;
        System.out.println();
        }
    }

}