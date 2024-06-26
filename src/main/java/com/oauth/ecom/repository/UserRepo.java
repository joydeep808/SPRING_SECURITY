package com.oauth.ecom.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oauth.ecom.entity.UserEntity;
@Repository
public interface UserRepo extends JpaRepository<UserEntity , Object>{
  // List<UserEntity> findUsers();
  UserEntity findByUsername(String username);
  UserEntity findByEmail( String email);
  UserEntity findByRole(String role);
  UserEntity findByUsernameAndEmail(String username , String email);
}
