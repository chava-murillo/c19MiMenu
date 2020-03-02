package org.c19MiMenu.employees;

import org.c19MiMenu.crud.Empleado;

public class Programmer extends Empleado {
	
	@Override
	public void Create(String id, String name, String email, String cPhone) {
		super.Create(id, name, email, cPhone); //Super habla de la clase padre 'Empleado' le llega el tipo de dato.
		System.out.print("Create Empleado Programmer");
	}
	
	@Override
	public void Read(String[][] employee) {
		super.Read(employee);
		for(String[] obj: employee) {
			System.out.print("\n");
			for(String obje: obj) {
				System.out.print("[" + obje + "]");	
			}
		}
		System.out.print("Read Empleado Programmer");
	}
	
	public void Read(String id, String [][] employee) {
		for(int i=0; i<3; i++) {
			if(employee[i][0].equals(id)) {
				for (int j=0; j<3; j++) {
					System.out.print(employee[i][j] + "\t");
				}
			}
		}
	}
	
	@Override
	public void Update(String id, int position, String inf, String[][] employee) {
		super.Update(id, position, inf, employee);
		System.out.print("Update Empleado Programmer");
		int i=0;
			while(i<=3) {
				if(employee[i][0].equals(id)) {
					employee[i][position] = inf;
				}
				i++;
			}
	}
	
	@Override
	public void Delete(String[][] employee, String id) {
		super.Delete(employee, id);
		System.out.print("Delete Empleado Programmer");
		int i = 0;
		do {
			if(employee[i][0].equals(id)) {
				for(int j=0; j<=3;j++) {
					employee[i][j]="";
				}
			}
			i++;
		}while(i<=3);
	}
}
