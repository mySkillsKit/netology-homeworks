package Lesson16_QueueAndDeque;

public class Message implements Comparable<Message> {
  
  private String title;
  private String text;
  private int priority;

  public Message(String title, String text, int priority) {
    this.title = title;
    this.text = text;
    this.priority = priority;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public int compareTo(Message altMessage) {
    //  < 0 -> this < altMessage
    //  == 0 -> this == altMessage
    //  > 0 -> this > altMessage

    int diff = priority - altMessage.priority;
    return diff != 0 ? diff : title.compareTo(altMessage.title);
  }

  @Override
  public String toString() {
    return String.format("%s\n%s\n(%d)\n", title, text, priority);
  }
}