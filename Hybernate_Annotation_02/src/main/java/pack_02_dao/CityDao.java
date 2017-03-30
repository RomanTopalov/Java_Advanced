package pack_02_dao;

import java.util.List;

import pack_01.T;


public interface CityDao {

	void save(T city);
	List<T>findAll();
	T findOneByname(String name);
	void delete(String name);
}
