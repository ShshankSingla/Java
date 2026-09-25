public class CallByValue {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        System.out.println("value of x and y before call by value: "+ x +" and "+y);

        tokenInc(x,y);

        System.out.println("value of x and y after call by value: "+ x +" and "+ y);

    }

    static void tokenInc(int x , int y){
        x = x+10;
        y = y+ 10;
    }
    
}
