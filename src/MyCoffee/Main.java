package MyCoffee;

import MyCoffee.Abstract.BaseCustomerManager;
import MyCoffee.Concrete.NeroCustomerManager;
import MyCoffee.Concrete.StarbucksCustomerManager;
import MyCoffee.Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager();
        customerManager.saveToDb(new Customer(1,"Temuçin", "Nacar", LocalDate.of(1991,11,29),"12345678901"));
    }
}
