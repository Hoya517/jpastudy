package com.circus.jpastudy.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
