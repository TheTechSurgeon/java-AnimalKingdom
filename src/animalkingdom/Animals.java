package animalkingdom;


public abstract class Animals{
    private static int maxId = 0;
    private int id;
    int food = 0;
    int year;
    //we need an individual constructor for each scenario
    //one for both variables
    public Animals(int food, int year){
        maxId++;
        id = maxId;
        this.food = food;
        this.year = year;
    }
    //one if year is provided
    public Animals (int year){
        maxId++;
        id = maxId;
        this.food = 10;
        this.year = year;
    }
    //one if nothing is provided
    public Animals (){
        maxId++;
        id = maxId;
        this.food = 10;
        year = 2019;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();
    public abstract String getName();

    public int getYear(){
        return year;
    }
    public int getFoodLevel(){
        return food;
    }

    public void addFood (int food){
        this.food += food;
    }

    public void eatFood (){
        this.food--;
    }

}