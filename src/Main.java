import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] bigArray = new int[1000000];

        fillArrayToRandomNumbersTo10(bigArray);

        printArray(bigArray);

        selectionSort(bigArray);
        printArray(bigArray);
        fillArrayToRandomNumbersTo10(bigArray);

        bubbleSort(bigArray);
        printArray(bigArray);
        fillArrayToRandomNumbersTo10(bigArray);

        insertionSort(bigArray);
        printArray(bigArray);
        fillArrayToRandomNumbersTo10(bigArray);


    }

    // метод заполнения массива случайными значениями
    public static void fillArrayToRandomNumbersTo10(int[] arr){
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(10);
        }
    }

    // метод вывода массива
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // метод обмена элементов местами
    public static void toSwap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }

    // сортировка выбором, сложность алгоритма в худшем случае O(n^2)
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                toSwap(arr[i], arr[min]);
            }
        }
    }

    // пузырьковая сортировка, сложность алгоритма O(n^2)
    public static void bubbleSort(int[] arr){
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]){
                    toSwap(arr[j], arr[j + 1]);
                }
            }
        }
    }

    // сортировка, сложность алгоритма O(n^2)
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
