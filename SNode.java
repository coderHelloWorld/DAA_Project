package linkedlist;
public class SNode<T> extends SList {
public SNode() {
    	
    }
	T key;
    SNode<T> next;
    public SNode(T k){
        key = k;
    }
    public T getValue(){
        return key;
    }
}
