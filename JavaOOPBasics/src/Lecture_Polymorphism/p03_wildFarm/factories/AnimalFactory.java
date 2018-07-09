package Lecture_Polymorphism.p03_wildFarm.factories;
import Lecture_Polymorphism.p03_wildFarm.abstractions.Animal;
import Lecture_Polymorphism.p03_wildFarm.implementators.Cat;
import Lecture_Polymorphism.p03_wildFarm.implementators.Mouse;
import Lecture_Polymorphism.p03_wildFarm.implementators.Tiger;
import Lecture_Polymorphism.p03_wildFarm.implementators.Zebra;

public class AnimalFactory {

    public Animal getAnimalType(String[] animalInfo){
        String type = animalInfo[0];
        String name = animalInfo[1];
        double weight = Double.parseDouble(animalInfo[2]);
        String livingRegion = animalInfo[3];
        switch (type){
            case "Tiger":
                return new Tiger(name, type, weight, 0, livingRegion);
            case "Mouse":
                return new Mouse(name, type, weight,0, livingRegion);
            case "Zebra":
                return new Zebra(name, type, weight, 0, livingRegion);
            case "Cat":
                String breed = animalInfo[4];
                return new Cat(name, type, weight, 0, livingRegion, breed);
            default:return null;
        }
    }
}
