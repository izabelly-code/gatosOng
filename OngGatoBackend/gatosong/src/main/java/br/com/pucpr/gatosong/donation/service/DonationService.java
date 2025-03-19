package br.com.pucpr.gatosong.donation.service;

import br.com.pucpr.gatosong.donation.model.DonationModel;

import java.util.List;

public interface DonationService {
    List<DonationModel> getAllDonations();

    List<DonationModel> getDonationById(Long id);

    List<DonationModel> createDonation(DonationModel donationModel);

    DonationModel updateDonation(DonationModel target);

    void deleteDonationModel(Long id);
}
