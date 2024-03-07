package combinedAssignments1;

public class ProductClass {
    public static void main(String[] args) {
        Product product = new Product(2, 1.5f, "Aachi masala", 0.23232, false, 'A');
        System.out.printf("Product Id:%d%n",product.productId);
        System.out.printf("Product Name:%s%n",product.productName);
        System.out.printf("Weight in KG:%.1f%n",product.weightInKG);
        System.out.printf("Particle size:%f%n",product.particleSize);
        System.out.printf("Is Expired:%b%n",product.isExpired);
        System.out.printf("Grade:%c%n",product.grade);

    }
}

class Product
{
    int productId;
    String productName;
    float weightInKG;
    double particleSize;
    boolean isExpired;
    char grade;
    Product(int productId,float weightInKG,String productName,double particleSize,boolean isExpired,char grade)
    {
        this.productId = productId;
        this.productName = productName;
        this.weightInKG = weightInKG;
        this.particleSize = particleSize;
        this.isExpired = isExpired;
        this.grade = grade;
    }
}
