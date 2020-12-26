package th.ac.ku.atm;

public class Customer {
    //attributes (primitive type)
    private int id;
    private String name;
    private  int pin;

    //composition
    private BankAccount account;

    public Customer(int id, String name, int pin) {
       this(id,name,pin,0); //ตอนเปิดบชไม่ได้เอาเงินมาฝาก ไปเรียก constructor ด้านล่าง
    }

    public Customer(int id, String name, int pin,double balance) {
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.account = new BankAccount(id,name,balance);   //รับ balance เข้ามาด้วย
    }

    public boolean checkPin(int inputPin){
        return pin == inputPin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }
}
