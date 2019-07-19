import java.util.Iterator;
import java.util.TreeSet;

public class Lab816{
	
	public static void main(String[] args) {
		TreeSet <Object> ts=new TreeSet<Object>();
	
		ts.add(new Student(99, "Sri"));
		ts.add(new Student(99, "Sriw"));
		ts.add(new Student(49, "Srie"));
		ts.add(new Student(65, "Sriwt"));
		ts.add(new Student(19, "Sryi"));
		ts.add(new Student(99, "Sriuw"));
		
		Iterator<Object> it=ts.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
			
		}
		
	}
	class Student implements Comparable {
		int sid ; String name;
		Student(int sid , String name){
			this.name=name;
			this.sid=sid;	
		}
		
		public int compareTo(Object obj) {
			if ( (obj instanceof Student)) {
				Student st = (Student) obj;
				return this.name.compareTo(st.name);	
			}	
			return 0;
		    }	
	public String toString() {	
		return sid +"\t"+ name;
	}
	}

