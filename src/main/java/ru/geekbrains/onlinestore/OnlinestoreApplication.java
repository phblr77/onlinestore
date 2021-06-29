package ru.geekbrains.onlinestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Разобраться с примером проекта на Spring MVC;//done
//Создать класс Товар (Product), с полями id, title, cost;//done
//Товары необходимо хранить в репозитории (класс, в котором в виде List<Product> хранятся товары). Репозиторий должен
// уметь выдавать список всех товаров и товар по id;//done
//Сделать форму для добавления товара в репозиторий и логику работы этой формы;
//Сделать страницу, на которой отображаются все товары из репозитория.//done
@SpringBootApplication
public class OnlinestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinestoreApplication.class, args);
	}

}
