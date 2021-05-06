
import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
        
        Customer customer1 = new Customer(1,"Hasret" , "Kalhan", LocalDate.of(1998, 07, 19), "11111111111");
        Customer customer2 = new Customer(1,"Kübra" , "Çelik", LocalDate.of(2005, 07, 01), "12345678910");
        
        BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.Save(customer1); 
        System.out.println("Starbucks System \n ------------------");
        
        BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.Save(customer2);
		System.out.println("Nero System \n ------------------");
	}
}
