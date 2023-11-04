/*================== Can Main Method Overload ==================*/

/*
NOTE :- Yes! But the thing is that execution is always start with
 public static void main(String[] args)
 we can overload main method in one class with different argument and code don't give
 error but it in output window by default public static void main(String[] args)
 will be printed
 */

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello");
    }
    public static void main(Integer[] args)
    {
        System.out.println("world!");
    }
}

//O/P = Hello