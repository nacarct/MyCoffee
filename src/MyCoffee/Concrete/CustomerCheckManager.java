package MyCoffee.Concrete;

import MyCoffee.Abstract.CustomerCheckService;
import MyCoffee.Adapters.MernisServiceAdapter;
import MyCoffee.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkCustomer(Customer customer) {

        MernisServiceAdapter mernisServiceAdapter = new MernisServiceAdapter();
        return mernisServiceAdapter.checkCustomer(customer);
    }
}
