package adapters;
import java.rmi.RemoteException;
import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	public boolean CheckIfRealPerson(Customer customer) {
	
	KPSPublicSoap client = new KPSPublicSoapProxy();
	try {
		return client.TCKimlikNoDogrula(
			    Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), 
				customer.getDateOfBirth().getYear()
				);
	}catch (NumberFormatException e) {
        e.printStackTrace();
	}catch (RemoteException e) {
		e.printStackTrace();
	}
	return false;
}
}