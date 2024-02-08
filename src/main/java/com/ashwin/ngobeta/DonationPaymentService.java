package com.ashwin.ngobeta;

public interface DonationPaymentService {
    DonationPayment createDonationPayment(String typeName);
    DonationPayment getPaymentById(int donationPaymentId);
    void updateDonationPayment(DonationPayment donationPayment);
    void deleteDonationPayment(int donationPaymentId);
}