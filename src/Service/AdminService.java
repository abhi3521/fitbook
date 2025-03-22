package Service;

import Entity.Slot;
import Repository.SlotRepo;

import java.util.Date;
import java.util.List;

public class AdminService implements AdminInterface{
    SlotRepo slotRepo;

    public AdminService(SlotRepo slotRepo) {
        this.slotRepo = slotRepo;
    }

    @Override
    public String addSlot(Slot slot) {
        slotRepo.saveSlot(slot);
        return "slot added Successfully";
    }

    @Override
    public List<Slot> getAllSlots() {
        return slotRepo.getAllSlots();
    }

    @Override
    public List<Slot> getSlotsByDate(Date date) {
        return slotRepo.getSlotsByDate(date);
    }


}
