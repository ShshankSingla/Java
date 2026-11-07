public class Demo5 {
    // not a good way
    public static void main(String[] args) {
        // method is self throwing exception and catching it itself
        checkEligibility(-5);
        
    }

    public static void checkEligibility(int age){
        try{
                if(age <0){
                    // System.out.println("Age can't be negative");
                    throw new IllegalArgumentException("Age can't be negative");
                }

                if(age >=18){
                    System.out.println("You are eligible to vote");
                }else{
                    System.out.println("can't vote");
                }

        }catch(IllegalArgumentException e){
            System.out.println();
        }
    }
}
