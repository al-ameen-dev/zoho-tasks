import org.w3c.dom.ls.LSOutput;

/*
Design a Student Parent class and ZSGSStudent Child class.
Create constructors in both class with varying number of parameters.
Call parent constructor from child constructor. Try experimenting by creating child object using parent constructor.
 */
class Student{
    String name;
    short age;
    String location;

    public Student(String name,short age,String location){
        this.name = name;
        this.age = age;
        this.location = location;
    }
}

class ZSGSStudent extends Student{
    boolean isSmart;
    public ZSGSStudent(String name, short age, String location,boolean isSmart) {
        super(name, age, location);
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "ZSGSStudent{" +
                "isSmart=" + isSmart +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
public class ParentChildDemo {
    public static void main(String[] args) {
        Student student = new ZSGSStudent("ameen",(short)22,"Tirunelveli",true);
        System.out.println(student);
    }
}
