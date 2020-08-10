package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] data = {10, 12, 14, 15, 22, 37};

        System.out.println(find(data, 22, 0, 5));
    }

    public static int find(int[] data, int element, int start, int end) {
        if (data.length > 0 || !isOrdered(data)) {

            if (data[start] > element || data[end] < element) {
                return -1;
            }

            if (start == end && data[start] == element) {
                return data[start];
            }

            int middle = (end + start) / 2;

            if (data[middle] == element) {
                return data[middle];
            }
            else if (data[middle] < element) {
                return find(data, element, middle + 1, end);
            }

            return find(data, element, start, middle - 1);
        }

        return -1;
    }

    public static boolean isOrdered(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                return false;
            }
        }

        return true;
    }
}