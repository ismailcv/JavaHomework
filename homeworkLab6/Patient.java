package homeworkLab6;



public class Patient implements Comparable<Patient>{
	
	String name;
	int age;

	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Patient o) {
		 if(o.age > 65){     
			 return 1;  
		 }
		 else  
		     return 0;  
	}
	
	
	

}
