/* ==================Difference Between Equal method and Equal Operator==================
note :- just remove the comments and copy the one class at a time i used to write all Main class in one
just because for understanding the concept.


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

O/P = Equal

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        if (s1==s2) //Equals operator compair the referances means s1 & s2 (address) in java we don't use adderese we use referance 
                    //For understanding purpose i use address
        {           
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

O/P = Equal

String s1 and s3 is not have same referance
because s1 String get store in String Constant Pool and s3 store in Heap memory,because as we create new keyword
s3 String get store in Heap memory

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");   //s3 store in Heap and s1 store in String Constant Pool But Still output is Equal
        if (s1.equals(s3))                 //just because equal method only compair data
        {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

O/P = Equal

Bellow is the proff that s1 and s2 is have same referance (address) and store in "String Constant Pool"
But s3 is store in "Heap Memory" so s3 referance is different from s1 & s2

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

O/P = Not Equal
*/
