public class Product {

    int proid;
    String proname;
    double price;

    public Product(int proid, String proname, double price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
    }


    public void display()
    {
        System.out.println("Product ID: " + proid + ", Product Name: " + proname + ", Price: " + price);
    }

    public static void main(String[] args) {

        Product[] products = new Product[5];
        products[0] = new Product(1, "Laptop", 800.00);
        products[1] = new Product(2, "Smartphone", 600.00);
        products[2] = new Product(3, "Tablet", 300.00);
        products[3] = new Product(4, "Smartwatch", 150.00);
        products[4] = new Product(5, "Headphones", 100.00);


        for (Product product : products) {
            product.display();
        }
    }
}



