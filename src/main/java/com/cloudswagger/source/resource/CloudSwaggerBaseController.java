/**
 * 
 */
package com.cloudswagger.source.resource;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudswagger.source.model.Customer;

/**
 * @author Manoj Fernando A
 *
 */

@RestController
@RequestMapping("/api")
public class CloudSwaggerBaseController {
	
	ConcurrentHashMap<String,Customer> map = new ConcurrentHashMap<String,Customer>();	

	@RequestMapping("/addCustomer")
	public String addCustomer(Customer customer) {
		map.put(customer.getCustomerName(), customer);
		return "Added Successfully";
	}
	
	@RequestMapping("/getCustomer")
	public Customer getCustomer(String name) {
		return map.get(name);
	}
	
	@RequestMapping("/test")
	public String test( ) {
		return "Returning";
	}
}
