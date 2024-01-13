import java.util.ArrayList;
import java.util.List;

public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
        //as.sort();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        //as.sort(qs);
        //as.sort(bs);

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(180, Color.GREEN));
        inventory.add(new Apple(180, Color.RED));

        List<Apple> heavyApple = filterApple(inventory, new SortHeavy());
        System.out.println(heavyApple);

        System.out.println("Printing green apples");
        List<Apple> greenApple = filterApple(inventory, new SortGreen());
        System.out.println(greenApple);

    }

    private static List<Apple> filterApple(List<Apple> inventory, SortApples sortApples) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple: inventory){
            if(sortApples.sort(apple)){
                result.add(apple);
            }
        }

        return result;
    }

//    private void sort(Sorting sorting){
//        //System.out.println("Sorting Array");
//        sorting.sort();
//
//    }
}
