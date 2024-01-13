public class SortHeavy implements SortApples{
    @Override
    public boolean sort(Apple apple) {
        return apple.getWeight()>150;
    }
}
