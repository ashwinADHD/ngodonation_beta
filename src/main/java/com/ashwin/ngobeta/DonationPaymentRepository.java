
package com.ashwin.ngobeta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationPaymentRepository extends JpaRepository<DonationPayment, Long> {

	public DonationPayment save(DonationPayment newDonationPayment);

	public DonationPayment findById(int donationPaymentId) ;

	public void update(DonationPayment DonationPayment) ;

	public void delete(int donationPaymentId);
}
