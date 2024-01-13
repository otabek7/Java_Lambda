public class SortGreen implements SortApples{

    @Override
    public boolean sort(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
