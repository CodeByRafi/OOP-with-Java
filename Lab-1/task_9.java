class Product 
{ 
    private String name;
    private double price;
    private String category;
    public Product(String name, double price, String category) 
    {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public void displayInfo()
    {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
        System.out.println("---------------------");
    }
}
public class task_9 
{ 
    public static void main(String[] args) 
    {
        Product product1 = new Product("Laptop", 899.99, "Electronics");
        Product product2 = new Product("Shampoo", 5.49, "Beauty");
        Product product3 = new Product("Coffee Maker", 45.99, "Home Appliances");
        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();
    }
}
