package th.ac.ku.atm;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public interface DataSource {

    Map<Integer,Customer> readCustomers();

}
