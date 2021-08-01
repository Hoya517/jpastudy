package com.circus.jpastudy.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoreRegisterDTO {

    private Long id;
    private String storeName;
    private String storePhone;
    private String bossName;
    private String address;
    private String number;
}
