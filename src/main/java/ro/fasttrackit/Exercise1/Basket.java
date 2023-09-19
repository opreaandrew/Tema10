package ro.fasttrackit.Exercise1;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private final List<String> fruit;

    public Basket(List<String> fruit) {
        this.fruit = fruit;
    }

    public boolean find(String x) {
        return this.fruit.contains(x);
    }

    public boolean remove(String x) {
        if (find(x)) {
            this.fruit.remove(x);
            return true;
        }
        return false;
    }

    public int position(String x) {
        return this.fruit.indexOf(x);
    }

    public Collection<String> distinct() {
        return new HashSet<String>(this.fruit);
    }

    public void add(String x) {
        this.fruit.add(x);
    }

    public int count() {
        return this.fruit.size();
    }

    public int customCount() {
        int counter = 0;

        for (String s : this.fruit) {
            counter++;
        }

        return counter;
    }
    public String toString() {
        return fruit.toString();
    }
}
