/*==================String Methods ==================*/

public class Main {
    public static void main(String[] args) {
        String A = "Rushabh";
        String B = "Dhole";
        String C = A + B;        //We can add two string also

        System.out.println(C); //Printing String
        System.out.println(A.concat(B)); //Join the two strings
        System.out.println(A.charAt(5)); //Find the charecter at which index
        System.out.println(A.toUpperCase()); //For UpperCase string
        System.out.println(A.toLowerCase()); //For LowerCase string
        System.out.println(A.indexOf("s"));  //To find out occurance of specified charecter in the string
        System.out.println(A.indexOf("z"));  //If charecter is not in string it will return -1
        System.out.println(A.length());      //To find the length of string
        System.out.println(A.substring(2)); //To retrive the part of string
        System.out.println(A.substring(2, 6)); //To retrive the part of string from index 2 to 6
        System.out.println(A.equals(B)); //String A and String B Data is equals then it will print true otherwise false
        System.out.println(A.equalsIgnoreCase(B)); //String A and String B Data is different then it will print true otherwise false
        System.out.println(A.endsWith("bh")); //To determine whether string ends with specific set of charecter , it print true otherwise false
        System.out.println(A.startsWith("Ru")); //To determine whether string start with specific set of charecter , it print true otherwise false
        System.out.println(A.compareTo(B));
        System.out.println(A.compareToIgnoreCase(B));
    }
}
