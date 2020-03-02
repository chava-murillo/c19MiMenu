package c19MiMenu;

import java.util.Scanner;

import org.c19MiMenu.employees.Programmer;

public class MyMenuApp {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int option, option2 = 0; 
		boolean flag = true;
		Matrix mat = new Matrix();
		forEachLee fel = new forEachLee();
		
		Programmer backend = new Programmer();
		
		do {
			
			System.out.println("\n1. if-else \n"
				+ "2. for ReadOne \n"
				+ "3. while update\n"
				+ "4. do-while delete\n"
				+ "5. Switch\n"
				+ "6. Matrix\n"
				+ "7. for-each Read All\n"
				+ "8. Exit\n"
				+ "\nChoose an option:\t");
			
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				break;
			case 2:
				backend.Read("R2D2", mat.employees);
				break;
			case 3:
				backend.Update("R2D2", 2, "princes42@generation.org", mat.employees);
				break;
			case 4:
				backend.Delete(mat.employees,"F64W");
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				backend.Read(mat.employees);
				break;
			case 8:
				break;
			default:
				System.out.println("Elige otra opcion");
			}
		
		}while(option!=8);
		
			/*option = sc.nextInt();
			if (option == 8) {
				flag = false;
				System.exit(0);
			}else if (option >0 && option <8){
				switch (option) {
					case 1: 
						printif();
						break;
					case 2: 
						printfor();
						break;
				}
				
			}
			System.out.println("\nDesea regresar al menu (1)\n" +
							"Desea salir (2)");
			option2 = sc.nextInt();
			if (option2 == 1) {
				printMenu();
			}else if(option2 ==2) {
				System.exit(0);
			}
		}while (flag);*/

	}
	
	//Metodos de Impresion
	
	/*public static void printMenu() {
		System.out.println("1. if-else \t"
				+ "2. for \t"
				+ "3. while\t"
				+ "4. do-while\t"
				+ "5. Switch\t"
				+ "6. Matrix\t"
				+ "7. for-each\t"
				+ "8. Exit\t"
				+ "\nChoose an option:\t");
	}*/
	
	
	
	public static void printif() {
		System.out.println("\nif(condition: boolean){"
				+ "\n\t<cuerpo de codigo>\n}if o else-if{\n\t<cuerpo de codigo>\n}");
	}
	
	public static void printfor() {
		System.out.println("\nfor(init ; condition; increment){}");
	}

}
