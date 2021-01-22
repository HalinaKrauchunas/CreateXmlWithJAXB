import javax.xml.bind.annotation.*;
import java.util.*;

@XmlRootElement(name = "customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customers {

    @XmlElement(name = "customer", type = Customer.class)
    private List<Customer> customers;

    public List<Customer> getCustomers() {

        return customers;
    }

    public void setCustomers(List<Customer> customers) {

        this.customers = customers;
    }
}
