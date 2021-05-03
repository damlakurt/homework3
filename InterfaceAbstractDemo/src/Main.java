import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;



public class Main {

	public static void main(String[] args) {
		
		 
		Customer customer = new Customer(0, "Damla", "K", "62626262", LocalDate.of(2000, 2, 26));
		
		
		Customer customer2=new Customer(1, "Emircan", "Ý", "6565656", LocalDate.of(1999, 6, 13));
		
		
		
		
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new CustomerCheckManager());
		
		
		customerManager.save(customer);
		customerManager.save(customer2);
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager2.save(customer2);
		customerManager2.save(customer);
		
	}
	

	
	

}
