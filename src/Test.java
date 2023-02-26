import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        Guarantee guarantee = new Guarantee("Missing/Thieve", new Date(), "Sam Service");
        Phone phone = new Phone("11 Promax", "Apple", 1100, 10, "Technology/Phone", guarantee, "Black", 40, "A12", 16,256, "iOS", 5.1);
        Laptop laptop = new Laptop("M1 Pro", "Apple", 1500, 5, "Technology/Laptop", guarantee, "Space Silver", "M1", "4K", 8, "M1", true, 512, "osX");
        Watch watch = new Watch("Series 8", "Apple", 500, 3, "Technology/Smart Watch", guarantee, "Blue", "watchOS", 43, "A3",16, true);
        products.add(phone);
        products.add(laptop);
        products.add(watch);
        products.get(0).buy(3);
        System.out.println(products.get(0));
    }
}
