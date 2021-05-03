package MyCoffee.Abstract;

import MyCoffee.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

    @Override
    public void saveToDb(Customer customer) throws Exception {
        System.out.println("Müşteri veri tabanına eklendi : " + customer.getFullName());
    }
}
