package application;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST 1: department insert ===");
		Department newDepartment = new Department(1, "HR");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 2: department findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		
		
		sc.close();
	}

}
