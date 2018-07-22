package Lecture_Reflection_Exercises.pr0304Barracks.core;

import Lecture_Reflection_Exercises.pr0304Barracks.contracts.Executable;
import Lecture_Reflection_Exercises.pr0304Barracks.contracts.Repository;
import Lecture_Reflection_Exercises.pr0304Barracks.contracts.UnitFactory;
import Lecture_Reflection_Exercises.pr0304Barracks.data.UnitRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {
	private static final String COMMAND_PATH = "Lecture_Reflection_Exercises.pr0304Barracks.core.commands.";
	private static final String COMMAND_SUFIX_NAME = "Command";

	private Repository repository;
	private UnitFactory unitFactory;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				String result = interpredCommand(data, commandName);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException | InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	// TODO: refactor for problem 4
	private String interpredCommand(String[] data, String commandName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

		String ClassCommandName = String.valueOf(commandName.charAt(0)).toUpperCase() + commandName.substring(1);
		Class<?> commandClass = Class.forName(COMMAND_PATH + ClassCommandName + COMMAND_SUFIX_NAME);

		Constructor<?> declareContructor = commandClass.getDeclaredConstructor(String[].class, Repository.class,
				UnitFactory.class);

		Executable command = (Executable) declareContructor.newInstance(data, this.repository, this.unitFactory);
		return command.execute();

	}
}
