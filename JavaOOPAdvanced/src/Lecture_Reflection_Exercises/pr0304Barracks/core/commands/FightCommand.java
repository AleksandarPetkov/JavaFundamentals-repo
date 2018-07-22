package Lecture_Reflection_Exercises.pr0304Barracks.core.commands;

import Lecture_Reflection_Exercises.pr0304Barracks.contracts.Repository;
import Lecture_Reflection_Exercises.pr0304Barracks.contracts.UnitFactory;


public class FightCommand extends BaseCommand {

    public FightCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
