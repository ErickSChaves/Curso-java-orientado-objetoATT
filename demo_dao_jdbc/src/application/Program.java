package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao dapartmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("=== TEST 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== TEST 3: seller findAll ====");
		list = sellerDao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== TEST 4: seller insert ====");
		Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new id = " + newSeller.getId());
		
		System.out.println();
		System.out.println("=== TEST 5: seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println();
		System.out.println("=== TEST 6: seller delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		System.out.println();
		System.out.println("=== TEST 1: department insert ====");
		Department novoDepartamento = new Department(null, "teste");
		dapartmentDao.insert(novoDepartamento);
		System.out.println("Inserted new id = " + novoDepartamento.getId());
		
		System.out.println();
		System.out.println("=== TEST 2: department findById ====");
		Department departmentFind = dapartmentDao.findById(4);
		System.out.println(departmentFind);
		
		System.out.println();
		System.out.println("=== TEST 3: department update ====");
		department = dapartmentDao.findById(5);
		department.setName("teste2");
		dapartmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println();
		System.out.println("=== TEST 4: department delete ====");
		System.out.println("Digite o id do departmento que vai ser excluido");
		int idDelete = sc.nextInt();
		dapartmentDao.deleteById(idDelete);
		System.out.println("Delete completed");
		
		System.out.println();
		System.out.println("=== TEST 4: department findAll ====");
		List<Department> list2 = dapartmentDao.findAll();	
		for (Department obj: list2) {
			System.out.println(obj);
		}
		
		

		
		sc.close();
		
	}

}
