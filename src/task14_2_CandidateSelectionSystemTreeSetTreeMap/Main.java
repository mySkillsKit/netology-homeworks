package task14_2_CandidateSelectionSystemTreeSetTreeMap;

import java.util.Comparator;
import java.util.TreeSet;

class Main {

  public static void main(String[] args) {

 System.out.println("Домашнее задание к занятию «Коллекции TreeMap и TreeSet»\n" +
                "Задача 2. Система подбора кандидатов\n"); 
                

TreeSet<Candidate> candidateList = new TreeSet<>(Comparator.comparing(Candidate::getRelevance).
        thenComparing(Candidate::getRating, Comparator.reverseOrder()));

candidateList.add(new Candidate("Иванов Иван Иванович", "муж", "25", 4, 5));
candidateList.add(new Candidate("Петров Иван Александрович", "муж", "28", 4, 3));
candidateList.add(new Candidate("Максимов Иван Александрович", "муж", "24", 3, 5));
candidateList.add(new Candidate("Иванов Петр Иванович", "муж", "19", 0, 3));
candidateList.add(new Candidate("Краснов Иван Иванович", "муж", "45", 2, 2));
candidateList.add(new Candidate("Иванова Ольга Леонидовна", "жен", "38", 5, 5));
candidateList.add(new Candidate("Сидоров Иван Абрамович", "муж", "35", 3, 2));
candidateList.add(new Candidate("Лукин Иван Васильевич", "муж", "21", 4, 3));
candidateList.add(new Candidate("Созин Александр Иванович", "муж", "28", 1, 2));
candidateList.add(new Candidate("Василенко Стас Викторович", "муж", "49", 5, 3));

for (Candidate c : candidateList) {
  System.out.println(c.getRating() + " " + c.getRelevance());
}


                


      
                
                
                
 }

}