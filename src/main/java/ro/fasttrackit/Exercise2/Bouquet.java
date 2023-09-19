package ro.fasttrackit.Exercise2;

import java.util.Collection;
import java.util.HashSet;

public class Bouquet {
    private final HashSet<String> flowers;

    public Bouquet(HashSet<String> flowers) {
        this.flowers = flowers;
    }

    public Collection<String> getAll(){
        return this.flowers.stream().toList();
    }

    public void add(String flower){
        this.flowers.add(flower);
    }

    public void remove(String flower){
        this.flowers.remove(flower);
    }
}
