public class Demo4 {
    public static void main(String[] args) {
        try{
        checkEligibility(-5);
        }catch(IllegalArgumentException e){
            System.out.println();
        }
    }

    public static void checkEligibility(int age){
        if(age <0){
            // System.out.println("Age can't be negative");
            throw new IllegalArgumentException("Age can't be negative");
        }

        if(age >=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("can't vote");
        }
    }
}
