package Lesson16_QueueAndDeque;

import java.util.*;

class Main {

  private static Random rand = new Random();
  
  public static void main(String[] args) {
    Queue<Message> messages = new PriorityQueue<>(new MessageComparatorByTitle());

    // Deque<Message> messages = new LinkedList<>();
    

    fillMessages(messages);

    while (!messages.isEmpty()) {
      System.out.println(messages.poll());
    }

    // while (!messages.isEmpty()) {
    //   Message targetMessage = messages.poll();
    //   if (!handle(targetMessage)) messages.offerFirst(targetMessage);
    // }
  }

  private static void fillMessages(Queue<Message> messages) {
    messages.offer(
      new Message("Письмо", "Бла-бла-бла и что-то по работе", 4));
    messages.offer(
      new Message("Неважное письмо", "Бла-бла-бла", 5));
    messages.offer(
      new Message("Важное письмо", "Надо бы сделать и побыстрее", 1));
    messages.offer(
      new Message("Очень важное письмо", "Срочно вчера уже должно быть готово", 0));
    messages.offer(
      new Message("Не очень важное письмо", "Что-то по работе", 2));
  }

  private static boolean handle(Message message) {

    if (rand.nextInt() % 3 == 0) {
      System.out.println("Не смогли разобрать сообщение с темой " + message.getTitle());
      return false;
    } else {
      System.out.println(message);
      return true;
    }
  }
}