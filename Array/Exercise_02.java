package Array;

public class Exercise_02 {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 2};

        mode(array);
    }

    public static void mode(int[] array) {
        int count, mode, comparator = 0, quantity = 0;

        int[] modeCollection = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            count = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    ++count;
                }
            }

            if (count > comparator) {
                mode = array[i];
                modeCollection[quantity] = mode;
                comparator = count;
            }
            else if (count == comparator) {
                quantity++;
                modeCollection[quantity] = array[i];
            }
        }

        if (quantity > 0) {
            System.out.print("As modas são");

            for (int j = 0; j <= quantity; j++) {
                if (j == quantity) {
                    System.out.println(" e " + modeCollection[j] + ".");
                }
                else {
                    System.out.print(" " + modeCollection[j]);
                }
            }
        }
        else {
            System.out.println("Não há moda");
        }
    }
}