package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.SlotCategory;
import com.parking.lot.management.entity.SlotPlan;
import com.parking.lot.management.enums.Status;
import com.parking.lot.management.repository.SlotPlanRepository;
import com.parking.lot.management.service.SlotPlanService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
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

    @PersistenceContext
    EntityManager entityManager;

    public void generateSlotNumber() {

        String[] charArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j < 25; j++) {
                SlotPlan slotPlan = new SlotPlan();
                slotPlan.setStatus(Status.READY);
                slotPlan.setSlotCategoryId(entityManager.find(SlotCategory.class, 1));
                if (j == 10) {
                    slotPlan.setSlotCategoryId(entityManager.find(SlotCategory.class, 2));
                } else if (j == 20) {
                    slotPlan.setSlotCategoryId(entityManager.find(SlotCategory.class, 4));
                } else if (j == 24) {
                    slotPlan.setSlotCategoryId(entityManager.find(SlotCategory.class, 3));
                }
                slotPlan.setSlotInfo("Level-1");
                slotPlan.setSlotNumber(charArray[i] + charArray[j] + "-" + i + (j + 1));
                slotPlanRepository.save(slotPlan);
            }
        }
    }
}
