package task;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		 File workFolder = new File(".");
		 
		 File[] files = workFolder.listFiles();
		 
		 System.out.println("List of catalog: ");
	 	 showAllCatalogs(files);
		 	
	}
	
	public static void showAllCatalogs(File[] files) {
		
		 for (int i = 0; i < files.length; i++) {
			 	
		     if (!files[i].isFile()) {
		    	 System.out.println(files[i]);
		     }
		    
		 }
		
	}

}


