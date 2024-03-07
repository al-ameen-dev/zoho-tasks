public class ScopeOfVariable {
    public static void main(String[] args) {
        int a = 10;
        if(a>5)
        {
            int b = 20;
        }
        System.out.println(a);
        /* The error showing is:
        Unresolved compilation problem: 
        b cannot be resolved to a variable at ScopeOfVariable.main(ScopeOfVariable.java:9)
        */
        //System.out.println(b);
    }
}
