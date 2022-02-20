package task14_2_CandidateSelectionSystemTreeSetTreeMap;

public class Candidate {


  private String fio;
  private String gender;
  private String age;
  private int relevance;
  private int rating;

  
public Candidate(String fio, String gender, String age, int relevance, int rating) {
  this.fio = fio;
  this.gender = gender;
  this.age = age;
  this.relevance = relevance;
  this.rating = rating;

}

public int getRelevance() {
  return relevance;
}

public int getRating() {
 return rating;
}

  public String getFio() {
    return fio;
  }

  public String getGender() {
    return gender;
  }

  public String getAge() {
    return age;
  }

  @Override
public String toString() {
return fio + gender + age + relevance + rating;

}


}

/* 
"Фамилия Имя Отчество" (через пробел) — String — уникальное значение;
Пол — String;
Возраст — String;
Релевантность резюме (соответствие резюме предлагаемой вакансии — relevance) — Integer (0-5, где 0 — низкое значение соответствия, а 5 — очень высокое значение соответствия);
Оценка на собеседовании (rating) — Integer (0-5, где 0 — низкое значение оценки, а 5 — очень высокое значение оценки)

*/