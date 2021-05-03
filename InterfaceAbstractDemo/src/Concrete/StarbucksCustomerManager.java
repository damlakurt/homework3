package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public  class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService ;

	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
			System.out.println("Starbucks Müsterisi Kaydedildi : "+ " " + customer.getFirstName());
			
		}else {
			System.out.println("Kiþi Bulunamadý");
				
			}
		}
		
		
		
		
		
	}

	
		
		
	


