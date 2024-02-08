package com.ashwin.ngobeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DonationPaymentController implements DonationPaymentService {

    private final DonationPaymentRepository donationPaymentRepository;

    @Autowired
    public DonationPaymentController(DonationPaymentRepository donationPaymentRepository) {
        this.donationPaymentRepository = donationPaymentRepository;
    }

    @Override
    public DonationPayment createDonationPayment(String typeName) {
        DonationPayment newDonationPayment = new DonationPayment();
        newDonationPayment.setTypeName(typeName);
        return donationPaymentRepository.save(newDonationPayment);
    }

    @Override
    public DonationPayment getPaymentById(int donationPaymentId) {
        return donationPaymentRepository.findById(donationPaymentId);
    }

    @Override
    public void updateDonationPayment(DonationPayment donationPayment) {
        donationPaymentRepository.save(donationPayment);
    }

    @Override
    public void deleteDonationPayment(int donationPaymentId) {
        donationPaymentRepository.deleteById((long) donationPaymentId);
    }
}

