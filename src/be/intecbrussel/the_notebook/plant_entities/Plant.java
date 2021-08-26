package be.intecbrussel.the_notebook.plant_entities;

public abstract class Plant {
    protected String name;
    protected double height;


    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;

        Plant plant = (Plant) o;

        if (Double.compare(plant.getHeight(), getHeight()) != 0) return false;
        if (getName() != null ? !getName().equals(plant.getName()) : plant.getName() != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}