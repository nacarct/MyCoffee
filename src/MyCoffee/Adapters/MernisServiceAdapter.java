package MyCoffee.Adapters;

import MernisService.KPSPublicSoap;
import MernisService.KPSPublicSoapProxy;
import MyCoffee.Abstract.CustomerCheckService;
import MyCoffee.Entities.Customer;

import javax.xml.transform.Result;
import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkCustomer(Customer customer) {

        boolean result = true;
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        try {
            result = client.TCKimlikNoDogrula(
                    Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(),
                    customer.getBirthOfDate().getYear()
            );
        } catch (RemoteException e) {
            System.out.println(e.toString());
            result=false;
        }

        return result;
    }
}
