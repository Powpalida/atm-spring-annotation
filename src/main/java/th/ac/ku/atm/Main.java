package th.ac.ku.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        ATM atm = context.getBean(ATM.class);
        Bank bank = context.getBean(Bank.class);
        System.out.println(bank.getName());

        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();



    }
}
