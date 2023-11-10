package com.parking.lot.management.service;

import com.parking.lot.management.entity.SlotCategory;

import java.util.List;

public interface SlotCategoryService {
    SlotCategory createSlotCategory(SlotCategory slotCategory);

    SlotCategory updateSlotCategory(SlotCategory slotCategory);

    SlotCategory deleteSlotCategory(SlotCategory slotCategory);

    List<SlotCategory> fetchAllSlotCategories();

}
