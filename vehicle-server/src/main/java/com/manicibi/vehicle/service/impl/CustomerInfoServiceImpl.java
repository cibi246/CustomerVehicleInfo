package com.manicibi.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.manicibi.vehicle.model.CustomerInfo;
import com.manicibi.vehicle.service.ICustomerInfoService;

@Service
public class CustomerInfoServiceImpl implements ICustomerInfoService {

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public List<CustomerInfo> findAll() {
		String sql = "Select * from CUSTOMERS_INFO";
		List<CustomerInfo> customers = jdbc.query(sql, new BeanPropertyRowMapper(CustomerInfo.class));
		return customers;
	}

	@Override
	public CustomerInfo findById(Integer id) {
		 String sql = "SELECT * FROM CUSTOMERS_INFO WHERE ID=?";

	        CustomerInfo customer = (CustomerInfo) jdbc.queryForObject(sql, new Object[]{id},
	                new BeanPropertyRowMapper(CustomerInfo.class));

	        return customer;
	}

}
