package linkedlist;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class StudentTest {
public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream("F:\\AHMEDABAD UNIVERSITY\\DS\\Lab assignment\\LabProjectDSA\\src\\linkedlist\\Section1.txt");
		Scanner scr = new Scanner(file);
		Student students = new Student(); 
		while(scr.hasNext()) {
			String str = scr.nextLine();
			Student student = new Student(str);
			students.insert((SNode<String>) student);
		}
       students.printList();
       
       scr.close();
       file.close();
	}
}
