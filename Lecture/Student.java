public class Student{
    String name = "Amar";
    int age = 30;
    String tech = "Google";


    public Student()
    {
        System.out.println("IN A CONSTRUCTOR");
    }

    public void tellmeaboutyourself()
    {
        System.out.println(name + " : " + age + " : " + tech);

    }
}
