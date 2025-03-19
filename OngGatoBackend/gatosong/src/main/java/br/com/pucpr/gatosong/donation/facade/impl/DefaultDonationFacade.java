package br.com.pucpr.gatosong.donation.facade.impl;

import br.com.pucpr.gatosong.donation.dto.DonationDTO;
import br.com.pucpr.gatosong.donation.facade.DonationFacade;
import br.com.pucpr.gatosong.donation.model.DonationModel;
import br.com.pucpr.gatosong.donation.service.DonationService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class DefaultDonationFacade implements DonationFacade {

    private static final Logger logger = LogManager.getLogger(DefaultDonationFacade.class);

    private DonationService donationService;


    @Override
    public DonationModel populateDonationModel(DonationDTO source) {
        DonationModel target = new DonationModel();

        target.setId(source.getId());
        target.setAmount(source.getAmount( ));
        target.setDonator(source.getDonator());
        target.setDate(source.getDate());

        return getDonationService().updateDonation(target);
    }

    @Override
    public DonationModel deleteDonation(Long id) {
       List<DonationModel> model = donationService.getDonationById(id);

       if (model.isEmpty()) {
           logger.error("DonationModel not found");
           return null;
       }

       donationService.deleteDonationModel(id);

       return model.get(0);
    }
}
