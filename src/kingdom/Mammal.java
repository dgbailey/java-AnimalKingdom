package kingdom;
import java.util.Date;

public class Mammal extends AbstractAnimal
{
    
    
    public Mammal(String name,int dateDiscovered)
    {
        
        this.name = name;
        this.dateDiscovered = dateDiscovered;
    }

    public String getName()
    {
        return this.name;
    }

    public int getDate()
    {
        return this.dateDiscovered;
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
    
    @Override
	public String toString()
	{
		return "idnum: " + idnum +" name = " + name + "\n" + "discovered = " + dateDiscovered;
	}

}