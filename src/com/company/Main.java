public class Person {
    public int age;
    public char gender;
    public void display() {
        System.out.println(age);
        System.out.println(gender);
    }
}
class PersonMain
{
    public static void main(string[] args) {
        Person pranjali= new Person();
        pranjali.age=19;
        pranjali.gender='F';
        pranjali.display();
    }
}