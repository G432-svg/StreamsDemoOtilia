package be.intecbrussel.the_notebook.app;
import be.intecbrussel.the_notebook.animal_entities.Animal;
import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

import java.sql.SQLOutput;
import java.util.*;

public class NatureApp {
    public static void main(String[] args) {

        ForestNotebook notebook= new ForestNotebook();

        System.out.println("Types of animals and plants in temperate zones");

        Plant plant0 =  new Weed("Wild Garlic", 0.35D, 30);
        Plant plant1 = new Flower("Maculate", 0.35D, Scent.SWEET);
        Plant plant2 = new Flower("Dandelion", 0.28D, Scent.EARTHY);
        Plant plant3 = new Tree("Spruce", 25.3D, LeafType.NEEDLE);
        Plant plant4 = new Weed("Burdock", 1.5D, 1.2D);
        Plant plant5 = new Bush("Raspberry", 1.56D,"Fruit", LeafType.HAND);
        Plant plant6 = new Flower("Margarete", 0.34D,  Scent.SOUR);
        Plant plant7 = new Tree("Pin", 30.2D,  LeafType.NEEDLE);
        Plant plant8 = new Weed("Dock", 1.5,  30);
        Plant plant9 = new Weed("Wild Garlic", 0.35, 30);

        ArrayList<Plant> plants = new ArrayList<>();

        plants.add(plant0);
        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        plants.add(plant4);
        plants.add(plant5);
        plants.add(plant6);
        plants.add(plant7);
        plants.add(plant8);
        plants.add(plant9);

        System.out.println(plants.get(0));
        System.out.println(plants.get(1));
        System.out.println(plants.get(2));
        System.out.println(plants.get(3));
        System.out.println(plants.get(4));
        System.out.println(plants.get(5));
        System.out.println(plants.get(6));
        System.out.println(plants.get(7));
        System.out.println(plants.get(8));

        /*
         * for (Plant plant6 : plants) { System.out.println(plant6); }
         */



        Animal animal0 = new Omnivore("Fox", 50.12, 42.74, 32.02);
        Animal animal1 = new Carnivore("Wolf", 67.2, 1.02, 0.40);
        Animal animal2 = new Herbivore("Deer", 495.23, 2.02, 1.5);
        Animal animal3 = new Omnivore("Bear", 500.51, 2.12, 2.2);
        Animal animal4 = new Carnivore("Lion", 185, 1.1, 1);
        Animal animal5 = new Carnivore("Leopard", 128, 1.2, 2);
        Animal animal6 = new Carnivore("Linx",43.1,23.12,41.02);
        Animal animal7 = new Herbivore("Deer",495.23,250.02,150.42);
        Animal animal8 = new Herbivore("Sheep",53.02,40.32,45.65);
        Animal animal9 = new Herbivore("Bison",560.54,120.56,176.23);


        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(animal0);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
        animals.add(animal6);
        animals.add(animal7);
        animals.add(animal8);
        animals.add(animal9);



        // Displaying the list
        System.out.println("The ArrayList is: " +  animals);

        try {
            // Checking presence of null
            animals.contains(null);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println(animals.get(0));
        System.out.println(animals.get(1));
        System.out.println(animals.get(2));
        System.out.println(animals.get(3));
        System.out.println(animals.get(4));
        System.out.println(animals.get(5));
        System.out.println(animals.get(6));
        System.out.println(animals.get(7));
        System.out.println(animals.get(8));
        System.out.println(animals.get(9));

        /*
         * for (Animal animal5 : animals) { System.out.println(animal5); }
         */

        notebook.addAnimal(animal1);
        notebook.addAnimal(animal2);
        notebook.addAnimal(animal3);
        notebook.addAnimal(animal4);
        notebook.addAnimal(animal5);
        notebook.addAnimal(animal6);
        notebook.addAnimal(animal7);
        notebook.addAnimal(animal8);
        notebook.addAnimal(animal9);


        notebook.addPlant(plant1);
        notebook.addPlant(plant2);
        notebook.addPlant(plant3);
        notebook.addPlant(plant4);
        notebook.addPlant(plant5);


        System.out.println("\n###############");
        System.out.println("Display 9 animals and 5 plants: ");
        System.out.println("###############");
        notebook.printNotebook();

        System.out.println("\n###############");
        System.out.println("Plants: Sort by name");
        System.out.println(plants);

        notebook.sortAnimalsByName();
        System.out.println("Animals: Sort by name");

//        Set<Animal> animalSet = new TreeSet<>();
//        animalSet.add(new Omnivore("Fox"));
//        animalSet.add(new Carnivore("Wolf"));
//        animalSet.add(new Herbivore("Deer"));
//        animalSet.add(new Carnivore("Lion"));
//        // Displaying the list
//        System.out.println("The ArrayList is: " +  animalSet);

//        try {
//            // Checking presence of null
//            animalSet.contains(null);
//        }
//        catch (Exception e) {
//            System.out.println("Exception: " + e);
//        }
//        System.out.println(animalSet);

        System.out.println(animals);

        System.out.println("###############");

        notebook.sortPlantsByName();


        System.out.println(notebook.getAnimalCount());
        System.out.println("\n###############");
        System.out.println("Animals: Sort by name in notebook");
        System.out.println("###############");
        notebook.sortAnimalsByName();
        System.out.println(animals);


    }
}
