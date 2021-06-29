package ru.geekbrains.onlinestore;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    ProductRepository productRepository = new ProductRepository();

//http://localhost:8189/store

    @GetMapping("/homePage")
    @ResponseBody
    public String homeMethod() {
        return "Welcome to my shop";
    }


//Задание 4.Сделать форму для добавления товара в репозиторий и логику работы этой формы;
    @GetMapping("/create_products_form")
    public String showCreateProductForm() {
        return "create_product";
    }


    @PostMapping("/create_new_product")
    public String createNewProduct(@RequestParam int id, @RequestParam String title, @RequestParam double cost) {
        Product product = new Product(id, title, cost);
        productRepository.getAllProducts().add(product);
        return "redirect:/products";
    }

    //Задание 5.Сделать страницу, на которой отображаются все товары из репозитория.
    @GetMapping("/products")
    public String showAllProducts(Model model) {
        model.addAttribute("products", productRepository.getAllProducts());
        return "products";
    }
}
