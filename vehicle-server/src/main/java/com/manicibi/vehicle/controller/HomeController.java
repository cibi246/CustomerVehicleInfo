/**
 * 
 */
package com.manicibi.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manicibi.vehicle.model.CustomerInfo;
import com.manicibi.vehicle.service.ICustomerInfoService;

@RestController
@ComponentScan({"com.manicibi.vehicle"})
@EntityScan("com.manicibi.vehicle.model")
public class HomeController {
	
	@Autowired
	private ICustomerInfoService customerInfoService;
	
	@RequestMapping("/home")
	@GetMapping
	public String home() {
		return "forward:/index.html";
	}

	@RequestMapping(value="/firstapp", produces = MediaType.APPLICATION_JSON_VALUE)
	public String firstApp() {
		System.out.println("My Google service is working fine in GCP environment");
		return "My Google service is working fine in GCP environment";
	}
	
	@RequestMapping(value="/customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerInfo> findCustomers() {
        System.out.println(customerInfoService.findAll());
        return customerInfoService.findAll();
    }

    @RequestMapping(value="/customers/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerInfo findCustomerById(@PathVariable Integer userId) {
        System.out.println(customerInfoService.findById(userId));
        return customerInfoService.findById(userId);
    }
}
