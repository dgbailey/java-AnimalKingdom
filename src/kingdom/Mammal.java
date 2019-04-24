package kingdom;
import java.util.Date;

public class Mammal extends AbstractAnimal
{
    
    
    public Mammal(String name,Date dateDiscovered)
    {
        
        this.name = name;
        this.dateDiscovered = dateDiscovered;
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
    

}