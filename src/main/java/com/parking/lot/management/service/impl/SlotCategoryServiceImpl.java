package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.SlotCategory;
import com.parking.lot.management.service.SlotCategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SlotCategoryServiceImpl implements SlotCategoryService {
    @Override
    public SlotCategory createSlotCategory(SlotCategory slotCategory) {
        return null;
    }

    @Override
    public SlotCategory updateSlotCategory(SlotCategory slotCategory) {
        return null;
    }

    @Override
    public SlotCategory deleteSlotCategory(SlotCategory slotCategory) {
        return null;
    }

    @Override
    public List<SlotCategory> fetchAllSlotCategories() {
        return null;
    }
}
