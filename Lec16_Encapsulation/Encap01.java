public class Encap01 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        // System.out.println(b.balance);

        b.deposit(500);
        b.withdraw(250);
        System.out.println(b.checkBalance());

    }

}

class BankAccount {
    private double balance = 0;

    BankAccount() {

    }

    
    public void deposit(int amount) {
        balance += amount;
    }

    
    public void withdraw(int amount) {
        balance -= amount;
    }

    // getter
    public double checkBalance() {
        return balance;
    }
}

class Student {
    private String name;
    private int rollNo;
    private int age;
    private String college;

    Student(String name, int rollNo, int age, String college){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.college = college;
    }

    //getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCollege(){
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    
}
