
public class Intarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length = 15;
		int array[] = new int[length];
		int min = 50;
	    int max = 100;
	    int random_int,index,temp; 
		
		for (int i=0;i<length;i++) {
			random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			array[i] = random_int;
		}
		
		
		for (int i=0;i<length-1;i++) {
			min = array[i];
			index = i;
			for (int j=i+1;j<length;j++) {
				if(array[j]<min) {
					index = j;
					min = array[j];
				}
			}
			temp = array[i];
			array[i] = min;
			array[index] = temp;
		}
		
		for (int i=0;i<length;i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
