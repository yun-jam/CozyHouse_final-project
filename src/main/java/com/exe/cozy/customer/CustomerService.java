package com.exe.cozy.customer;

import com.exe.cozy.domain.CustomerDto;

public interface CustomerService {

	public String test();
	public void insertData(CustomerDto dto);
	public CustomerDto getReadData(String customerEmail);
	public void updateData(CustomerDto dto);
	public void deleteData(String customerEmail);
	
}
