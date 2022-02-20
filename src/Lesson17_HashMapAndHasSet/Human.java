package Lesson17_HashMapAndHasSet;

import java.util.Objects;

public class Human {

  private final String firstname;
  private final String lastname;

  public Human(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  @Override
  public String toString() {
    return firstname + " " + lastname;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || !obj.getClass().equals(Human.class)) return false;
    Human altHuman = (Human) obj;

    return this.firstname.equals(altHuman.firstname) 
        && this.lastname.equals(altHuman.lastname);
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname);
  }

}