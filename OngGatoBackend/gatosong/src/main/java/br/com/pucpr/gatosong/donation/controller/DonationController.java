package br.com.pucpr.gatosong.donation.controller;

import br.com.pucpr.gatosong.donation.dto.DonationDTO;
import br.com.pucpr.gatosong.donation.facade.impl.DefaultDonationFacade;
import br.com.pucpr.gatosong.donation.model.DonationModel;
import br.com.pucpr.gatosong.donation.service.DonationService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Setter
@Getter
@RestController
@RequestMapping(value={"/donation"})
@AllArgsConstructor
@NoArgsConstructor
public class DonationController {

    private static final Logger logger = LogManager.getLogger(DonationController.class);

    private DonationService donationService;
    private DefaultDonationFacade donationFacade;

    @GetMapping
    public ResponseEntity<?> getDonations() {
        try {

            List<DonationModel> donationModelList = donationService.getAllDonations();

            if (CollectionUtils.isEmpty(donationModelList)) {
                return ResponseEntity.ok().body("No donations found");
            }

            return ResponseEntity.ok().body(donationModelList);

        } catch (Exception e) {
            logger.error("Unable to get Donations", e);
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getDonationById(@PathVariable Long id) {
        try {

            List<DonationModel> donationModelList = donationService.getDonationById(id);

            if (CollectionUtils.isEmpty(donationModelList)) {
                return ResponseEntity.ok().body("No donation with code: " + id + "found");
            }

            return ResponseEntity.ok().body(donationModelList);

        } catch (Exception e) {
            logger.error("Unable to get Donation", e);
            throw new RuntimeException(e);
        }
    }

    @PostMapping
    public ResponseEntity<?> createDonation(@RequestBody DonationModel donationModel) {
        try {

            List<DonationModel> donationModelList = donationService.createDonation(donationModel);

            if (CollectionUtils.isEmpty(donationModelList)) {
                return ResponseEntity.ok().body("No donation with code: " + donationModel.getId() + "found");
            }

            return ResponseEntity.ok().body(donationModelList);

        } catch (Exception e) {
            logger.error("Unable to get Donation", e);
            throw new RuntimeException(e);
        }
    }

    @PatchMapping
    public ResponseEntity<?> updateDonation(@RequestBody DonationDTO updateModel) {
        try {
            if (updateModel == null) {
                DonationModel model = donationFacade.populateDonationModel(updateModel);

                return ResponseEntity.ok().body(Objects.requireNonNullElseGet(model, () -> "No donation with code: " + updateModel.getId() + "found"));
            }
        } catch (Exception e) {
            logger.error("Unable to get Donation", e);
            throw new RuntimeException(e);
        }
        return null;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDonation(@PathVariable Long id) {
        try {

            DonationModel model = donationFacade.deleteDonation(id);

            if (model == null){
                return ResponseEntity.ok().body("No donation with code: " + id + "found");
            }

            return ResponseEntity.ok().body("Model with code: "+ id + " deleted successfully");

        } catch (Exception e) {
            logger.error("Unable to get Donation", e);
            throw new RuntimeException(e);
        }
    }

}
