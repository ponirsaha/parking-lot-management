package com.parking.lot.management.controller;

import com.parking.lot.management.entity.SlotPlan;
import com.parking.lot.management.service.SlotPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/slot-plan")
public class SlotPlanController {

    private final SlotPlanService slotPlanService;

    @PostMapping("/create")
    public void createSlotPlan() {
        slotPlanService.createSlotPlan();
    }

    @PutMapping("/update")
    public SlotPlan updateSlotPlan(@RequestBody SlotPlan slotPlan) {
        return slotPlanService.updateSlotPlan(slotPlan);
    }

    @DeleteMapping("/{id}")
    public void deleteSlotPlan(@PathVariable Integer id) {
        slotPlanService.deleteSlotPlan(id);
    }

    @GetMapping("/get-all")
    public List<SlotPlan> fetchAllSlotPlans() {
        return slotPlanService.fetchAllSlotPlans();
    }

    @GetMapping("/get-one")
    public Optional<SlotPlan> getMatchSlotPlan(Integer id) {
        return slotPlanService.getMatchSlotPlan(id);
    }

    @PostMapping("/update-status")
    public List<SlotPlan> updateSlotPlanStatus(@RequestBody List<SlotPlan> slotPlans) {
        return slotPlanService.updateSlotPlanStatus(slotPlans);
    }

    @PostMapping("/get-first-ten")
    public List<SlotPlan> getFirstTenSlotPlanForNextReservation() {
        return slotPlanService.getFirstTenSlotPlanForNextReservation();
    }
}
