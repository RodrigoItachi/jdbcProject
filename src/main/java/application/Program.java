package application;

import java.util.Locale;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.CANADA);
		
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		
		System.out.println("==== TEST 1: seller findById =====");
		Seller seller = sellerDAO.findById(3);
		System.out.print(seller);
	}

}