import becker.robots.*;

public class Pool
{

    public static void main(String[] args)
    {
        City pool = new City();
        Swimmer swimmer1 = new Swimmer(pool, 5,5, Direction.NORTH);
        Swimmer swimmer2 = new Swimmer(pool, 5,6, Direction.EAST);
        Swimmer swimmer3 = new Swimmer(pool, 6,5, Direction.WEST);
        Swimmer swimmer4 = new Swimmer(pool, 6,6, Direction.SOUTH);

        Thread swim1 = new Thread(swimmer1);
        Thread swim2 = new Thread(swimmer2);
        Thread swim3 = new Thread(swimmer3);
        Thread swim4 = new Thread(swimmer4);

        swim1.start();
        swim2.start();
        swim3.start();
        swim4.start();
    }
}
