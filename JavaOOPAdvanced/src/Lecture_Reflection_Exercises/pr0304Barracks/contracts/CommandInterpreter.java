package Lecture_Reflection_Exercises.pr0304Barracks.contracts;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
