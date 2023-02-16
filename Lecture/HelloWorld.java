class HelloWorld {
    public static void main(String[] args) {


        Student obj = new Student();
        Student obj1 = new Student();
        Student obj2 = new Student();

        

        // System.out.println(obj.name);

        obj1.name = "Harsh";
        // System.out.println(obj1.name);

        obj2.age = 45;

        obj.tellmeaboutyourself();
        obj1.tellmeaboutyourself();
        obj2.tellmeaboutyourself();
        
    }
}
