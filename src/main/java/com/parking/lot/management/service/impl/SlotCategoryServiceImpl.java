package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.SlotCategory;
import com.parking.lot.management.repository.SlotCategoryRepository;
import com.parking.lot.management.service.SlotCategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class SlotCategoryServiceImpl implements SlotCategoryService {

    private final SlotCategoryRepository slotCategoryRepository;
    @Override
    public SlotCategory createSlotCategory(SlotCategory slotCategory) {
        return slotCategoryRepository.save(slotCategory);
    }

    @Override
    public SlotCategory updateSlotCategory(SlotCategory slotCategory) {
        return slotCategoryRepository.save(slotCategory);
    }

    @Override
    public SlotCategory deleteSlotCategory(SlotCategory slotCategory) {
        slotCategoryRepository.delete(slotCategory);
        return slotCategory;
    }

    @Override
    public Optional<SlotCategory> getSingleSlotCategory(Integer id) {
        return slotCategoryRepository.findById(id);
    }

    @Override
    public List<SlotCategory> fetchAllSlotCategories() {
        return slotCategoryRepository.findAll();
    }
}
