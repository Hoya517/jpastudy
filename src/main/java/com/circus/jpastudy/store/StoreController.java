package com.circus.jpastudy.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class StoreController {

    private final StoreService storeService;

    @GetMapping("/addStore")
    public String addStore(Model model) {
        model.addAttribute("storeRegisterDTO", new StoreRegisterDTO());

        return "createShopForm";
    }

    @PostMapping("/addStore")
    public String addStore(StoreRegisterDTO storeRegisterDTO) {
        storeService.save(storeRegisterDTO);

        return "redirect:/addStore";
    }

    @GetMapping("/storeInfo/{id}")
    public String updateStore(@PathVariable Long id, Model model) {
        Store store = storeService.findById(id).get();
        StoreRegisterDTO storeRegisterDTO = new StoreRegisterDTO();
        storeRegisterDTO.setStoreName(store.getStoreName());
        storeRegisterDTO.setStorePhone(store.getStorePhone());
        storeRegisterDTO.setBossName(store.getBossName());
        storeRegisterDTO.setAddress(store.getAddress());
        storeRegisterDTO.setNumber(store.getNumber());

        //추가
        storeRegisterDTO.setIntro(store.getIntro());
        storeRegisterDTO.setOpening(store.getOpening());
        storeRegisterDTO.setBreaktime(store.getBreaktime());
        storeRegisterDTO.setHoliday(store.getTemholiday());
        storeRegisterDTO.setTemholiday(store.getTemholiday());

//        model.addAttribute("storeRegisterDTO", new StoreRegisterDTO());
        model.addAttribute("storeRegisterDTO", storeRegisterDTO);

        return "storeInfoForm";
    }

    @PostMapping("/storeInfo/{id}")
    public String updateStore(@PathVariable Long id, @ModelAttribute StoreRegisterDTO storeRegisterDTO) {
        storeService.update(id, storeRegisterDTO);
        return "redirect:/storeInfo/"+id;
    }
}
