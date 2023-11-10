package com.parking.lot.management.service;

import com.parking.lot.management.entity.SlotCategory;

import java.util.List;
import java.util.Optional;

public interface SlotCategoryService {
    SlotCategory createSlotCategory(SlotCategory slotCategory);

    SlotCategory updateSlotCategory(SlotCategory slotCategory);

    SlotCategory deleteSlotCategory(SlotCategory slotCategory);

    Optional<SlotCategory> getSingleSlotCategory(Integer id);

    List<SlotCategory> fetchAllSlotCategories();

}
