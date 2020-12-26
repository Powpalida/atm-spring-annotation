package th.ac.ku.atm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataSourceFile implements DataSource{

    private String filename;

    public DataSourceFile(String filename){
        this.filename = filename;
    }

    public Map<Integer,Customer> readCustomers(){

        //จำลองการอ่านข้อมูลจากฐานไฟล์
        Map<Integer,Customer> customers = new HashMap<>();
        Scanner in;

        try {
            in = new Scanner(new FileReader(filename));
        } catch (FileNotFoundException e) {
            System.err.println("Problem reading a customer file: "+filename);
            return customers;
        }

        while (in.hasNext()) {
            int number = in.nextInt();
            String name = in.next();
            int pin = in.nextInt();
            double currentBalance = in.nextDouble();
            Customer c = new Customer(number, name, pin, currentBalance);
            customers.put(c.getId(), c);
        }
        in.close();
        return customers;

        /*customers.put(1,new Customer(1,"Kwan",1234,1000));
        customers.put(2,new Customer(2,"Ploy",2345,2000));
        customers.put(3,new Customer(3,"Fon",3456,3000));
*/

    }

}
