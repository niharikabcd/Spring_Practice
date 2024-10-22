package com.DTOImpl.SpringDTOimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.DTOImpl.SpringDTOimpl.model.Location;
import com.DTOImpl.SpringDTOimpl.model.Users;
import com.DTOImpl.SpringDTOimpl.repository.locationrepo;
import com.DTOImpl.SpringDTOimpl.repository.userrepo;

@SpringBootApplication
public class SpringDtOimplApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDtOimplApplication.class, args);
	}
	@Autowired
	private userrepo userrepo;

	@Autowired
	 private locationrepo locationrepo;
	

	@Override
	public void run(String... args) throws Exception {
		Location location =new Location();
		location.setPlace("Hyderabad");
		location.setDescription("I love hyd");
		location.setLatitude(812);
		location.setLongitude(712);
		locationrepo.save(location);

		Users user1=new Users();
		user1.setId(132);
		user1.setEmail("niha@gmail.com");
		user1.setFirstname("Niha");
		user1.setLastname("varma");
		user1.setPassword("niha@123");
		user1.setLocation(location);
		userrepo.save(user1);
	}
}
