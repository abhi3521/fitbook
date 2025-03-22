package Service;

import Entity.Slot;

import java.util.Date;
import java.util.List;

public interface AdminInterface {
    public String addSlot(Slot slot);
    public List<Slot> getAllSlots();
    public List<Slot> getSlotsByDate(Date date);
}
