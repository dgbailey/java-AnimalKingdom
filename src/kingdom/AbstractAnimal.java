package kingdom;
import java.util.Date;

public abstract class AbstractAnimal
{
    public static int maxId = 0;
    int idnum;
    

    public AbstractAnimal()
    {
        madId++;
        idnum = maxId;
        
    }

    public abstract String move();
    public abstract String reproduce();
    public abstract String breathe();
    
}