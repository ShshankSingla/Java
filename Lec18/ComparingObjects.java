public class ComparingObjects {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;

        if(x==y){
            System.out.println(x == y);
            System.out.println("comparing primitive datatypes with '==' ");
        }else{
            System.out.println("not equal");
        }

        Integer a = 200;
        Integer b = 200;

        if(a==b){ // compare primitive values / object references
            System.out.println(" == ");
        }
        else if(a.equals(b)){ // compare object contents
            System.out.println(" .equals() ");
        }
        else{
            System.out.println("kuch bhi karlo equal nahi hai, both pointing to different locations in heap");
        }

        System.out.println((a.intValue())==(b.intValue()));

    }
}
