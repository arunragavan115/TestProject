package Java_Basics;

public class Find_Java_version {

	public static void main(String[] args) {

		System.out.println("java version"+System.getProperty("java.version"));  //find version of java
		
		System.out.println("java runtime"+System.getProperty("java.runtime.version")); // find version of runtime
		
		System.out.println("java home"+ System.getProperty("java.home"));			//find java home
		
		System.out.println("vendor"+ System.getProperty("java.vendor"));	//find vendor 
		
		System.out.println("java vendor UTL"+ System.getProperty("java.vendor.url"));//find vendor url
		
		System.out.println("java classpath"+ System.getProperty("java.class.path")); //classpath for java
		
	}

}
