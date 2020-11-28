import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        stringReverse("A BCD EFG HI JKL M NPQRST VWXYZ");

    }

    public static void stringReverse(String str){
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            deque.addFirst(str.charAt(i));
        }
        for (Character item: deque) {
            System.out.print(item);
        }
    }
}
