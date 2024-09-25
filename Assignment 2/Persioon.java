class Person
{

    private String name;

    public String gender;
    public int age;

    public Person(String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void displayPersonDetails()
    {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args)
    {
        Person person = new Person("Abraham Lincoln", "Male", 62);


        System.out.println("Initial Person Details:");
        person.displayPersonDetails();

        person.setName("Abraham lincoln");


        System.out.println("\nUpdated Person Details:");
        person.displayPersonDetails();
    }
}
