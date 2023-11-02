package linkedlist;
public class SList<Student> {
	SNode head;
    public void insert(SNode x) {
        SNode y = head;
        if(y == null){
            head = x;
        }else{
            while(y.next != null){
                y = y.next;
            }
            y.next = x;    
        }
    }
    
    public void delete(SNode x) {
        SNode y = head;
        while(y.next != x) {
            y = y.next;
        }
        y.next = x.next;
    }
    public SNode search(Student key) {
        SNode y = head;
        while(y.key != key && y != null) {
            y = y.next;
        }
        return y;
    }
    public void printList() {
        SNode<Student> x = head;
        
        if(x == null)
            System.out.println("The List is empty");
        
        while(x != null){
            System.out.println(x.key + " ");
            x = x.next;
        }
        System.out.println();
    }
}
