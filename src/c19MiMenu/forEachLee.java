package c19MiMenu;

public class forEachLee {
	
	public void ImprimeEmps(String[][] matrix) {
		
		for(String[] obj: matrix) {
			for(String obje: obj) {
				System.out.println(/*"obj: "+ obj + */"obje: " + obje);
			}
			
		}
	}

}
