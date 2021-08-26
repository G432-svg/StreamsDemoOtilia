package be.intecbrussel.the_notebook.plant_entities;

import java.util.ArrayList;
import java.util.List;

public class Flower extends Plant {

    private Scent smell;

    public Flower(String name, Scent smell) {
        super(name);
        this.smell = smell;
    }

    public Flower(String name, double height, Scent smell) {
        super(name, height);
        this.smell = smell;
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower{" +
                " name='" + name + '\'' +
                ", height=" + height +
                ", smell=" + smell +
                "} " + super.toString();
    }


}
