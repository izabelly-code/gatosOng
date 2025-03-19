package br.com.pucpr.gatosong.donation.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class DonationDTO {
    public Long Id;
    public BigDecimal amount;
    public String donator;
    public Date date;
}
