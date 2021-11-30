package model.dao.impl;

import java.util.ArrayList;
import java.util.List;

import model.dao.SellerDAO;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDAO {

	@Override
	public void insert(Seller seller) {
	}

	@Override
	public void update(Seller seller) {
	}

	@Override
	public void deleteById(Integer id) {
	}

	@Override
	public Seller findById(Integer id) {
		return null;
	}

	@Override
	public List<Seller> findAll() {
		List<Seller> sellers = new ArrayList<>();
		return null;
	}

}