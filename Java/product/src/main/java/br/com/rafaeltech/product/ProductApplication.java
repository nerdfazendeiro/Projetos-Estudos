package br.com.rafaeltech.product;

import br.com.rafaeltech.product.entities.Order;
import br.com.rafaeltech.product.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.9,0.0);
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor Total: R$ " + orderService.getOrderAmount(order));
	}
}
