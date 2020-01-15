
/**
 * Creates a die for the game craps.
 *
 * @author Lucas Arango
 * @version 1-15-2020
 */
public class Die
{
    public int roll()
    {
        return ((int) (Math.random() * 6) + 1);
    }
}
