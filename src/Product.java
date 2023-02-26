public class Product {
    private String name;
    private String brand;
    private double price;
    private int number;
    private String category;
    private Guarantee guarantee;
    private String color;

    public Product(String name, String brand, double price, int number, String category, Guarantee guarantee, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.number = number;
        this.category = category;
        this.guarantee = guarantee;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Guarantee getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Guarantee guarantee) {
        this.guarantee = guarantee;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void sell( int count){
        if (this.number >= count){
            this.number -= count;
        }
        else
        {
            System.err.println("Number of this product is insufficient! Selling protocol has been failed!");
        }
    }

    public void buy( int count){
        this.number += count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", category='" + category + '\'' +
                ", guarantee=" + guarantee +
                ", color='" + color + '\'' +
                '}';
    }
}
