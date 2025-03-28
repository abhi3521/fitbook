package Entity;

import lombok.*;

@Data
@Getter
@Setter

@NoArgsConstructor
public class Centre {
    private long id;
    private String name;
    private String location;

    public Centre(long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
