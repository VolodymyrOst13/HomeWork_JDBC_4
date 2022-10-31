package task7;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnimalHelper aH = new AnimalHelper();

        AnimalA animalA = new AnimalA();
        animalA.setName("Test_Name_1");
        animalA.setAge(5);
        animalA.setTail(true);
        aH.add(animalA);

        animalA = aH.getById(2);
        System.out.println("ID = " + animalA.getId() + " Имя = "+ animalA.getName());

        animalA.setAge(12);
        aH.add(animalA);

        List<AnimalA> animalList = aH.getAllAnimal();
        for (AnimalA animal : animalList ) {
            System.out.println(animal.getName() + " ");
        }

        aH.removeAnimal(animalA);
    }
}
