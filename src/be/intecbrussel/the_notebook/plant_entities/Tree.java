package be.intecbrussel.the_notebook.plant_entities;

import java.util.ArrayList;
import java.util.List;

public class Tree extends Plant {

    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, LeafType leafType) {
        super(name);
        this.leafType = leafType;
    }

    public Tree(String name, double height, LeafType leafType) {
        super(name, height);
        this.leafType = leafType;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", leafType=" + leafType +
                "} " + super.toString();
    }
}
