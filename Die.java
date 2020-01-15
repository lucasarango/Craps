
/**
 * Creates a die for the game craps.
 *
 * @author Lucas Arango
 * @version 1-15-2020
 */
public class Die
{
    private int num;
    public int roll()
    {
        num = ((int) (Math.random() * 6) + 1);
        return num;
    }
    public int getResult()
    {
        return num;
    }
}
