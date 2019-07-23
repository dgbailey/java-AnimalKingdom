package kingdom;
import java.util.Date;

public class Birds extends AbstractAnimal
{
    
    
    public Birds(String name,int dateDiscovered)
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

    @Override
	public String toString()
	{
		return "idnum" + idnum +" name = " + name + "\n" + "discovered = " + dateDiscovered;
	}

    

}