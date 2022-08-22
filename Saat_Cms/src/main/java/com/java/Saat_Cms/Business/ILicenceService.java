package com.java.Saat_Cms.Business;
import java.util.List;


import com.java.Saat_Cms.entitis.Licence;

public interface ILicenceService {
	
	   List<Licence> getAll();
		
		void add(Licence licence);
		
		void update(Licence licence);
		
		void delete(Licence licence);
		
		Licence getById(int id);

}
