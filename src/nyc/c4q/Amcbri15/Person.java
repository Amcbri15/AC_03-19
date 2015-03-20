package nyc.c4q.Amcbri15;

/**
 * Created by c4q-anthony-mcbride on 3/19/15.
 */
public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }
    // static means that this applies to the entire class rather than the specific method
    public static void greet() {
        System.out.println("I am speaking for all Persons.");
    }

    public static void main(String[] args) {
        int n = 0; /* is similar to */ Person fred = new Person("Fred");

        Person bob = new Person("Bob", 28);
        System.out.println(bob.getName() + " " + bob.getAge() + " ");
        bob.greet();

        fred.setName("Fredrick");
        fred.setAge(30);
       System.out.println(fred.getAge() + " " + fred.getName());
        fred.greet();

        Person tom = fred;
        tom.setName("Thomas");
        System.out.println(fred.getName());

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        // compairs references
        System.out.println(s1 == s2);

        // compairs the value of each instance
        System.out.println(s1.equals(s2));

        String s3 = s2;
        System.out.println(s3 == s2);
    }

}
