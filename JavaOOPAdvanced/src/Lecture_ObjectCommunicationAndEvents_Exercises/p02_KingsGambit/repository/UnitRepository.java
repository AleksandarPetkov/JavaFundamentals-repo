package Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.repository;

import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.interfaces.Attackable;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.models.KillableUnit;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.models.King;

import java.util.LinkedHashMap;
import java.util.Map;

public class UnitRepository {
    private King king;
    private Map<String, KillableUnit> units;

    public UnitRepository() {
        this.units = new LinkedHashMap<>();
    }

    public KillableUnit getUnit(String name) {
        return this.units.get(name);
    }

    public Attackable getKing() {
        return this.king;
    }

    public void addSubject(KillableUnit subject) {
        this.units.put(subject.getName(), subject);
    }

    public void setKing(King king) {
        this.king = king;
    }
}
