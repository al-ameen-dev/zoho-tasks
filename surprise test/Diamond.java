import java.util.*;

class Diamond{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sizee:");
        int n = scanner.nextInt();
        int temp = n;
        int mid = (n*n)/2;
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=(n*n)-1;j++)
            {
                if(j>mid-i && j<mid+i){
                    if(j<n){
                        temp-=1;
                        System.out.print(temp);
                    }else{
                        temp+=1;
                        System.out.print(temp);
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=(n*n)-1;j++)
            {
                if(j<mid+i && j>mid-i){
                    if(j>n){
                        temp+=1;
                        System.out.print(temp);
                    }else{
                        temp-=1;
                        System.out.print(temp);
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}