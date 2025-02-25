public class SequentialSearcher {

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int count(int[] array, int value) {
        int count = 0;
        for (int num : array) {
            if (array[num] == value) {
                count++;
            }
        }
        return count;
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int minOdd(int[] array) {
        int minOdd = Integer.MAX_VALUE;
        boolean isOdd = false;
        for (int num : array) {
            if (num % 2 == 1 && num < minOdd) {
                minOdd = num;
                isOdd = true;
            }
        }
        if (isOdd) {
            return minOdd;
        } else {
            return 0;
        }
    }

}