package org.c19MiMenu.employees;

import org.c19MiMenu.crud.Empleado;

public class lawyer extends Empleado {
	
	@Override
	public void Create(String id, String name, String email, String cPhone) {
		super.Create(id, name, email, cPhone);
		System.out.print("Create Empleado lawyer");
	}
	
	@Override
	public void Read(String[][] employee) {
		super.Read(employee);
		System.out.print("Read Empleado lawyer");
	}
	
	@Override
	public void Update(String id, int position, String inf, String[][] employee) {
		super.Update(id, position, inf, employee);
		System.out.print("Update Empleado lawyer");
	}
	
	@Override
	public void Delete(String[][] employee, String id) {
		super.Delete(employee, id);
		System.out.print("Delete Empleado lawyer");
	}

}
