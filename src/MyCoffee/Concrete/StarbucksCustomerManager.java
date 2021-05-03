package MyCoffee.Concrete;

import MyCoffee.Abstract.BaseCustomerManager;
import MyCoffee.Abstract.CustomerCheckService;
import MyCoffee.Abstract.CustomerService;
import MyCoffee.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckManager customerCheckManager = new CustomerCheckManager();
    @Override
    public void saveToDb(Customer customer) throws Exception {
        if (customerCheckManager.checkCustomer(customer)){
            super.saveToDb(customer);
        }
        else{
            throw new Exception("Müşteri doğrulama yapılamadı...");
        }

    }
}
