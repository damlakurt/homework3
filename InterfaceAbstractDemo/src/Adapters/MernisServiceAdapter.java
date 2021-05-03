package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean returnType= false;
		
		try {
			  returnType = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return returnType;
		
	}

}
