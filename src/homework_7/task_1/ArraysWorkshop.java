package homework_7.task_1;

public class ArraysWorkshop {
    int min(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    int find(int[] array, int value) {
        int valueIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                valueIndex = i;
            }
        }
        return valueIndex;
    }

    int sumArray(int[] array) {
        int sumArray = 0;
        for (int value : array) {
            sumArray += value;
        }
        return sumArray;
    }

    void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " = " + array[i]);
        }
    }

    int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        int arrayLength = array.length;
        for (int i = 0; i < array.length; i++) {
            reverseArray[arrayLength - 1] = array[i];
            arrayLength--;
        }
        return reverseArray;
    }
}
