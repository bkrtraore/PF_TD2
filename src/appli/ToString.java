package appli;

@FunctionalInterface
public interface ToString<T> {
    String string(T t);
}
