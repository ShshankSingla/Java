public class Demo2 {
    public static void main(String[] args) {
        Direction d = Direction.NORTH;
        d.move();
    }
}

enum Direction{
    NORTH{
        @Override
        public void move(){
            System.out.println("Moving up");
        }
    }, 
    SOUTH{
        @Override
        public void move(){
            System.out.println("Moving down");
        }
    },
    EAST{
        @Override
        public void move(){
            System.out.println("Moving right");
        }
    },
    WEST{
        @Override
        public void move(){
            System.out.println("Moving left");
        }
    };

    public abstract void move();
}
 