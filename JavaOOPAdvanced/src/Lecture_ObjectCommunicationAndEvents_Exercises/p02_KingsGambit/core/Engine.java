package Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.core;


import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.interfaces.Attackable;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.io.Reader;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.io.Writer;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.models.Footman;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.models.KillableUnit;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.models.King;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.models.RoyalGuard;
import Lecture_ObjectCommunicationAndEvents_Exercises.p02_KingsGambit.repository.UnitRepository;

import java.io.IOException;
import java.util.Arrays;

public class Engine implements Runnable {
    private Reader reader;
    private Writer writer;
    private UnitRepository repository;

    public Engine(Reader reader, Writer writer, UnitRepository repository) {
        this.reader = reader;
        this.writer = writer;
        this.repository = repository;
    }

    @Override
    public void run() {
        String kingName = null;
        try {
            kingName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        King king = new King(kingName, this.writer);
        this.repository.setKing(king);

        try {
            Arrays.stream(this.reader.readLine().split("\\s+"))
                    .map(s -> new RoyalGuard(s, this.writer))
                    .forEach(r -> {
                        this.repository.addSubject(r);
                        king.attachObserver(r);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Arrays.stream(this.reader.readLine().split("\\s+"))
                    .map(s -> new Footman(s, this.writer))
                    .forEach(r -> {
                        this.repository.addSubject(r);
                        king.attachObserver(r);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            for (String line = this.reader.readLine(); !line.equals("End"); line = this.reader.readLine()) {
                String[] tokens = line.split("\\s+");
                String command = tokens[0];
                if (command.equals("Attack")) {
                    Attackable _king = this.repository.getKing();
                    _king.takeAttack();
                } else if (command.equals("Kill")) {
                    String unitName = tokens[1];
                    KillableUnit unit = this.repository.getUnit(unitName);
                    unit.kill();
                    king.detachObserver(unit);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
