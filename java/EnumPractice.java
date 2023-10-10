public class EnumPractice {
    enum Planet{
        MERCURY(1),VENUS(2),EARTH(3),MARS(4),JUPITER(5),SATURN(6),URANUS(7),NEPTUNE(8);
        int number;
        Planet(int number){
            this.number = number;
        }
    }

    public static void main(String[] args) {
        Planet myPlanet = Planet.EARTH;
        habitable(myPlanet);
    }
    public static void habitable(Planet myPlanet){
        switch (myPlanet){
            case EARTH :
                System.out.println("this is habitable");
                break;
            default:
                System.out.println("this is not habitable");
                break;
        }
    }
}
