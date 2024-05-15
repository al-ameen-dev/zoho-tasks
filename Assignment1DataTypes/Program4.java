package Assignment1DataTypes;
/*
 Create multiple classes in single file and compile and explore how many .class files are generated.
 */
public class Program4 {
    public static void main(String[] args) {
        System.out.println("The class created is:"+Program4.class.getName());
        System.out.println("The class name is:"+InnerClass.class.getName());
        System.out.println("The class name is:"+A.class.getName());
        System.out.println("The class name is:"+B.class.getName());
        System.out.println("The class name is:"+C.class.getName());
        System.out.println("The class name is:"+D.class.getName());
    }

    static class InnerClass{

    }
}


class A{

}

class B{

}

class C{

}

class D{

}