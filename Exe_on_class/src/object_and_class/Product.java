package object_and_class;

public class Product implements Comparable<Product> {
    String name;
    double price;
    int quantity;

    // hàm khởi tạo.
    // - tên trùng với tên class
    // - không có kiểu dữ liệu trả về.
    // this: đại diện cho class hiện tại
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Product other) {
        // Compare based on the age attribute
        return Double.compare(this.price, other.price);
    }

    public String display() {
        return name + " đang được bán với giá " + price + "$ số lượng đang có là " + quantity;
    }
}
