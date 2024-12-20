package com.example.project;
import java.util.Random;

public class Day4 {
    /*
     * Goal: Simulate a race for Santa’s reindeer.
     *  Each deer will have a rest, run duration, and speed. 
     * Their distance travelled will be calculated each second by these values. 

Requirements:
Each reindeer will be created from a Reindeer class.
 The characteristics of this class are specified in the repository. 
 The race will be determined by a set time and you will simulate a second of running until the time is reached. 
 Return the name of the reindeer who went the farthest distance. 
Example:
In: 10 seconds
Out: “Prancer”

     */
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int distanceTraveled;
        private int currentSec = 0;
        private boolean isRunning = false;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.distanceTraveled = distanceTraveled;
            

        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        
        public String getName() {
            return name;
        }

        public void simulateSecond() {
            currentSec++;
            if (currentSec <= runDuration) {
                distanceTraveled += speed;
            }
    }
}

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        for (int s = 0; s < time; s++) {
            for (int r = 0; r < reindeers.length; r++) {
                reindeers[r].simulateSecond();
            }
        }
        Reindeer winner = reindeers[0];
        for (int r = 0; r < reindeers.length; r++) {
            if (reindeers[r].getDistanceTraveled() > winner.getDistanceTraveled()) {
                winner = reindeers[r];
            }
        }
        return winner.getName();
    }
    

    
    public static void main(String[] args) { // for testing purposed
        Reindeer[] reindeers = {new Reindeer("Dasher", 100, 5, 2),
    new Reindeer("Prancer", 110, 6, 1),
    new Reindeer("Dancer", 120, 4, 3)};

    System.out.println(simulateRace(10, reindeers));
    System.out.println(simulateRace(100, reindeers));
    }

 

}





