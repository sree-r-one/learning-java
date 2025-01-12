package designPatterns;

public class Singleton {

	private static Singleton singleton;

	private Singleton() {
		System.out.println("Singleton Created!");
	}

	public static Singleton getSingleton(){
		if (singleton == null) {
			singleton = new Singleton(); 
		}
		return singleton; 
	}

	public void log(String message){
		System.out.println("LOG: "+ message);
	}
}
