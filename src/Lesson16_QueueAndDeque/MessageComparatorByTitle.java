package Lesson16_QueueAndDeque;

import java.util.Comparator;

public class MessageComparatorByTitle implements Comparator<Message> {

  @Override
  public int compare(Message m1, Message m2) {

    return m1.getTitle().compareTo(m2.getTitle());
  }

}