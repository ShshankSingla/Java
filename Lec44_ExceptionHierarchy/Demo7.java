public class Demo7 {
    public static void main(String[] args) {
        try{
            checkEligibility(-5);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
            System.out.println("entered age was : "+e.getAge());
        }
    }

    public static void checkEligibility(int age) throws InvalidAgeException{
        if(age <0){
            // System.out.println("Age can't be negative");
            throw new InvalidAgeException("Age can't be negative", age);

        }

        if(age >=18){
            System.out.println("You are eligible to vote");
        }
    }
}

class InvalidAgeException extends Exception{

    private int age;

    public InvalidAgeException(String msg, int age){
        super(msg);
        this.age = age;
    }

    // getter
    public int getAge(){
        return this.age;
    }
}
