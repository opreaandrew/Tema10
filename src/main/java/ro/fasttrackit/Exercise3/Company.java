package ro.fasttrackit.Exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Company {
    HashMap<Integer, Person> company;

    public Company(HashMap<Integer, Person> company) {
        this.company = company;
    }

    public Person getManager() {
        for (Integer i : company.keySet()) {
            if (company.get(i).position().equals("manager")) {
                return company.get(i);
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        ArrayList<Person> people = new ArrayList<>();
        for (Integer i : company.keySet()) {
            if (company.get(i).position().equals(profession)) {
                people.add(company.get(i));
            }
        }
        return people;
    }

    public List<Person> getPersonsOlder(int age) {
        ArrayList<Person> people = new ArrayList<>();
        for (Integer i : company.keySet()) {
            if (company.get(i).age() > age) {
                people.add(company.get(i));
            }
        }
        return people;
    }

    public List<Person> getPersonsName(String name) {
        ArrayList<Person> people = new ArrayList<>();
        for (Integer i : company.keySet()) {
            if (company.get(i).name().equals(name)) {
                people.add(company.get(i));
            }
        }
        return people;
    }

    public void employ(Person newHire) {
        if (newHire.position().equals("manager") && getManager() != null) {
            System.out.println("\nSorry, we have enough managers!");
        } else {
            int employeeID = company.size() + 1;
            company.put(employeeID, newHire);
            System.out.printf("\nWe just hired %s, and he's employee number: %s", newHire, employeeID);
        }
    }

    public void print() {
        for (Integer i : company.keySet()) {
            System.out.println("Employee number: %s is %s".formatted(i, company.get(i)));
        }
    }

}
