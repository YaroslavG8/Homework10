import com.sun.org.apache.xpath.internal.operations.Bool;

public class Person {
    String name;
    int age;
    boolean married;

        public int holiday() {
            int count = age / 10;
            return count;
        }
        public char starting() {
            char a = name.charAt(0);
            return a;
        }
        public Person () {
            name = "Ivan";
            age = 28;
            married = false;
        }
        public Person(String name) {this.name = name;}

    public Person(String name, int age) {
            this.name = name;
            this.age = age;
    }
    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }
        public String toString() {
        return String.format("My name is %s. I'm %d years old. Am I married? %b", name, age, married);
        }
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person that = (Person) o;
            return name.equals(that.name) && age == that.age && married == that.married;
        }

        public int hashCode() {
            int x;
            if (married) {
                x = 5;
            } else {
                x = 0;
            }
            return name.hashCode() + age;
        }
        public void setName(String newName) {name = newName;}
        public void setAge(int newAge) {age = newAge;}
        public void setMarried(Boolean newMarried) {married = newMarried;}

        public String getName() {return name;}
    public int getAge() {return age;}
    public boolean getMarried() {return married;}

    public void printAge() {System.out.println(age);}
    public void printName() {System.out.println(name);}
    public void printMarried() {System.out.println(married);}

    public static void main (String[] args) {
            Person person = new Person();
        Person person1 = new Person("Genri");
        Person person2 = new Person("Igor", 88);
        Person person3 = new Person("Mod", 55, false);

        person.printName();
        person.printAge();
        person.printMarried();

        person.printAge();
        System.out.println("Age before update:" + person3.age);
        person.printName();
        System.out.println("Age before update:" + person3.age);

        Person[] array = new Person[4];
        array[0] = person;
        array[1] = person1;
        array[2] = person2;
        array[3] = person3;

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("How much holidays did I have" + person.holiday());
        System.out.println("How much holidays did I have" + person1.holiday());

        System.out.println("book of the name is:" + person.starting());
        System.out.println("book of the name is:" + person1.starting());


        }
}

