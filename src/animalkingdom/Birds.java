package animalkingdom;

    public class Birds extends Animals{
        public String name;

        public Birds(String name, int year) {
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
            return "eggs";
        }
        @Override
        public String move(){
            eatFood();
            return "flys";
        }
        @Override
        public String toString(){
            return "Bird{" +
                    "name='"+name + '\'' +
                    ", food=" + food +
                    ", year=" + year +
                    '}';

            }
        }
         
        
    