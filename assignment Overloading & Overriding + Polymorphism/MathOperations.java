public class MathOperations {

    public short add(short a, short b) {
        return (short) (a + b);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public Short add(Short a, Short b) {
        return (short) (a + b);
    }

    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Float add(Float a, Float b) {
        return a + b;
    }

    public Double add(Double a, Double b) {
        return a + b;
    }

    public short subtract(short a, short b) {
        return (short) (a - b);
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a + b;
    }

    public Short subtract(short a, Short b) {
        return (short) (a + b);
    }

    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    public Double subtract(Double a, Double b) {
        return a - b;
    }

    public Float subtract(Float a, Float b) {
        return a - b;
    }

    public short multiply(short a, short b) {
        return (short) (a * b);
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public Short multiply(Short a, Short b) {
        return (short) ((short) a * b);
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public Float multiply(Float a, Float b) {
        return a * b;
    }

    public Double multiply(Double a, Double b) {
        return a * b;
    }

    public short divide(short a, short b) {
        if (a == 0 || b == 0){
            return 0;
        }
        return (short) (a/b);
    }
    public int divide(int a,int b){
        if (a == 0 || b == 0){
            return 0;
        }
        return a/b;
    }

    public float divide(float a,float b){
        if (a == 0 || b == 0){
            return 0;
        }
        return a/b;
    }

    public double divide(double a,double b){
        if (a == 0 || b == 0){
            return 0;
        }
        return a/b;
    }

    public Short divide(Short a,Short b){
        if (a == 0 || b == 0){
            return 0;
        }
        return (short) (a/b);
    }
    public Integer divide(Integer a,Integer b){
        if (a == 0 || b == 0){
            return 0;
        }
        return a/b;
    }

    public Float divide(Float a,Float b){
        if (a == 0 || b == 0){
            return 0f;
        }
        return a/b;
    }

    public Double divide(Double a,Double b){
        if (a == 0 || b == 0){
            return 0.0;
        }
        return a/b;
    }

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        Integer a = 45;
        Integer b = 65;
        System.out.println("Add :"+mathOperations.add(a,b));
        System.out.println("Subtract :"+mathOperations.subtract(a,b));
        System.out.println("Multiply :"+mathOperations.multiply(a,b));
        System.out.println("Divide :"+mathOperations.divide(a,b));
    }
}
