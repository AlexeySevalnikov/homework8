public class BoxUtil {


    public static <T> void copyFromBoxToBox(final Box<? extends T> src, final Box<? super T> dest) {
        dest.put(src.get());
    }

    public static void copyFreshFruitFromBoxToBox(final Box<? extends Fruit> src, final Box<? super Fruit> dest) {
        if (src.get().isFresh() && src.get() != null) {
            dest.put(src.get());
        } else {
            System.out.println("В эту коробку можно положить только свежие фрукты");
            dest.put(null);
        }
    }

    public static <T> void printElementFromTwoBoxes(final Box<T> box) {
        System.out.println(box.get().getClass().getName() + " " + box.get().toString());
    }

    public static <T> void printElementFromBoxes(final Box<? extends T> box) {
        System.out.println(box.get().getClass().getName() + " " + box.get().toString());
    }
}
