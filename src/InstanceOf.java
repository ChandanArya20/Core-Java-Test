import javax.xml.namespace.QName;

public class InstanceOf {

    public static void main(String... args){

        Object s = new Student("Chandan", 21, 90);
        Person p = new Person("Arya", 34);

        Object o=new Object();


        if( s instanceof Person ){
            System.out.println("Student is compatible with Person");
            System.out.println(s);
        }
        if( o instanceof Person ){
            System.out.println("Object is compatible with Person");
            System.out.println(0);
        }

        String str= """
                Jai Shree Ram
                Jai Shree Krishna
                """;

        System.out.println(str);

    }

}

class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class Student extends Person{
    float marks;

    public Student(String name, int age, float marks) {
        super(name, age);
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                " marks=" + marks +
                '}';
    }
}

