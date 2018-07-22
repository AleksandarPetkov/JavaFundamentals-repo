package Lecture_Reflection_Exercises.pr0304Barracks.core.commands;

import Lecture_Reflection_Exercises.pr0304Barracks.contracts.Repository;
import Lecture_Reflection_Exercises.pr0304Barracks.contracts.Unit;
import Lecture_Reflection_Exercises.pr0304Barracks.contracts.UnitFactory;


public class AddComand extends BaseCommand{

    public AddComand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = super.getData()[1];
        Unit unitToAdd = super.getUnitFactory().createUnit(unitType);

        super.getUnitRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}
