package agh.ics.oop;


//lab 2
public class World {
    public static void main(String[] args) {
        Vector2d position1 = new Vector2d(1,2);
        System.out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));

    }
}







//lab 1

/*
//post point 16

public class World {
    public static void main(String[] args) {
        System.out.println("Start");
        for (String arg : args) System.out.print(run(directionParse(arg)));
        System.out.println("Stop");

        Vector2d position1 = new Vector2d(1,2);
        System.out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));
    }

    public static String run(Direction val) {
        return switch (val) {
            case FORWARD -> "Zwierzak idzie do przodu\n";
            case BACKWARD -> "Zwierzak idzie do tylu\n";
            case LEFT -> "Zwierzak idzie w lewo\n";
            case RIGHT -> "Zwierzak idzie w prawo\n";
        };
    }

    public static Direction directionParse(String str) {
        return switch (str) {
            case "f" -> Direction.FORWARD;
            case "b" -> Direction.BACKWARD;
            case "l" -> Direction.LEFT;
            case "r" -> Direction.RIGHT;
            default -> null;
        };

    }

}


//pre point 16
public class World {
    public static void main(String[] args){
        System.out.println("system wystartowal");
        run2(args);
        System.out.println("system zakonczyl dzialanie");
    }

    static void run1(String[] directions){

        System.out.println("zwierzak idzie do przodu");

        for(int i = 0; i < directions.length; i++ ){
            if (i < directions.length -1){
                System.out.printf("%s,", directions[i]);
            }
            else
                System.out.println(directions[i]);
        }
    }
    static void run2(String[] directions) {

        System.out.println("Start");

        for (String direction : directions) {
            switch (direction) {
                case "f":
                    System.out.println("Zwierzak idzie do przodu");
                    break;
                case "b":
                    System.out.println("Zwierzak idzie do tyłu");
                    break;
                case "r":
                    System.out.println("Zwierzak skręca w prawo");
                    break;
                case "l":
                    System.out.println("Zwierzak skręca w lewo");
                    break;
            }
        }
        System.out.println("Stop");

    }

}
*/