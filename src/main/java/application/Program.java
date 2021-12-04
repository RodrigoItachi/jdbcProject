package application;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.CANADA);

		SellerDAO sellerDAO = DAOFactory.createSellerDAO();

		System.out.println("==== TEST 1: seller findById =====");
		Seller seller = sellerDAO.findById(3);
		System.out.print(seller);

		System.out.println("\n\n==== TEST 2: seller findByDepartment =====");
		List<Seller> list = sellerDAO.findByDepartment(new Department(2, null));
		list.forEach(System.out::println);

		System.out.println("\n\n==== TEST 3: seller findAll =====");
		list = sellerDAO.findAll();
		list.forEach(System.out::println);

		System.out.println("\n\n==== TEST 4: seller insert =====");
		Seller seller2 = new Seller(null, "greg", "greg@gmail.com", new Date(), 4000.0, new Department(2, null));
		sellerDAO.insert(seller2);
		System.out.println("Iserted! New id = " + seller.getId());
		
		System.out.println("\n\n==== TEST 5: seller update =====");
		seller = sellerDAO.findById(1);
		seller.setName("Carlos");
		sellerDAO.update(seller);
		System.out.println("Iserted! New name = " + seller.getName());


	}

}