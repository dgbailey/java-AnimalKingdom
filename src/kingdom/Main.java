package kingdom;

import java.util.ArrayList;
import java.util.Comparator;



public class Main

{
    public static void printConditionalWithSort(ArrayList<AbstractAnimal> animals, CheckDetails condition)
    {
        ArrayList<AbstractAnimal> alphaSort = new ArrayList<AbstractAnimal>();
        for (AbstractAnimal a : animals)
        {
            

            if (condition.test(a))
            {
                alphaSort.add(a);
            }


        }
        alphaSort.sort((v1,v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(alphaSort.toString());
    }
    public static void printConditionally(ArrayList<AbstractAnimal> animals, CheckDetails condition)
    {   
        for (AbstractAnimal a : animals)
        {
            

            if (condition.test(a))
            {
                System.out.println(a.toString());
            }
        }
        
    }
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

        System.out.println();
        //.get date needs to be in the abstract class in order to be accessed for sorting
        System.out.println("Dates descending");
        animalList.sort((v1,v2) -> v2.getDate() - v1.getDate());
        System.out.println(animalList.toString());

        System.out.println();
        System.out.println("Alphabetical");
        animalList.sort((v1,v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(animalList.toString());

        System.out.println();
        System.out.println("Movement");
        animalList.sort((v1,v2) -> v1.move().compareToIgnoreCase(v2.move()));
        System.out.println(animalList.toString());


        System.out.println();
        System.out.println("with LUNGS");
        printConditionally(animalList, v -> v.breathe() == "lungs");

        System.out.println();
        System.out.println("with LUNGS AND 1758");
        printConditionally(animalList, v -> v.breathe() == "lungs" && v.getDate() == 1758);

        System.out.println();
        System.out.println("with LUNGS AND EGGS");
        printConditionally(animalList, v -> v.breathe() == "lungs" && v.reproduce() == "eggs");

        System.out.println();
        System.out.println("ALPHA NAMED IN 1758");
        printConditionalWithSort(animalList, v -> v.getDate() == 1758);

        System.out.println();
        System.out.println("ALPHA AND MAMMALS");
        printConditionalWithSort(animalList, v -> v instanceof Mammal);

    }
}
     
    
