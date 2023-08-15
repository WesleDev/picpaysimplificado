package com.picpaysimplificado.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class TransactionDTO{

    private BigDecimal value;
    private Long senderId;
    private Long receiverId;
}
