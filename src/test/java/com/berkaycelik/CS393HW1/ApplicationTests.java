package com.berkaycelik.CS393HW1;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.berkaycelik.CS393HW1.model.*;
import com.berkaycelik.CS393HW1.repository.*;

@SpringBootTest
class ApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AddressRepository addressRepository;

	@Autowired
	ShopRepository shopRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	OrderRepository orderRepository;
	@Test

	void test() {





		Address addr1=new Address();
		addr1.setCity("Istanbul");
		addr1.setText("Barbaros Mahallesi Karanfil Sokak Kentplus");

		Address addr2=new Address();
		addr2.setCity("Istanbul");
		addr2.setText("Yenişehir Mahallesi 29 Ekim Sokak Megalife");

		Address addr3=new Address();
		addr3.setCity("Istanbul");
		addr3.setText("Barbaros Mahallesi Ardıç Sokak Kentplus");


		addressRepository.save(addr1);
		addressRepository.save(addr2);
		addressRepository.save(addr3);

		Customer cust1=new Customer();
		cust1.setFirstName("Kaan");;
		cust1.setLastName("Eryücel");

		Customer cust2=new Customer();
		cust2.setFirstName("Tuna");;
		cust2.setLastName("Yiğit");

		Customer cust3=new Customer();
		cust3.setFirstName("Alper");;
		cust3.setLastName("Patlar");

		cust1.setAddress(addr1);
		cust2.setAddress(addr2);
		cust3.setAddress(addr3);



		customerRepository.save(cust1);
		customerRepository.save(cust2);
		customerRepository.save(cust3);

		Product product1 = new Product();
		product1.setName("Air Jordan Mid Shattered Backboard");
		product1.setPrice(220.00);
		productRepository.save(product1);

		Product product2 = new Product();
		product2.setName("Air Jordan 1 Retro High OG");
		product2.setPrice(340.00);
		productRepository.save(product2);

		Shop shop = new Shop();
		shop.setName("Retroshoes");
		shop.setAddress("Teşvikiye / İstanbul");
		shopRepository.save(shop);


		product1.setShop(shop);
		product2.setShop(shop);
		shop.getProducts().add(product2);


		cust1.setShop(shop);
		cust2.setShop(shop);
		cust3.setShop(shop);

		Order order1 = new Order();
		order1.setAmount(2);
		order1.setDate(new Date());
		order1.setCustomer(cust1);
		order1.getProducts().add(product1);

		shopRepository.save(shop);
		productRepository.save(product1);
		productRepository.save(product2);
		orderRepository.save(order1);
		customerRepository.save(cust1);
		customerRepository.save(cust2);
		customerRepository.save(cust3);
		addressRepository.save(addr1);
		addressRepository.save(addr2);
		addressRepository.save(addr3);

	}

}
