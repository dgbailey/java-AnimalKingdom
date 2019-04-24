package kingdom;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Mammal panda = new Mammal("panda", 1869);
        Mammal zebra = new Mammal("zebra", 1778);
        Mammal koala = new Mammal("koala", 1816);
        Mammal sloth = new Mammal("sloth", 1804);
        Mammal armadillo = new Mammal("armadillo", 1758);
        Mammal racoon = new Mammal("racoon", 1758);
        Mammal bigfoot = new Mammal("bigfoot", 2021);

        Birds pigeon = new Birds("pigeon",1837);
        Birds peacock = new Birds("peakcock",1821);
        Birds toucan = new Birds("toucan",1758);
        Birds parrot = new Birds("parrot",1824);
        Birds swan = new Birds("swan",1758);

        Fish salmon = new Fish("salmon",1758);
        Fish catfish = new Fish("catfish",1817);
        Fish perch = new Fish("perch",1758);

        ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(racoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);
       
        System.out.println(animalList.toString());

    }
}
     
    
