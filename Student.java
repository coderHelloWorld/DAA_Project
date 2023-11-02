package linkedlist;

public class Student extends SNode<String> {
  public Student() {
    	
    }
	public Student(String k){
        super(k);
    }
    public String getValue() {
        return super.key;
    }
}
