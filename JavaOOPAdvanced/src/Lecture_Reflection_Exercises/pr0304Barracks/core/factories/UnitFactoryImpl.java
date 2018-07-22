package Lecture_Reflection_Exercises.pr0304Barracks.core.factories;

import Lecture_Reflection_Exercises.pr0304Barracks.contracts.Unit;
import Lecture_Reflection_Exercises.pr0304Barracks.contracts.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"Lecture_Reflection_Exercises.pr0304Barracks.models.units.";


	Unit unit = null;
	@Override
	public Unit createUnit(String unitType){
		try {
			Class<?> unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<?> declaredConstructor = unitClass.getDeclaredConstructor();
			unit = (Unit) declaredConstructor.newInstance();
		} catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException |
				InvocationTargetException e	) {
			e.printStackTrace();
		}
		return unit;
	}
}
