package Lecture_Inheritance.p04_MordorsCrueltyPlan;

import java.util.List;

public class Gandalf {
    private int gandalfPoints;
    private List<String> foods;

    public Gandalf(List<String> foods) {
        setGandalfPoints(foods);
    }

    public void setGandalfPoints(List<String> foods) {
        for (String food : foods) {
            switch (food.toLowerCase()) {
                case "cram":
                    this.gandalfPoints += 2;
                    break;
                case "lembas":
                    this.gandalfPoints += 3;
                    break;
                case "apple":
                    this.gandalfPoints += 1;
                    break;
                case "melon":
                    this.gandalfPoints += 1;
                    break;
                case "honeycake":
                    this.gandalfPoints += 5;
                    break;
                case "mushrooms":
                    this.gandalfPoints += -10;
                    break;
                default:
                    this.gandalfPoints += -1;
                    break;
            }
        }

    }

    public String GandalfMoods(int gandalfPoints) {
        if(this.gandalfPoints < -5){
            return ("Angry");
        }else if(this.gandalfPoints < 0){
            return ("Sad");
        }else if(this.gandalfPoints < 15){
            return ("Happy");
        }else{
            return ("JavaScript");
        }
    }

    public int getGandalfPoints(){
        return this.gandalfPoints;
    }
}
