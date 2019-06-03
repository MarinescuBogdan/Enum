package main.java.enums;

public class Main {

    public static void main(String[] args) {

        TrafficLight s = TrafficLight.GREEN;
        runTrafficLight(s);

    }


    static void runTrafficLight(TrafficLight trafficLight) {
        switch (trafficLight) {
            case RED:
                System.out.println("Stop");
                break;

            case YELLOW:
                System.out.println("Go, but be carrefuly");
                break;

            case GREEN:
                System.out.println("Go, Go");
                break;

            default:
                System.out.println("Default");
                break;
        }
    }

}
