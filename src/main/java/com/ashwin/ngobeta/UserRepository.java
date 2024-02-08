package com.ashwin.ngobeta;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

	public interface UserRepository extends JpaRepository<User, Long> {

	public void update(User user) ;

	public Optional<User> findById(Long userId);

	public void delete(int userId);

	public User save(User newUser) ;

	public List<User> findAll() ;

	public void deleteById(Long userId);


}