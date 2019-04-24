package kingdom;
import java.util.Date;

public class Fish extends AbstractAnimal
{
    
    
    public Fish(String name,Date dateDiscovered)
    {
        
        this.name = name;
        this.dateDiscovered = dateDiscovered;
    }

    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breathe()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
    

}