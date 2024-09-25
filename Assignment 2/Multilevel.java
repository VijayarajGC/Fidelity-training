
class Animal
{
    void eat()
    {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("The dog barks.");
    }
}


class Puppy extends Dog
{
    void weep()
    {
        System.out.println("The puppy weeps.");
    }
}

public class Multilevel
{
    public static void main(String[] args)
    {
        Puppy puppy = new Puppy();
        puppy.eat();  // Inherited from Animal class
        puppy.bark(); // Inherited from Dog class
        puppy.weep(); // Defined in Puppy class
    }
}
