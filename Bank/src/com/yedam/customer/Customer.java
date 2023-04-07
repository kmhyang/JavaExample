package com.yedam.customer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

//CustomerDTO
public class Customer {
	private int customerId;
	private String customerPw;
	private String customerName;
//	private int accountId;
	private String customerGrade;
	
	
}
