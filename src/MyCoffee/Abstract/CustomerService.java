package MyCoffee.Abstract;

import MyCoffee.Entities.Customer;

public interface CustomerService {
    void saveToDb(Customer customer) throws Exception;
}
