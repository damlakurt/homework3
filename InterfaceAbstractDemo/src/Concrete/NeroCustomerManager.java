package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerChekService;
	
	
	public NeroCustomerManager(CustomerCheckService customerChekService) {
		super();
		this.customerChekService = customerChekService;
	}


	@Override
	public void save(Customer customer) {
		
		if (customerChekService.CheckIfRealPerson(customer)) {
			super.save(customer);
			System.out.println("Nero Müsterisi Kaydedildi : "+ " " + customer.getFirstName());
		}else {
			System.out.println("Kiþi Bulunamadý");
			
		}
		
		
	}

}
