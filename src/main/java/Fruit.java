public class Fruit {
    private boolean fresh;

    public final boolean isFresh() {
        return fresh;
    }

    public final void setFresh(final boolean fresh) {
        this.fresh = fresh;
    }

    @Override
    public final String toString() {
        return "Свежий: " + fresh;
    }
}
