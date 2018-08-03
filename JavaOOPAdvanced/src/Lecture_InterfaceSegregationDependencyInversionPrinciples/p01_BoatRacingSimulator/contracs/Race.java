package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs;

import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.exeptions.DuplicateModelException;

import java.util.Collection;

public interface Race {
    int getDistance();

    int getWindSpeed();

    int getOceanCurrentSpeed();

    Boolean getAllowsMotorboats();

    void addParticipant(Boat boat) throws DuplicateModelException;

    Collection<Boat> getParticipants();
}
