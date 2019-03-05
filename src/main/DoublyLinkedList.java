package main;
class DoublyLinkedList {
    /* WRONG CODE:
      private static class Node
      {
          private int data;
          private Node pre;
          private Node next;

          public Node(int data, Node pre, Node next) {
              this.data = data;
              this.pre = pre;
              this.next = next;
          }

          public Node(int data, Object o) {
              this.data = data;
              this.pre=null;
              this.next=null;
          }

      }
      private int size=0;
      private Node head=null;
      private Node tail=null;

      public static void main(String[] args) {
          DoublyLinkedList linkedList = new DoublyLinkedList();
          System.out.println(linkedList);
          for (int i = 0; i < 5; i++) {
              linkedList.insert(i+1);
          }
          System.out.println(linkedList);
      }

      @Override
      public String toString() {
          StringBuilder response =new StringBuilder();
          response.append("[");
          Node temp=this.head;
          while(temp!=null)
          {
              response.append(temp.data);
              if(temp.next!=null)
              {
                  response.append("  <=> ");
              }
              temp=temp.next;
          }
          response.append("]");
          return response.toString();
      }
      private void insertHead(int data){
      Node newNode=new Node(data ,null,this.head);
      this.head=newNode;//OR this.haead=new Node(data ,null,this.head);
      size++;
      }
      private void insertAfter(int data,Node node)
          {Node newNode=new Node(data,node,node.next);
          node.next=newNode;
          newNode.next.pre=newNode;
                  size++;
          }
          public void insert(int data){
          if(head==null){
              insertHead(data);
          }
          else{
              Node temp=this.head;
              while(temp.next!=null){
                  temp = temp.next;
              }
              insertAfter(data,temp);
          }}
        */
    class Node {
        int data;
        Node next;
        Node previous;

    }

    public static class DoubelyLinkedList {
        Node head;
        int size;

        void insert(Node node) {
            System.out.println("inserting node " + node.data + " at last");
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                node.previous = temp;
                temp.next = node;
            }}
            void display(){
                System.out.println("Doubly LinkedList");
                Node temp = head;
                System.out.println("null<--->");
                while (temp != null) {
                    System.out.println(temp.data + "<--->");
                    temp = temp.next;
                }
                System.out.println("null");
            }


        void delete() {
            if (head == null) {
                System.out.println("empty list");
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                System.out.println("deleting node " + temp.data + " from last");
                temp = temp.previous;
                temp.next = null;
            }

        }

        public static void main(String[] args) {
            DoubelyLinkedList linkedList = new DoubelyLinkedList();
            linkedList.display();
        }
  boolean search(Node node){
boolean response=false;
Node temp=head;
while(temp!=null)
{
    if (temp.data==node.data){
        response=true;
        break;
    }
    temp=temp.next;
}
return response;

  }
  void insertAtBeginning(Node node){

  }
    }

}