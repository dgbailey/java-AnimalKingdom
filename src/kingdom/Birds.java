package kingdom;
import java.util.Date;

public class Birds extends AbstractAnimal
{
    
    
    public Birds(String name,Date dateDiscovered)
    {
        
        this.name = name;
        this.dateDiscovered = dateDiscovered;
    }

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
    

}