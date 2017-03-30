package pack_03_daoImp;

import java.util.List;

import pack_01.Country;

public interface CountryDao <T>{
	void save(T t);
	List<T>findAll();
	T findOneByname(String name);
	void delete(String name);
}
