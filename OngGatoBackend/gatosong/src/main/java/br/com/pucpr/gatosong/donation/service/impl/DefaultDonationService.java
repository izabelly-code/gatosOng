package br.com.pucpr.gatosong.donation.service.impl;

import br.com.pucpr.gatosong.donation.model.DonationModel;
import br.com.pucpr.gatosong.donation.repository.DonationRepository;
import br.com.pucpr.gatosong.donation.service.DonationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class DefaultDonationService implements DonationService {

    private static final Logger logger = LogManager.getLogger(DefaultDonationService.class);

    private DonationRepository donationRepository;

    @Override
    public List<DonationModel> getAllDonations() {

        List<DonationModel> list = donationRepository.findAll();

        if (list.isEmpty()) {
            return null;
        }

        return list;
    }

    @Override
    public List<DonationModel> getDonationById(Long id) {

        Optional<DonationModel> donationModel = donationRepository.findById(id);

        return donationModel.map(Collections::singletonList).orElse(null);
    }

    @Override
    public List<DonationModel> createDonation(DonationModel donationModel) {

        DonationModel model = null;

        if(!ObjectUtils.isEmpty(donationModel)) {
            try {
                model = donationRepository.save(donationModel);
            }catch (Exception e) {
                logger.error("Unable to save DonationModel", e);
            }
        }

        return ObjectUtils.isEmpty(model)? null : Collections.singletonList(model);
    }

    @Override
    public DonationModel updateDonation(DonationModel donationModel) {

        DonationModel model = null;

        if(!ObjectUtils.isEmpty(donationModel) && donationRepository.existsById(donationModel.getId())) {
            try {
                model = donationRepository.save(donationModel);
            }catch (Exception e) {
                logger.error("Unable to save DonationModel", e);
            }
        }

        return ObjectUtils.isEmpty(model)? null : model;
    }

    @Override
    public void deleteDonationModel(Long id) {
        if(donationRepository.existsById(id)) {
            try {
                donationRepository.deleteById(id);
            }catch (Exception e) {
                logger.error("Unable to delete DonationModel", e);
            }
        }
    }
}
