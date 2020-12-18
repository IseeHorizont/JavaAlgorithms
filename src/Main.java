
public class Main {

    public static void main(String[] args) {
        ChainingHashMap<Integer, String> testMap = new ChainingHashMap<>();
        testMap.put(1, "Alpha");
        testMap.put(2, "Betta");
        testMap.put(3, "Gamma");
        testMap.put(4, "Bravo");
        testMap.put(5, "Echo");
        System.out.println(testMap.toString());
        testMap.delete(1);
        System.out.println(testMap.toString());
    }
}
