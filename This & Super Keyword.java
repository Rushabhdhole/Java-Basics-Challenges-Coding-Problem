/*======================= This & Super keyword =======================*/
/* Note :- For avoiding the confusion we use those types of keywords
1. this is used to access methods of the current class
2. super keyword is used to access methods of the parent class */
class A
{
    void fun()
    {
        System.out.println("10");
    }
}
class B extends A
{
    void fun()
    {
        System.out.println("20");
    }
}
class C extends B {
    void fun()
    {
        System.out.println("30");
    }
    void gun()
    {
        fun();             //it will call the current class method
        this.fun();        //this keyword call the current class method
        super.fun();       //spuer keyword call the parent class method
    }
}
class main
{
    public static void main(String args [])
    {
        C cobj = new C();
        cobj.gun();          //it will call the gun() method and all code get executed
    }
}