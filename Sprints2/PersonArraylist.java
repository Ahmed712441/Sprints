import java.util.ArrayList;
import java.util.Scanner;

public class PersonArraylist {
	
	public static class Person {
		String name;
		int age;
		
		Person(String name,int age){
			this.name = name;
			this.age = age;
		}
		
		public String toString() {
			return "name : " + name +" , age : "+age;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> persons =new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		String name ,line;
		int age;
		String a[];
		
		while(true) {
			
			line = sc.nextLine();
			if(line.equals("0")) {
				break;
			}
			a = line.split(",");
			name = a[0];
			age = Integer.parseInt(a[1]);
			persons.add(new Person(name,age));

		}
		
		for (int i=0;i<persons.size();i++) {
			System.out.println(persons.get(i).toString());
		}
		
		
	}

}
