package Lecture_Reflection_Exercises.pr0304Barracks.core.commands;

import Lecture_Reflection_Exercises.pr0304Barracks.contracts.Executable;
import Lecture_Reflection_Exercises.pr0304Barracks.contracts.Repository;
import Lecture_Reflection_Exercises.pr0304Barracks.contracts.UnitFactory;
import Lecture_Reflection_Exercises.pr0304Barracks.data.UnitRepository;

public abstract class BaseCommand implements Executable{
    private String[] data;

    private Repository repository;

    private UnitFactory unitFactory;

    protected BaseCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected String[] getData() {
        return data;
    }

    protected Repository getUnitRepository() {
        return repository;
    }

    protected UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
