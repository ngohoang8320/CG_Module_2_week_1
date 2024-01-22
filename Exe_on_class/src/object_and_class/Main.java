package object_and_class;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Product nyCong = new Product("Ny Công", 900, 1);
    static Product nyKhoa = new Product("Ny Khoa", 500, 10);
    static Product[] products = {nyCong, nyKhoa};

    public static void main(String[] args) {
        while (true) {
            System.out.println("Quản Lý Sản Phẩm");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm sản phẩm");
            System.out.println("6. Sắp xếp theo giá");
            System.out.println("0. End");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    display();
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    findProduct();
                    break;
                case 6:
//                    Arrays.sort(products);
                    int index = 0;
                    Product[] sortedProducts = new Product[products.length];
                    sortedProducts = sortProduct(sortedProducts, products, index);
                    products = sortedProducts;
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public static Product[] sortProduct(Product[] sortedArr, Product[] arr, int index) {
        if (arr.length != 0) {
            double minPrice = arr[0].price;
            int indexMin = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].price < minPrice) {
                    minPrice = arr[i].price;
                    indexMin = i;
                }
            }
            sortedArr[index] = arr[indexMin];
            Product[] newArr = new Product[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (i < indexMin) {
                    newArr[i] = arr[i];
                } else if (i > indexMin) {
                    newArr[i - 1] = arr[i];
                }
            }
            sortProduct(sortedArr, newArr, index + 1);
        }
        return sortedArr;
    }

    public static void findProduct() {
        System.out.println("Enter name of product:");
        String findStr = scanner.nextLine();
        for (Product p : products) {
            if (p.name.contains(findStr)) {
                System.out.println(p.display());
            }
        }
    }

    public static void editProduct() {
        System.out.println("Enter index:");
        int index = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                System.out.println("Enter name: ");
                products[i].name = scanner.nextLine();
                System.out.println("Enter price: ");
                products[i].price = scanner.nextDouble();
                System.out.println("Enter quantity: ");
                products[i].quantity = scanner.nextInt();
                scanner.nextLine();
                break;
            }
        }
    }

    public static void removeProduct() {
        System.out.println("Enter index:");
        int index = scanner.nextInt();
        scanner.nextLine();
        Product[] newProducts = new Product[products.length - 1];
        for (int i = 0; i < products.length; i++) {
            if (i < index) {
                newProducts[i] = products[i];
            } else if (i > index) {
                newProducts[i - 1] = products[i];
            }
        }
        products = newProducts;
    }

    public static void display() {
        for (Product p : products) {
            System.out.println(p.display());
        }
    }

    public static void addProduct() {
        System.out.println("Nhập name sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập price sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quantity sản phẩm");
        int quantity = Integer.parseInt(scanner.nextLine());
        Product product = new Product(name, price, quantity);

        Product[] productsNew = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            productsNew[i] = products[i];
        }
        productsNew[productsNew.length - 1] = product;
        products = productsNew;
    }
}
