package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.SlotPlan;
import com.parking.lot.management.repository.SlotPlanRepository;
import com.parking.lot.management.service.SlotPlanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class SlotPlanServiceImpl implements SlotPlanService {
    private final SlotPlanRepository slotPlanRepository;
    @Override
    public SlotPlan createSlotPlan(SlotPlan slotPlan) {
        return slotPlanRepository.save(slotPlan);
    }

    @Override
    public SlotPlan updateSlotPlan(SlotPlan slotPlan) {
        return slotPlanRepository.save(slotPlan);
    }

    @Override
    public void deleteSlotPlan(Integer id) {
        slotPlanRepository.deleteById(id);
    }

    @Override
    public List<SlotPlan> fetchAllSlotPlans() {
        return slotPlanRepository.findAll();
    }

    @Override
    public Optional<SlotPlan> getMatchSlotPlan(Integer id) {
        return slotPlanRepository.findById(id);
    }

    @Override
    public List<SlotPlan> updateSlotPlanStatus(List<SlotPlan> slotPlans) {
        return slotPlanRepository.saveAll(slotPlans);
    }

    @Override
    public List<SlotPlan> getFirstTenSlotPlanForNextReservation() {
        return null;
    }
}
