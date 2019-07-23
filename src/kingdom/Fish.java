package kingdom;
import java.util.Date;

public class Fish extends AbstractAnimal
{
    
    
    public Fish(String name,int dateDiscovered)
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

    @Override
	public String toString()
	{
		return "idnum" + idnum +" name = " + name + "\n" + "discovered = " + dateDiscovered;
	}

    

}