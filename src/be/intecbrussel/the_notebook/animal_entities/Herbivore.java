package be.intecbrussel.the_notebook.animal_entities;

import be.intecbrussel.the_notebook.plant_entities.Plant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Herbivore extends Animal{

    private Set<Plant> plantDiet = new HashSet<>();


    public Herbivore(String name) {

        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Herbivore() {
        super();
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void printDiet(){

    }

    public void addPlantToDiet(Plant plant){

        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                "} " + super.toString();
    }
}
