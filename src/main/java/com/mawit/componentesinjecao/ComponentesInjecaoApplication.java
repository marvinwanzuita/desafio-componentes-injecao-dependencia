package com.mawit.componentesinjecao;

import com.mawit.componentesinjecao.entities.Order;
import com.mawit.componentesinjecao.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComponentesInjecaoApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ComponentesInjecaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println();
		Order order1 = new Order(1034, 150.00, 20.0);
		System.out.println("Pedido código: " + order1.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order1)));

		System.out.println();
		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.println("Pedido código: " + order2.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order2)));

		System.out.println();
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código: " + order3.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order3)));

	}
}
