import becker.robots.*;

public class Swimmer extends RobotSE implements Runnable
{
    public Swimmer(City aCity, int row, int column, Direction aDirection)
    {
        super(aCity, row, column, aDirection);
    }

    public void run()
    {
        this.routine();
    }

    public void routine()
    {
        this.spiral();
        this.spin();
        this.counterClockwiseSquare(1);
        this.counterClockwiseSquare(4);
        this.zigZagAcross(4);
        this.turnAround();
        this.zigZagAcross(2);
        this.turnRight();
        this.smallSquareTogether(3);
        this.turnRight();
        this.smallSquareTogether(3);
        this.endingAlignment();
        this.leave();
    }

    public void spiral()
    {
        this.move();
        this.turnRight();
        this.move(2);
        this.turnRight();
        this.move(3);
        this.turnRight();
        this.move(4);
    }

    public void spin()
    {
        this.turnLeft(10);
    }

    public void counterClockwiseSquare(int size)
    {
        for (int i = 0; i < 4; i++)
        {
            this.move(size);
            this.turnLeft();
        }
    }

    public void clockwiseSquare(int size)
    {
        for (int i = 0; i < 4; i++)
        {
            this.move(size);
            this.turnRight();
        }
    }

    public void zigZagAcross(int time)
    {
        for (int i = 0; i < time; i++)
        {
            zigZag();
        }

    }

    public void zigZag()
    {
        this.move();
        this.turnLeft();
        this.move();
        this.turnRight();
    }

    public void smallSquareTogether(int times)
    {
        for (int i = 0; i < times; i++)
        {
            clockwiseSquare(1);
        }
    }

    public void endingAlignment()
    {
        if (this.isFacingSouth())
        {
            this.turnLeft(3);
        } else if (this.isFacingWest())
        {
            this.turnRight(4);
        } else if (this.isFacingEast())
        {
            this.turnAround();
        } else
        {
            this.turnLeft();
        }
    }

    public void leave()
    {
        this.move(10);
    }
}
