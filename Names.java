import java.util.*;

/**
 * Created by Сергей on 18.02.2017.
 */
public class Names {
    private final List<String> names;

    private Names() { names = new ArrayList<>(); }
    public static Names getNames() { return new Names(); }
    public boolean addName(String name) { return names.add(name); }
    public void removeNames() { names.clear(); }
    public String toString() { return names.toString(); }
    public void sort(Comparator<String> cmp) { Collections.sort(names, cmp); }
}