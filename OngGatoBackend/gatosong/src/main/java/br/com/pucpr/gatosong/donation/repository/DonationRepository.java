package br.com.pucpr.gatosong.donation.repository;

import br.com.pucpr.gatosong.donation.model.DonationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<DonationModel,Long> {
}
