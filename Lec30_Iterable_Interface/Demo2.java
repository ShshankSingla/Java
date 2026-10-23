import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        String[] names = {"Aditya", "Rohit", "Rohan", "Monu"};
        NameContainer container = new NameContainer(names);

        Iterator<String> it = container.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }  
    }
}
 // one time use of internal class - > anonymous class
class NameContainer implements Iterable<String>{
    private String[] names;
    private int size;

    NameContainer(String[] names){
        this.names = names;
        this.size = this.names.length;
    }

    @Override
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            
            private int pos =0;
            @Override
            public boolean hasNext(){
                return pos<size;
            }

            @Override
            public String next(){
                return names[pos++];
            }
        };
    }

    
}


/*
class NameContainer implements Iterable<String>{
    private String[] names;
    private int size;

    NameContainer(String[] names){
        this.names = names;
        this.size = this.names.length;
    }

    @Override
    public Iterator<String> iterator(){
        return new NameContainerIterator();
    }

    private class NameContainerIterator implements Iterator<String>{

        private int pos =0;
        @Override
        public boolean hasNext(){
            return pos<size;
        }

        @Override
        public String next(){
            return names[pos++];
        }
    }
}

*/