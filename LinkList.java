public class LinkList {
    public Node head;

    public LinkList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
    
        if(this.head == null){
            this.head = newNode;
        }else{
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayLinkList() {
        Node current = this.head;

        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null \n");
    }

   public void addBetween(int startPoint, LinkList previousLinkList, LinkList newLinkList){
        Node oldStart = previousLinkList.head;

        while(oldStart != null && oldStart.data != startPoint){
            oldStart = oldStart.next;
        }

        if(oldStart == null){
            System.out.println("Start point not found");
            return;
        }

        Node oldStartNext = oldStart.next;
        oldStart.next = newLinkList.head;

        Node newLinkListLast = newLinkList.head;


        while(newLinkListLast.next != null){
            newLinkListLast = newLinkListLast.next;
        }

        newLinkListLast.next = oldStartNext;
   }
}
