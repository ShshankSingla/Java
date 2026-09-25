public class StringArgs {
    public static void main(String[] args) {
        System.out.println("No. of arguments are: "+ args.length);

        for(int i=0;i<args.length;i++){
            System.out.println("Argument: "+i+" = "+ args[i]);
        }
    }
    
}


// int terminal:  javac StringArgs.java && java StringArgs
// No. of arguments are: 0

// in terminal :  java StringArgs Shshank Singla
// No. of arguments are: 2
// Argument: 0 = Shshank
// Argument: 1 = Singla

