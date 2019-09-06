package com.manicibi.vehicle.service;

import java.util.List;

import com.manicibi.vehicle.model.CustomerInfo;

public interface ICustomerInfoService {

	public List<CustomerInfo> findAll();
	public CustomerInfo findById(Integer id);
}
