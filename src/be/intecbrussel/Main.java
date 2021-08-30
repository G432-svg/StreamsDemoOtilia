package be.intecbrussel;

//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//        List<Carnivore> carnivoreList = Carnivore.getAllCarnivore();
//
//
//
//        List<Carnivore> carnivores = new ArrayList<>();
//
//        carnivores.add(new Carnivore("Wolf",67.2,100.02,40.2));
//        carnivores.add(new Carnivore("Linx",43.1,23.12,41.02));
//
//        return carnivores;
//
//
//        Set<Carnivore> carnivoreSet = new LinkedHashSet<>();
//        carnivoreSet.addAll(carnivoreList);
//
//
//
//        Queue<Carnivore> carnivoreQueue = new LinkedList<>();
//        carnivoreQueue.addAll(carnivoreList);
//
//        for(Carnivore carnivore : carnivoreQueue){
//            System.out.println(carnivoreQueue);
//        }
//
//        Set<Carnivore> carnivoreSet = new LinkedHashSet<>();
//        carnivoreSet.addAll(carnivoreSet);
//
//        carnivoreList.clear();
//        boolean b = carnivoreList.addAll(carnivoreSet);
//
//
//
//        List<Herbivore> herbivores = new ArrayList<Herbivore>();
//
//        herbivores.add(new Herbivore("Horse",500.23,200.3,150.1));
//        herbivores.add(new Herbivore("Deer",495.23,250.02,150.42));
//        herbivores.add(new Herbivore("Sheep",53.02,40.32,45.65));
//        herbivores.add(new Herbivore("Bison",560.54,120.56,176.23));
//
//        return herbivores;
//
//
//
//        List<Omnivore> omnivores = new ArrayList<>();
//
//        omnivores.add(new Omnivore("Bear",1000.51,200.12,86.56));
//        omnivores.add(new Omnivore("Fox", 50.12,42.74,32.02));
//        omnivores.add(new Omnivore("Dog",42.02,43.45,35.23));
//
//        return omnivores;
//
//
//
//        List<Bush> bushes = new ArrayList<>();
//
//        bushes.add(new Bush("Blueberries","Fruit",LeafType.ROUND));
//        bushes.add(new Bush("Raspberry","Fruit", LeafType.HAND));
//        bushes.add(new Bush("Bilbery","Fruit", LeafType.HEART));
//        bushes.add(new Bush("Blackberry","Fruit",LeafType.ROUND));
//
//
//        List<Flower> flowers = new ArrayList<>();
//        flowers.add(new Flower("Dandelion", Scent.PINEAPPLE));
//        flowers.add(new Flower("Marigold",Scent.EARTHY));
//        flowers.add(new Flower("Maculate",Scent.SWEET));
//        flowers.add(new Flower("Hawthorn",Scent.EARTHY));
//        flowers.add(new Flower("Chamomile",Scent.SWEET));
//        flowers.add(new Flower("Crocus",Scent.MUSKY));
//        flowers.add(new Flower("Margarete",Scent.SWEET));
//
//        return flowers;
//
//
//
//        List<Tree> trees = new ArrayList<>();
//
//        trees.add(new Tree("Spruce", LeafType.HAND));
//        trees.add(new Tree("Pin",LeafType.NEEDLE));
//        trees.add(new Tree("Cedric",LeafType.ROUND));
//        trees.add(new Tree("Cypress",LeafType.HEART));
//
//        return trees;
//
//        List<Weed> weeds = new ArrayList<>();
//
//        weeds.add(new Weed("Burdock",32.41));
//        weeds.add(new Weed("Nettle",32.01));
//        weeds.add(new Weed("Patience",17.56));
//        weeds.add(new Weed("Dock",30.41));
//        weeds.add(new Weed("Wild Garlic",29.52));
//
//        notebook.addAnimal(animal1);
//        notebook.addAnimal(animal2);
//        notebook.addAnimal(animal3);
//        notebook.addAnimal(animal4);
//        notebook.addAnimal(animal5);
//
//        notebook.addPlant(plant1);
//        notebook.addPlant(plant2);
//        notebook.addPlant(plant3);
//        notebook.addPlant(plant4);
//        notebook.addPlant(plant5);
//        notebook.addPlant(plant6);
//        notebook.addPlant(plant7);
//        notebook.addPlant(plant8);
//        notebook.addPlant(plant9);
//
////            return weeds;
//        System.out.println("\n###############");
//        System.out.println("Display all");
//        System.out.println("###############");
//        notebook.printNotebook();
//
//        System.out.println("\n###############");
//        System.out.println("Plants: Sort by name");
//        notebook.sortAnimalsByName();
//        System.out.println("Animals: Sort by name");
//        System.out.println("###############");
//        notebook.sortPlantsByName();
//
//        System.out.println(notebook.getAnimalCount());
//        System.out.println("\n###############");
//        System.out.println("Animals: Sort by name");
//        System.out.println("###############");
//        notebook.sortAnimalsByName();
//
//    }
//        Collection<String> plantsList = new ArrayList<String>();

//        // Displaying the list
//        System.out.println("The ArrayList is: " + plants);
//
//        try {
//            // Checking presence of null
//           plants.contains(null);
//        }
//        catch (Exception e) {
//            System.out.println("Exception: " + e);
//        }
//}
//ex implement Comparable
//public class TreeSetExample {
//
//    public static void main(String... barney) {
//        Set<SimpsonCharacter> simpsonsCharacters = new TreeSet<>();
//        simpsonsCharacters.add(new SimpsonCharacter("Moe"));
//        simpsonsCharacters.add(new SimpsonCharacter("Lenny"));
//        simpsonsCharacters.add(new SimpsonCharacter("Homer"));
//        simpsonsCharacters.add(new SimpsonCharacter("Barney"));
//
//        System.out.println(simpsonsCharacters);
//    }
//}
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

//        System.out.println(animals);

//        System.out.println("###############");
//
//        notebook.sortPlantsByName();
//
//
//        System.out.println(notebook.getAnimalCount());
//        System.out.println("\n###############");
//        System.out.println("Animals: Sort by name in notebook");
//        System.out.println("###############");
//        notebook.sortAnimalsByName();
//        System.out.println(animals);

