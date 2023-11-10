package com.parking.lot.management.service;

import com.parking.lot.management.entity.SlotPlan;

import java.util.List;
import java.util.Optional;

public interface SlotPlanService {
    void createSlotPlan();
    //SlotPlan createSlotPlan(SlotPlan slotPlan);

    SlotPlan updateSlotPlan(SlotPlan slotPlan);

    void deleteSlotPlan(Integer id);

    List<SlotPlan> fetchAllSlotPlans();

    Optional<SlotPlan> getMatchSlotPlan(Integer id);

    List<SlotPlan> updateSlotPlanStatus(List<SlotPlan> slotPlans);

    List<SlotPlan> getFirstTenSlotPlanForNextReservation();

}
