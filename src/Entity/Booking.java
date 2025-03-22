package Entity;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    private Long id;
    private User user;
    private Slot slot;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Slot getSlot() {
        return slot;
    }
}
