
public class Main {

    // возведение в степень рекурсией
    public static double myPow(double numb, int degree){
        if(degree == 0){
            return 1;
        }
        if(degree < 0) {
            return myPow(1 / numb, -degree);
        }
        return numb * myPow(numb, degree-1);
    }

    // задача о рюкзаке
    public static boolean fillKnapsack(int[] arr, int total){
        return fillKnapsack(arr, 0, total);
    }

    private static boolean fillKnapsack(int[] arr, int start, int total){
        if(start == arr.length){
            return false;
        }
        int current = arr[start];
        if(current == total){
            System.out.println("Положили в рюкзак " + current);
            return true;
        }else if(current > total || !fillKnapsack(arr, start + 1, total - current)){
            return fillKnapsack(arr, start + 1, total);
        }
        System.out.println("Положили в рюкзак " + current);
        return true;
    }


    public static void main(String[] args) {
        //System.out.println(myPow(2, -4));

        int[] arr = {11, 8, 7, 6, 5};
        System.out.println(fillKnapsack(arr, 20));
    }
}
