package Lecture_ObjectCommunicationAndEvents_Lab.commands;

import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Command;
import Lecture_ObjectCommunicationAndEvents_Lab.interfaces.Executor;

public class CommandExecutor  implements Executor{

    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
