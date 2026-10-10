public class Animal{
public static void main(String[] args){
	
	
		run(); // method called with class declaration
		
		Animal animal = new Animal();
		
		 System.out.println(animal.jump(4));

	}

//static method - do not require obj instantiation
	public static void run(){
	System.out.println("I am running");
	}

//non static method - require obj instantiation
	public int jump(int times){
	return times ; 
	}



		 }

