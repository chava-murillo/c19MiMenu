package org.c19MiMenu.crud;

public abstract class Empleado implements Empleable {
	
	@Override
	public void Create(String id, String name, String email, String cPhone) {
		System.out.println("Create Empleado");
		
	}
	
	@Override
	public void Read(String[][] employee) {
		System.out.println("Read Empleado");
	}
	
	@Override
	public void Update(String id, int position, String inf, String[][] employee) {
		
		System.out.println("Update Empleado");
		
	}
	
	@Override
	public void Delete(String[][] employee, String id) {
		System.out.println("Delete Empleado");	
	}

}
