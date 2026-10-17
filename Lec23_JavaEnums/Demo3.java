public class Demo3 {
    public static void main(String[] args) {
    //    Direction.values(); // it returns an array of all the entries in enum
        Direction[] directions = Direction.values();

        for(Direction dir : directions){
            System.out.println(dir.name());
        }

        // till now we are writing it like that
        // Direction d = Direction.EAST;
        Direction d = Direction.valueOf("EAST");
        System.out.println(d.name());

        System.out.println(d.ordinal());
    }
}

// values() --> we can iterate in this enum
// valueOf()  --> convert a string into an enum constant
// name() --> to get name of object 
// ordinal() --> to get the internal index of constant



enum Direction{
    NORTH, 
    SOUTH, 
    EAST, 
    WEST;
}