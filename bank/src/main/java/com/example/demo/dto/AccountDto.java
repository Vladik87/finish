package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDto {
    private Integer id;
    private Integer number;
    private Integer amount;
    private Integer block;

    public AccountDto() {
    }

    public AccountDto(Integer id, Integer number, Integer amount, Integer block) {
        this.id = id;
        this.number = number;
        this.amount = amount;
        this.block = block;
    }
}
