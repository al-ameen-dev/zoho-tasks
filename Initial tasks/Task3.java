public class Task3 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            System.out.printf("Group %d:%n",i);
            for(int j=100+i;j<=120;j+=4){
                System.out.println(j);
            }
        }
    }
}
