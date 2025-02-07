package model.Dao;
import java.util.List;

import model.Entities.Department;
import model.Entities.Seller;

public interface SellerDao {

  void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller Seller(Integer id);
	List<Seller> findAll();
  
}
