package Repository;

import Entity.Slot;
import Entity.User;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import Enum.WorkoutType;

public class SlotRepo {
    private Map<Long, Slot> slotMap = new HashMap<>();
    public void saveSlot(Slot slot) {
        slotMap.putIfAbsent(slot.getId(), slot);
    }

    public List<Slot> getAllSlots() {
        return slotMap.values()
                .stream()
                .collect(Collectors.toList());

    }

    public List<Slot> getSlotsByDate(Date date) {
        return slotMap.values()
                .stream()
                .filter(slot -> slot.getStartTime().equals(date))
                .collect(Collectors.toList());

    }
}
