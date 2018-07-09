package ExamPreparationAvatar;
import ExamPreparationAvatar.benders.Benders;
import ExamPreparationAvatar.monuments.Monuments;

import java.util.ArrayList;
import java.util.List;

public class Nations {
    private List<Benders> benders;
    private List<Monuments> monuments;

    public Nations() {
        this.benders = new ArrayList<>();
        this.monuments = new ArrayList<>();
    }

    public List<Benders> getBenders() {
        return this.benders;
    }

    public List<Monuments> getMonuments() {
        return this.monuments;
    }

}
