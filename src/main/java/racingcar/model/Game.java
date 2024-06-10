package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Car> raceCars;
    private static int trial;
    private int trialNumber = 0;

    public Game(){
        Game.trial = 0;
        raceCars = new ArrayList<>();
    }

    public List<Car> getRaceCars(){
        return raceCars;
    }

    public void setRaceCars(String[] carsName){
        for (String s : carsName) {
            raceCars.add(new Car(s));
        }
    }
}
