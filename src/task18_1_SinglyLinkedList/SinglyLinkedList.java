package task18_1_SinglyLinkedList;


public class SinglyLinkedList {
    // reference to head node of the Singly Linked List
    public Node head = null;

    //Method to add a node at of the list
    public void push(int value) {
        // Create a new node
        Node newNode = new Node(value);

        //Checks if the list is empty
        if (head == null) {
            //If list is empty, head will point to new node
            head = newNode;
        } else {
            newNode.prev = head;
            head = newNode;
        }

    }

    //Method to remove a node at of the list
    public void pop() {
        if (head == null) {
            // no elements!
        } else {
            int value = head.value;
            head = head.prev;
            System.out.println(value);
        }
    }

    // Method of displaying the list on the screen
    public void printme() {
        //"Node currentNode" will point to head
        Node currentNode = head;
        // Check if the list is empty
        if (head == null) {
            System.out.print("EMPTY");
        } else {
            currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.value);
                if (currentNode.prev != null) {
                    System.out.print(" --> ");
                }
                currentNode = currentNode.prev;
            }
        }
    }
}

/*

Односвязный стек
Давайте реализуем стек на основе односвязного стека. Значения стека будем хранить в обёртке, где помимо значения будет указатель на ниже в стеке элемент, в самом же стеке будем хранить указатель на самый верхний элемент:

Node:
  value - значение в обёртке
  prev - элемент, ниже в стеке

Stack:
  head - указатель на обёртку с элементом, который надо вынуть следующим
Давайте реализуем две основные для стека операции. Для push создадим обёртку для нового значения, на который теперь будет указывать голова стека, а на старую голову будет указывать указатель на предыдущий элемент в обёртке. Для pop вынем значение из обёртки, на которую указывает голова стека, после чего передвиним голову стека на ту обёртку, на которую указывал указатель на предыдущий элемент в голове стека.

Stack:
  ...

  push(value):
    if head пустая
      head = Node(value=value, prev=пусто)
    else
      node = Node(value=value, prev=head)
      head = node

  def pop(self):
    if head пустая
      return нет элементов!
    else
      value = head.value
      head = head.prev
      return value
Теперь давайте добавим метод вывода стека на экран:

Stack:
  ...

  printme():
    if head пустая
      напечатаем "EMPTY"
    else
      node = head
      while node не пустой
        напечатаем node.value
        if у node есть предыдущий
          напечатаем " -> "
        node = node.prev



 */