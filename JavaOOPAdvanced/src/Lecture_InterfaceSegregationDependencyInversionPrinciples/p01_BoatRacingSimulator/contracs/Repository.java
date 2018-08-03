package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs;

import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.exeptions.DuplicateModelException;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.exeptions.NonExistentModelException;

public interface Repository<T extends Modelable> {
    void add(T item) throws DuplicateModelException;

    T getItem(String model) throws NonExistentModelException;
}
