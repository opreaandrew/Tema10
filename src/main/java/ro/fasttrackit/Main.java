package ro.fasttrackit;

import ro.fasttrackit.Exercise1.Basket;
import ro.fasttrackit.Exercise2.Bouquet;
import ro.fasttrackit.Exercise3.Company;
import ro.fasttrackit.Exercise3.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println("\nExercise 1:");
//
//        List<String> fruit = new ArrayList<>();
//        fruit.add("apple");
//        fruit.add("pear");
//        fruit.add("apple");
//        fruit.add("belly button");
//        fruit.add("belly button");
//        fruit.add("smelly button");
//
//        Basket fruitBasket = new Basket(fruit);
//        System.out.println("Basket: " + fruitBasket.toString());
//        System.out.println("Find apple: " + fruitBasket.find("apple"));
//        System.out.println("Remove apple: " + fruitBasket.remove("apple"));
//        System.out.println("Basket: " + fruitBasket.toString());
//        System.out.println("Position of pear: " + fruitBasket.position("pear"));
//        System.out.println("Distinct: " + fruitBasket.distinct().toString());
//        System.out.println("Add: melon");
//        fruitBasket.add("melon");
//        System.out.println("Basket: " + fruitBasket.toString());
//        System.out.println("Count: " + fruitBasket.count());
//        System.out.println("Custom count: " + fruitBasket.customCount());
//
//        System.out.println("\n==================");
//        System.out.println("\nExercise 2:");
//
//        HashSet<String> flowers = new HashSet<>();
//        flowers.add("rose");
//        flowers.add("tulip");
//        flowers.add("parsley");
//        flowers.add("orchid");
//
//        Bouquet bouquet = new Bouquet(flowers);
//        System.out.println("All flowers: " + bouquet.getAll());
//        System.out.println("Adding rose");
//        bouquet.add("rose");
//        System.out.println("Adding daffodil");
//        bouquet.add("daffodil");
//        System.out.println("All flowers: " + bouquet.getAll());
//        System.out.println("Removing rose");
//        bouquet.remove("rose");
//        System.out.println("All flowers: " + bouquet.getAll());
//
//        System.out.println("\n==================");
        System.out.println("\nExercise 3:");

        HashMap<Integer, Person> people = new HashMap<>();
        people.put(1, new Person("Jim", 25, "electrician"));
        people.put(2, new Person("John", 23, "mechanic"));
        people.put(3, new Person("Jimbo", 27, "welder"));
        people.put(4, new Person("Jimmy", 87, "plumber"));
        people.put(5, new Person("Jimjim", 56, "mascot"));


        Company MarkTheButcherINC = new Company(people);
        MarkTheButcherINC.print();
        MarkTheButcherINC.employ(new Person("Andrei", 33, "enjinir"));
        MarkTheButcherINC.employ(new Person("Viorel", 34, "enjinir"));
        MarkTheButcherINC.employ(new Person("Mark", 34, "manager"));
        MarkTheButcherINC.employ(new Person("Levi", 29, "manager"));
        System.out.println(MarkTheButcherINC.getPersonsName("Andrei"));
        System.out.println(MarkTheButcherINC.getPersons("electrician"));
        System.out.println(MarkTheButcherINC.getManager());
        System.out.println(MarkTheButcherINC.getPersonsOlder(26));


    }
}