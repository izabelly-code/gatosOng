package br.com.pucpr.gatosong.donation.facade;

import br.com.pucpr.gatosong.donation.dto.DonationDTO;
import br.com.pucpr.gatosong.donation.model.DonationModel;

public interface DonationFacade {
    DonationModel populateDonationModel(DonationDTO dto);

    DonationModel deleteDonation(Long id);
}
