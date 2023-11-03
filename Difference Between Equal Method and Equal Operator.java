/* ==================Difference Between Equal method and Equal Operator==================

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        if (s1.equals(s2)) //Equals method compair the two sting Data i.e s1 & s2
        {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        if (s1==s2) //Equals operator compair the referances means s1 & s2 address
        {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

String s1 and s3 is not have same referance
because s1 String get store in String Constant Pool and s3 store in Heap memory,because as we create new keyword
s3 String get store in Heap memory

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        if (s1.equals(s3))
        {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

Bellow is the proff that s1 and s2 is have same referance and store in String Constant Pool
But s3 is store in Heap Memory

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        if (s1==s3)
        {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
*/