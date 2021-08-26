package be.intecbrussel.the_notebook.service;
import be.intecbrussel.the_notebook.animal_entities.Animal;
import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.Plant;
import java.util.*;
import java.util.function.ToDoubleFunction;

public class ForestNotebook {

    private List<Carnivore> carnivores = new LinkedList<Carnivore>();
    private List<Omnivore> omnivores = new LinkedList<Omnivore>();
    private List<Herbivore> herbivores = new LinkedList<Herbivore>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();



    public ForestNotebook() {
        super();

    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plants.size();
    }


    public int getAnimalCount() {
        return animals.size();
    }

    public void addAnimal(Animal animal){
        if (!checkAnimal()) {
            animals.add(animal);
            this.animalCount++;
            if (animal instanceof Carnivore) {
                carnivores.add((Carnivore) animal);
            } else if (animal instanceof Herbivore) {
                herbivores.add((Herbivore) animal);
            } else if (animal instanceof Omnivore) {
                omnivores.add((Omnivore) animal);
            } else {
                System.out.println("This animal exist in the list.");
            }
        }
    }

    private boolean checkAnimal() {

        return false;

    }
    public void addPlant(Plant plant){
        plants.add(plant);

    }
    public void printNotebook(){
        for (Animal animal : animals){
            System.out.println(animal);
        }
        for (Plant plant : plants){
            System.out.println("Plant: " + plant);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForestNotebook)) return false;

        ForestNotebook that = (ForestNotebook) o;

        if (animals != null ? !animals.equals(that.animals) : that.animals != null) return false;
        if (plants != null ? !plants.equals(that.plants) : that.plants != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = animals != null ? animals.hashCode() : 0;
        result = 31 * result + (plants != null ? plants.hashCode() : 0);
        return result;
    }

    public void sortAnimalsByName(){
        animals.sort(new Comparator<Animal>() {

            @Override
            public int compare(Animal o1, Animal o2) {
                System.out.println(o1.getName().compareTo(o2.getName()));
                return o1.getName().compareTo(o2.getName());
            }
        });


    }
    public void sortPlantsByName(){
        plants.sort(new Comparator<Plant>() {

            @Override
            public int compare(Plant o1, Plant o2) {
                System.out.println(o1.getName().compareTo(o2.getName()));
                return o1.getName().compareTo(o2.getName());

            }
        });

    }
//    public void sortAnimalsByHeight(){
//        animals.sort(new Comparator<Animal>() {
//
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                System.out.println(o1.getHeight().compareTo(o2.getHeight()));
//                return o1.getHeight().compareTo(o2.getHeight());
//            }
//
//
//        });
//
//
//    }
//    public void sortPlantsByHeight(){
//        plants.sort(new Comparator<Plant>() {
//
//            @Override
//            public int compare(Plant o1, Plant o2) {
//                System.out.println(o1.getHeight().compareTo(o2.getHeight()));
//                return o1.getHeight().compareTo(o2.getHeight());
//
//            }
//
//
//        });
//
//}


}
