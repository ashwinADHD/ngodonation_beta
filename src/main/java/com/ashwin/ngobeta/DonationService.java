package com.ashwin.ngobeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonationService {

    @Autowired
    private DonationRepository donationRepository;

    public Donation makeDonation(Donation donation) {
         return donationRepository.save(donation);
    }

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    public Optional<Donation> getDonationById(Long id) {
        return donationRepository.findById(id);
    }

    public Donation updateDonation(Long id, Donation updatedDonation) {
        Optional<Donation> donationOptional = donationRepository.findById(id);
        if (donationOptional.isPresent()) {
            Donation donation = donationOptional.get();
            donation.setDonationPayment(updatedDonation.getDonationPayment());
            donation.setAmount(updatedDonation.getAmount());
            donation.setDate(updatedDonation.getDate());
            donation.setDonor(updatedDonation.getDonor());
            donation.setEvent(updatedDonation.getEvent());
            return donationRepository.save(donation);
        } else {
            return null; // Donation with given id not found
        }
    }
}
