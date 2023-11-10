package com.parking.lot.management.controller;

import com.parking.lot.management.entity.SlotCategory;
import com.parking.lot.management.service.SlotCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("slot-category")
public class SlotCategoryController {

    private final SlotCategoryService slotCategoryService;

    @GetMapping("/get-all")
    public List<SlotCategory> getAllSlotCategories(){
        return slotCategoryService.fetchAllSlotCategories();
    }
}
