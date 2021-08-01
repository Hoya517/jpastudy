package com.circus.jpastudy.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreRepository storeRepository;

    public void save(StoreRegisterDTO storeRegisterDTO) {
        storeRepository.save(Store.builder()
                .storeName(storeRegisterDTO.getStoreName())
                .storePhone(storeRegisterDTO.getStorePhone())
                .bossName(storeRegisterDTO.getBossName())
                .address(storeRegisterDTO.getAddress())
                .number(storeRegisterDTO.getNumber())
                .build());
    }
}
