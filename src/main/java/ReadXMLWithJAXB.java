import javax.xml.bind.*;
import java.io.*;
import java.util.*;

public class ReadXMLWithJAXB {

    public static void main(String[] args) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(Customers.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        File file = new File("./output/customersOutput.xml");
        Customers customers = (Customers) unmarshaller.unmarshal(file);
        List<Customer> data = customers.getCustomers();

        for (Customer customer : data) {
            System.out.println(customer);
        }
    }
}
