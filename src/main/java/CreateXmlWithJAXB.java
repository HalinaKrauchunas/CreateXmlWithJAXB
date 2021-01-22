import javax.xml.bind.*;
import java.io.*;
import java.text.*;
import java.util.*;

public class CreateXmlWithJAXB {

    public static void main(String[] args) throws JAXBException, ParseException {

        List<Customer> data = DataProvider.getData(DataProvider.SMALL);
        Customers customers = new Customers();
        customers.setCustomers(data);

        JAXBContext context = JAXBContext.newInstance(Customers.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter writer = new StringWriter();
        marshaller.marshal(customers, writer);

        File file = new File("./output/customersOutput.xml");
        marshaller.marshal(customers, file);

        System.out.println(writer.toString());
    }
}
