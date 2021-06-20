package com.nt.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nt.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, String> {
	
	@Query("SELECT count(*) FROM User WHERE username=:un AND password=:pwd")  //HQL/JPQL  
	public    int   authenticate(@Param("un")String username , @Param("pwd") String password);

}
