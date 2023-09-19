package ro.fasttrackit.Exercise3;

public record Person(
        String name,
        int age,
        String position
) {

    @Override
    public String toString() {
        return name +
                ", age = " + age +
                ", position = " + position
                ;
    }
}
