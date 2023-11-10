package com.parking.lot.management.utils;

import com.parking.lot.management.entity.SlotCategory;
import com.parking.lot.management.entity.SlotPlan;
import com.parking.lot.management.enums.Status;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.List;

public class SlotNumberGenerator {

    @PersistenceContext
    static EntityManager entityManager;

    public static void main(String[] args) {
        System.out.println(generateSlotNumber());
    }

    public static List<SlotPlan> generateSlotNumber() {

        List<SlotPlan> slotPlans = new ArrayList<>();
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
                slotPlans.add(slotPlan);
            }
        }
        return slotPlans;
    }
}
