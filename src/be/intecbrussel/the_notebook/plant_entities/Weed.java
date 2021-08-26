package be.intecbrussel.the_notebook.plant_entities;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

public class Weed extends Plant {

    private double area;

    public Weed(String name, double area) {
        super(name);
        this.area = area;
    }

    public Weed(String name, double height, double area) {
        super(name, height);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Weed{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", area=" + area +
                "} " + super.toString();
    }
}




