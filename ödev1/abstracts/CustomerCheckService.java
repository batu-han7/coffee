package abstracts;
import java.rmi.RemoteException;

import entities.Customer;

public interface CustomerCheckService {
	
    boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
