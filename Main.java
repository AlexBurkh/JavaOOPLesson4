import Generators.Generator;
import Generators.HumanGenerator;
import engine.GyneologicalExam;
import models.Human;
import models.KinshipManager;
import models.KinshipType;
import models.Sex;
import view.ConsoleUserInterface;
import view.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Human> humans = new ArrayList<>();
    private static Generator<Human> generator;
    private static KinshipManager kinshipManager;
    private static UserInterface ui;
    private static GyneologicalExam exam;

    public static void main(String[] args) {
        int nHumans = 10;
        Init(nHumans);


        humans.add(new Human("Alex", "Burg", 26, Sex.male));
        humans.add(new Human("Ivan", "Burg", 51, Sex.male));
        humans.add(new Human("Oleg", "Mongol", 37, Sex.male));
        humans.add(new Human("Mary", "Alf", 26, Sex.female));
        humans.add(new Human("Valery", "Alf", 27, Sex.female));
        humans.add(new Human("Kristin", "Milio", 52, Sex.female));
        humans.add(new Human("Britney", "Amber", 39, Sex.female));

        kinshipManager.setHumans(humans);

        kinshipManager.addKinship(humans.get(0), humans.get(4), KinshipType.husband);
        kinshipManager.addKinship(humans.get(1), humans.get(0), KinshipType.father);
        kinshipManager.addKinship(humans.get(0), humans.get(3), KinshipType.brother);
        ui.print(kinshipManager);
        ui.print(exam.exam(humans.get(1)));
    }

    private static void Init(int nHumans) {
        generator = new HumanGenerator();
        //generateHumans(nHumans);
        kinshipManager = new KinshipManager();
        exam = new GyneologicalExam(kinshipManager);
        ui = new ConsoleUserInterface();
    }

    private static void generateHumans(int number) {
        for (int i = 0; i < number; i++) {
            humans.add(generator.generate());
        }
    }
}
