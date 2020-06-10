class Parent{
    void show()
    {
        System.out.println("Parent class");
    }
}
class Child extends  Parent{
    void show()
    {
        System.out.println("Child class");
    }
}
class polymorphism{
    public static void main(String[] args)
    {
        Parent m = new Parent();
        // m.show();

        //

        Parent n = new Child();
        n.show();
    }
}