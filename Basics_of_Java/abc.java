/**
 * abc
 */
public class abc {

    static{
        System.out.println("static block");
    }

    static void show()
    {
        System.out.println("This is a static method");
    }

    public static void main(String[] args) {
        System.out.println("Main block");

        show();
    }
}