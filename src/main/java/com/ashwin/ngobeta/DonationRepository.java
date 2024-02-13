package com.ashwin.ngobeta;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;


	@Repository
	public interface DonationRepository extends JpaRepository<Donation, Long> {
	    
	

	public Donation save(Donation newDonation);

	public Optional<Donation> findById(Long id);

	public void update(Donation donation);

	public void delete(int donationId) ;

	public List<Donation> findAll();

}


