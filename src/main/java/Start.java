public class Start {
    public static void main(final String[] args) {
        Box<Fruit> box = new Box<>();
        box.put(new Apple(false));
        Box<Fruit> box1 = new Box<>();
        Box<Fruit> box2 = new Box<>();
        BoxUtil.copyFromBoxToBox(box, box1);
        BoxUtil.copyFreshFruitFromBoxToBox(box1, box2);
        BoxUtil.printElementFromTwoBoxes(box1);
        BoxUtil.printElementFromBoxes(box1);
    }
}
