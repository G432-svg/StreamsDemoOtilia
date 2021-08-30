package be.intecbrussel.Chapter20.CollectionsDemo;
import java.util.List;
import java.util.*;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static be.intecbrussel.Chapter20.CollectionsDemo.Patient.*;

public class HospitalApp {
    public static void main(String[] args) {

        List<Patient> patientList = Patient.getAllPatients();

        for(Patient patient : patientList){
            System.out.println(patient);
        }
        List<Patient> allPatients = new ArrayList<Patient>();

        allPatients.add(new Patient("030201321", "Lucky Luke", 69, 38, true, false));
        allPatients.add(new Patient("030201322", "Stromae Papaoutai", 35, 40, false, true));
        allPatients.add(new Patient("030801321", "Gringoire Lune", 80, 36, true, true));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030244321", "Sanic the HedgeHog", 16, 37, true, true));
        allPatients.add(new Patient("110201321", "Donald Putin", 90, 39, false, true));
        allPatients.add(new Patient("110201321", "Donald Putin", 90, 39, false, true));
        allPatients.add(new Patient("088201321", "Bilbo Baggins", 23, 39, true, false));
        allPatients.add(new Patient("035501321", "Lucio Correa Dos Santos", 40, 38, false, true));
        allPatients.add(new Patient("030206621", "Doctor Who", 33, 35, true, true));
        allPatients.add(new Patient("030245321", "Luke Cage", 46, 41, true, false));
        allPatients.add(new Patient("030298321", "Naruto Uzumaki", 13, 38, false, false));
        allPatients.add(new Patient("125201321", "Billy Batson", 15, 40, true, false));
        allPatients.add(new Patient("987201321", "Joseph Joestar", 75, 36, true, false));
        allPatients.add(new Patient("645201321", "Jon Snow", 33, 35, false, false));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("582201321", "Alexander Hamilton", 65, 38, false, false));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030201231", "Zelda of Hyrule", 17, 38, false, true));
        allPatients.add(new Patient("830208651", "Mother Theresa", 98, 39, true, false));
        allPatients.add(new Patient("030209741", "Willy Wonka", 70, 40, true, true));
        allPatients.add(new Patient("030205411", "Scrooge McDuck", 73, 38, true, false));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("030209861", "Sonia Magnlia", 35, 39, false, false));
        allPatients.add(new Patient("030278921", "Peter Parker", 21, 40, true, false));
        allPatients.add(new Patient("030269821", "Bruce Wayne", 46, 35, false, true));
        allPatients.add(new Patient("030215421", "Seto Kaiba", 22, 38, false, true));
        allPatients.add(new Patient("030296321", "Mario Mario", 50, 37, false, false));
        allPatients.add(new Patient("035051321", "Harry Potter", 18, 39, true, true));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("036781321", "Mary Poppins", 38, 38, true, false));
        allPatients.add(new Patient("033691321", "Alexander the Great", 51, 37, false, true));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030201000", "Huey Freeman", 12, 40, false, false));
        allPatients.add(new Patient("000201321", "Miku Hatsune", 16, 36, true, true));
        allPatients.add(new Patient("111201321", "Drake Josh", 33, 38, true, false));
        allPatients.add(new Patient("222201321", "April O'Neil", 29, 37, false, false));


        Set<Patient> patientSet = new LinkedHashSet<Patient>();
        //Soorter de pacienten van AgeSoorter;
//        NavigableSet<Patient> patientSet = new TreeSet<>();
        //Soorter de pacienten van TemperatuurSorter
//    SortedMap<Patient> patientSet = new TreeMap<>();
//        patientSortedMap.addAll(allPatients);

        patientSet.addAll(allPatients);
        patientList.addAll(patientSet);

        patientList.sort(new AgeSorter().thenComparing(new TemperatureSorter()).thenComparing(new InsuranceSorter()));

        for (Patient patient : patientSet) {
            System.out.println(patient);
        }
        Queue<Patient> priorityQueue =
             patientList.stream()
                     .sorted(new TemperatureSorter().thenComparing(new AgeSorter().thenComparing(new InsuranceSorter())))
                     .collect(Collectors.toCollection(LinkedList::new));

        Queue<Patient> patientQueue = new LinkedList<>();
        patientQueue.addAll(patientList);
        List<Patient> categoryOne = new ArrayList<>();
        List<Patient> categoryTwo = new ArrayList<>();
        List<Patient> categoryThree = new ArrayList<>();
        List<Patient> categoryFour = new ArrayList<>();
        List<Patient> categoryFive = new ArrayList<>();
        while (patientQueue.size()>0){
            Patient currentPatient = patientQueue.poll();
            if ((currentPatient.getTemperature()>=40||(currentPatient.getAge()>=65&&currentPatient.getTemperature()>=38))&& currentPatient.isUnKnownVirus()){
                categoryOne.add(currentPatient);
            }else if(currentPatient.getTemperature()>=38&&currentPatient.isUnKnownVirus()){
                categoryTwo.add(currentPatient);
            }else if(currentPatient.isUnKnownVirus()){
                categoryThree.add(currentPatient);
            }else if(currentPatient.getTemperature()>=38){
                categoryFour.add(currentPatient);
            }else {
                categoryFive.add(currentPatient);
            }
        }
        Map<Integer,List<Patient>> mapCollection = new HashMap<>();
        mapCollection.put(1, categoryOne);
        mapCollection.put(2, categoryTwo);
        mapCollection.put(3, categoryThree);
        mapCollection.put(4, categoryFour);
        mapCollection.put(5, categoryFive);
        for (Integer key : mapCollection.keySet()){
            System.out.println("For Category: "+ key+ " we have followong patients:");
            for (Patient patient: mapCollection.get(key)){
                System.out.println(patient);
            }
            System.out.println("------");
        }

    }

}
