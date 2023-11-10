package com.parking.lot.management.controller;

import com.parking.lot.management.entity.SlotCategory;
import com.parking.lot.management.service.SlotCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/slot-category")
public class SlotCategoryController {

    private final SlotCategoryService slotCategoryService;

    @GetMapping("/get/{id}")
    public Optional<SlotCategory> getSingleSlotCategory(@PathVariable Integer id){
        return slotCategoryService.getSingleSlotCategory(id);
    }

    @GetMapping("/get-all")
    public List<SlotCategory> getAllSlotCategories(){
        return slotCategoryService.fetchAllSlotCategories();
    }

    @PostMapping("/create")
    public SlotCategory createSlotCategory(@RequestBody SlotCategory slotCategory){
        return slotCategoryService.createSlotCategory(slotCategory);
    }

    @PutMapping("/update")
    public SlotCategory updateSlotCategory(@RequestBody SlotCategory slotCategory){
        return slotCategoryService.updateSlotCategory(slotCategory);
    }

    @DeleteMapping("/delete")
    public SlotCategory deleteSlotCategory(@RequestBody SlotCategory slotCategory){
        return slotCategoryService.deleteSlotCategory(slotCategory);
    }
}
