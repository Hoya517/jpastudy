package com.circus.jpastudy.store;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Store extends BaseEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String storeName;  // DB: store_name
    private String storePhone;
    private String bossName;
    private String address;
    private String number;



    @Builder
    public Store(String storeName, String storePhone, String bossName, String address, String number) {
        this.storeName = storeName;
        this.storePhone = storePhone;
        this.bossName = bossName;
        this.address = address;
        this.number = number;
    }
}
