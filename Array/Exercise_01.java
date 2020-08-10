package Array;

public class Exercise_01 {

    public static void main(String[] args) {
        int[] array = {5, 2};

        System.out.println(arithmeticAverage(array));
    }

    public static float arithmeticAverage(int[] array) {
        if (array.length > 0) {
            float sum = 0;

            for (int value : array) {
                sum += value;
            }

            return sum / array.length;
        }

        return 0;
    }
}