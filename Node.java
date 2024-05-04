public class Node<T> {
  private T data;
  private Node<T> next;

  public Node(T data) {
    this.data = data;
    this.next = null;
  }

  // Getter and setter for data
  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  // Getter and setter for next
  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }
}
