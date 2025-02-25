public class SequentialSearcher {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 4 };
        System.out.println("4 Index: " + find(array, 4));
        System.out.println("4 Count: " + count(array, 4));
        System.out.println("Max: " + max(array));
        System.out.println("Sum: " + sum(array));
        System.out.println("Min Odd: " + minOdd(array));
    }

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
            if (num == value) {
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