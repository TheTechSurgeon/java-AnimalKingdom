package animalkingdom;


public class Fish extends Animals{
    public String name;

    public Fish(String name, int year) {
        super(year);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String breathe(){
        return "gills";
    }
    @Override
    public String move(){
        eatFood();
        return "swim";
    }
    @Override
    public String reproduce(){
        return "eggs";
    }
    @Override
    public String toString(){
        return "Fish{" +
                    "name='"+name + '\'' +
                    ", food=" + food +
                    ", year=" + year +
                    '}';
    }



    
}