import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<MyTreeMap> treeList = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            MyTreeMap tree = new MyTreeMap();
            for (int j = 0; j < 64 - random.nextInt(32); j++) {
                tree.put(random.nextInt(100), 100 - random.nextInt(201));
            }
            treeList.add(tree);
        }

        int count = 0;
        for (int i = 0; i < treeList.size(); i++) {
            count += treeList.get(i).isBalanced() ? 1 : 0;
        }

        /**
         * Процент сбалансированности созданных деревьев за 15-20 запусков программы варьируется от 45 до 100
         */
        System.out.println(String.format("%s %d", "Сделано деревьев:", treeList.size()));
        System.out.println(String.format("%s %d%s", "Из них сбалансированные деревья:",
                                                        count * 100 / treeList.size(), "%"));
    }
}
