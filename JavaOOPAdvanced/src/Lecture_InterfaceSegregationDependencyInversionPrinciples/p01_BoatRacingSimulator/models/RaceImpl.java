package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.models;

import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.Boat;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.Race;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.exeptions.DuplicateModelException;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.utility.Constants;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.utility.Validator;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class RaceImpl  implements Race{
    private int distance;

    private int windSpeed;

    private int oceanCurrentSpeed;

    private Boolean allowsMotorBoats;

    private Map<String, Boat> registeredBoats;

    public RaceImpl(int distance, int windSpeed, int oceanCurrentSpeed, Boolean allowsMotorBoats) {
        this.setDistance(distance);
        this.windSpeed = windSpeed;
        this.oceanCurrentSpeed = oceanCurrentSpeed;
        this.allowsMotorBoats = allowsMotorBoats;
        this.registeredBoats = new LinkedHashMap<>();
    }

    private void setDistance(int distance) {
        Validator.validatePropertyValue(distance, "Distance");
        this.distance = distance;
    }

    @Override
    public int getDistance() {
        return this.distance;
    }

    @Override
    public int getWindSpeed() {
        return this.windSpeed;
    }

    @Override
    public int getOceanCurrentSpeed() {
        return this.oceanCurrentSpeed;
    }

    @Override
    public Boolean getAllowsMotorboats() {
        return this.allowsMotorBoats;
    }

    @Override
    public void addParticipant(Boat boat) throws DuplicateModelException {
        if (this.registeredBoats.containsKey(boat.getModel())) {
            throw new DuplicateModelException(Constants.DUPLICATE_MODEL_MESSAGE);
        }
        this.registeredBoats.put(boat.getModel(), boat);
    }

    @Override
    public Collection<Boat> getParticipants() {
        return this.registeredBoats.values();
    }
}
