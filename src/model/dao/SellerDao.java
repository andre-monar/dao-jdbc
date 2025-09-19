package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao extends Dao<Seller> {
	List<Seller> findByDepartment(Department department);
}