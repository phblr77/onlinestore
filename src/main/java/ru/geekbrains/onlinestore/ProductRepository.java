package ru.geekbrains.onlinestore;
//Товары необходимо хранить в репозитории (класс, в котором в виде List<Product> хранятся товары). Репозиторий должен
// уметь выдавать список всех товаров и товар по id;


import java.util.ArrayList;
import java.util.List;


public class ProductRepository {

//    private List<Product> products = new ArrayList<>(Arrays.asList(
//                new Product(1, "Milk", 2.3),
//                new Product(2, "Meat", 4.5),
//                new Product(3, "Bread", 1.7),
//                new Product(4, "Butter", 3.2),
//                new Product(5, "Coffee", 2.9)
//        ));
    private List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        throw new RuntimeException("Product not found");
    }
}
