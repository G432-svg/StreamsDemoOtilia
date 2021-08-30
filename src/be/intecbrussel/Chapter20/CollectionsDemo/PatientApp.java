package be.intecbrussel.Chapter20.CollectionsDemo;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.*;

//public class PatientApp {
//    public static void main(String[] args) {
//
//       List<Patient> patientList = Patient.getAllPatients();
//
////       Set<Patient> patientSet = new LinkedHashSet<>();
////       patientSet.addAll(patientList);
//
////       patientList.clear();
////       patientList.addAll(patientSet);
//
//       patientList.sort(new AgeSorter().thenComparing(new TemperatureSorter().thenComparing(new InsuranceSorter())));
//
//
//
//       Queue<Patient> patientQueue = new LinkedList<>();
//       patientQueue.addAll(patientList);
//
//
//        for (Patient patient : patientQueue){
//            System.out.println(patient);
//        }
//
//       Queue<Patient> priorityQueue =
//       patientList.stream()
//                     .sorted(new TemperatureSorter().thenComparing(new AgeSorter().thenComparing(new InsuranceSorter())
//                     .collect(Collectors.toCollection(LinkedList::new))));
//
//
//       Queue<Patient> patientQueue = new LinkedList<>();
//       patientQueue.addAll(patientList);
//
//       List<Patient> categoryOne = new ArrayList<>();
//       List<Patient> categoryTwo = new ArrayList<>();
//       List<Patient> categoryThree = new ArrayList<>();
//       List<Patient> categoryFour = new ArrayList<>();
//       List<Patient> categoryFive = new ArrayList<>();
//
//       while (patientQueue.size()>0){
//            Patient currentPatient = patientQueue.poll();
//            if ((currentPatient.getTemperature()>=40||(currentPatient.getAge()>=65&&currentPatient.getTemperature()>=38))&& currentPatient.isUnKnownVirus()){
//                categoryOne.add(currentPatient);
//            }else if(currentPatient.getTemperature()>=38&&currentPatient.isUnKnownVirus()){
//                categoryTwo.add(currentPatient);
//            }else if(currentPatient.isUnKnownVirus()){
//                categoryThree.add(currentPatient);
//            }else if(currentPatient.getTemperature()>=38){
//                categoryFour.add(currentPatient);
//            }else {
//                categoryFive.add(currentPatient);
//            }
//       }
//        Map<Integer,List<Patient>> mapCollection = new HashMap<>();
//        mapCollection.put(1, categoryOne);
//        mapCollection.put(2, categoryTwo);
//        mapCollection.put(3, categoryThree);
//        mapCollection.put(4, categoryFour);
//        mapCollection.put(5, categoryFive);
//        for (Integer key : mapCollection.keySet()){
//            System.out.println("For Category: "+ key+ " we have followong patients:");
//            for (Patient patient: mapCollection.get(key)){
//                System.out.println(patient);
//            }
//            System.out.println("------");
//        }
//
//    }
//}