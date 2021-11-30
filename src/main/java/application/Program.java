package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;

public class Program {

	public static void main(String[] args) {
		SellerDAO dao = DAOFactory.createSellerDAO();
	}

}