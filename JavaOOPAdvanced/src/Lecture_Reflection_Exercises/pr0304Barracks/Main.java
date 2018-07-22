package Lecture_Reflection_Exercises.pr0304Barracks;

import Lecture_Reflection_Exercises.pr0304Barracks.contracts.Repository;
import Lecture_Reflection_Exercises.pr0304Barracks.contracts.UnitFactory;
import Lecture_Reflection_Exercises.pr0304Barracks.core.Engine;
import Lecture_Reflection_Exercises.pr0304Barracks.core.factories.UnitFactoryImpl;
import Lecture_Reflection_Exercises.pr0304Barracks.data.UnitRepository;


public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
