package com.app.rest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bean3.Cart;
import com.app.consumer1.CartConsumer;
import com.app.consumer1.CartConsumerfeign3;

@RestController
@RequestMapping("/order")
public class OrderRestController {
	
	@Autowired
	private CartConsumerfeign3 consumer;
	
	
	@GetMapping("/place")
	public ResponseEntity<String> placeOrder(){
		
		String cartRes = consumer.showMessage().getBody();
		
		return ResponseEntity.ok("ORDER PLACED WITH => " + cartRes);
	}
	
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<String> fetchOrderWithCart(@PathVariable("id") Integer id){
		
		Cart cob = consumer.getCartById(id).getBody();
		
		return ResponseEntity.ok("ORDER WITH CART DATA => " + cob);
	}
	
	@PostMapping("/addToCart")
	public ResponseEntity<String> addCart(@RequestBody Cart cart){
		String cartResp = consumer.addToCart(cart).getBody();
		
		return ResponseEntity.ok("ORDER WITH =>" + cartResp);
	}

}
