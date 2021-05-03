package MyCoffee.Concrete;

import MyCoffee.Abstract.BaseCustomerManager;
import MyCoffee.Abstract.CustomerService;
import MyCoffee.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    @Override
    public void saveToDb(Customer customer) throws Exception {
        super.saveToDb(customer);
    }
}
