
package com.ashwin.ngobeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

/*@RequestMapping("/api/donations")*/

public class DonationController {

    @Autowired
    private DonationService donationService;

    @PostMapping("/submit")
    public ResponseEntity<Donation> makeDonation(@RequestBody Donation donation) {
        Donation newDonation = donationService.makeDonation(donation);
        return new ResponseEntity<>(newDonation, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Donation>> getAllDonations() {
        List<Donation> donations = donationService.getAllDonations();
        return new ResponseEntity<>(donations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Donation> getDonationById(@PathVariable Long id) {
        Donation donation = donationService.getDonationById(id).orElse(null);
        if (donation != null) {
            return new ResponseEntity<>(donation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Donation> updateDonation(@PathVariable Long id, @RequestBody Donation updatedDonation) {
        Donation donation = donationService.updateDonation(id, updatedDonation);
        if (donation != null) {
            return new ResponseEntity<>(donation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}


