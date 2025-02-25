import java.util.ArrayList;

public class SequentialSearcher {

    public int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int count(int[] array, int value) {
        int count = 0;
        for (int num : array) {
            if (array[num] == value) {
                count++;
            }
        }
        return count;
    }

    public int max(int[] array){
        
        for (int num : array){
            if ()
        }
    }
}