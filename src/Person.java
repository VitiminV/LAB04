import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Jarred on 2/7/2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double height;

    public Person(String firstName, String lastName, int age, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (Double.compare(person.height, height) != 0) return false;
        if (!firstName.equals(person.firstName)) return false;
        return lastName.equals(person.lastName);
    }

    public Person[] getSiblings(Person [] people){
        if(people == null) return null;
        if(people[0] == null) return  null;
        int index = 0;
        Person[] siblings = new Person[people.length];
        for(int i = 0; i<people.length; i++){
            if(people[i].age < this.age){
                siblings[index] = people[i];
                index++;
            }
        }
        return siblings;
    }

    public Person[] OrderPeopleByHeight(Person [] people){
        if(people == null) return null;
        if(people[0] == null) return  null;
        Arrays.sort(people, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return (int)(o1.height - o2.height);
            }
        });
        return people;
    }

    public Person[] getPeopleWithSameFirstName(Person [] people) {
        if(people == null) return null;
        if(people[0] == null) return  null;
        Person[] NewPeople = new Person[people.length];
        int index = 0;
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length; j++) {
                if (Objects.equals(people[i].firstName, people[j].firstName) && !(Arrays.asList(NewPeople).contains(people[i]))) {
                    NewPeople[index] = people[i];
                    index++;
                }
            }
        }
        return NewPeople;
    }

}
