package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.SlotCategory;
import com.parking.lot.management.entity.SlotPlan;
import com.parking.lot.management.enums.Status;
import com.parking.lot.management.repository.SlotCategoryRepository;
import com.parking.lot.management.repository.SlotPlanRepository;
import com.parking.lot.management.service.SlotPlanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class SlotPlanServiceImpl implements SlotPlanService {
    private final SlotPlanRepository slotPlanRepository;
    private final SlotCategoryRepository slotCategoryRepository;

    @Override
    public void createSlotPlan() {
        generateSlotNumber();
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


    public void generateSlotNumber() {
        List<SlotPlan> slotPlans = new ArrayList<>();
        String[] charArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j < 25; j++) {
                SlotPlan slotPlan = new SlotPlan();
                slotPlan.setStatus(Status.READY);
                SlotCategory slotCategory1 = slotCategoryRepository.findById(1)
                        .orElseThrow(RuntimeException::new);
                SlotCategory slotCategory2 = slotCategoryRepository.findById(2)
                        .orElseThrow(RuntimeException::new);
                SlotCategory slotCategory3 = slotCategoryRepository.findById(3)
                        .orElseThrow(RuntimeException::new);
                SlotCategory slotCategory4 = slotCategoryRepository.findById(4)
                        .orElseThrow(RuntimeException::new);
                slotPlan.setSlotCategory(slotCategory1);
               if (j == 10) {
                    slotPlan.setSlotCategory(slotCategory2);
                } else if (j == 20) {
                    slotPlan.setSlotCategory(slotCategory3);
                } else if (j == 24) {
                    slotPlan.setSlotCategory(slotCategory4);
                }
                slotPlan.setSlotInfo("Level-1");
                slotPlan.setSlotNumber(charArray[i] + charArray[j] + "-" + i + (j + 1));
                slotPlans.add(slotPlan);
            }
        }
        slotPlanRepository.saveAll(slotPlans);
        //System.out.println(slotPlans);
    }
}
