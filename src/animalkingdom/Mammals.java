package animalkingdom;

public class Mammals extends Animals{
    public String name;

    public Mammals(String name, int year) {
        super(year);
        this.name = name;
    }


    public String getName(){
        return this.name;
    }
    @Override
    public String breathe(){
        return "lungs";
    } 
    @Override
    public String reproduce(){
        return "live births";
    } 
    @Override
    public String move(){
        eatFood();
        return "walk";
    }


    @Override
    public String toString(){
        return "Mammal{" +
                    "name='"+name + '\'' +
                    ", food=" + food +
                    ", year=" + year +
                    '}';
    }
}