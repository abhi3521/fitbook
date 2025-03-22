package Entity;

import java.sql.Time;
import Enum.WorkoutType;
import lombok.AllArgsConstructor;
import lombok.Data;
import Enum.WorkoutType;

@Data
public class Slot {
    private long id;
    private Centre centre;
    private String date;
    private String startTime;
    private String endTime;
    private WorkoutType workoutType;
    private int seats;

    public Slot(long id, Centre centre, String date, String startTime, String endTime, WorkoutType workoutType, int seats) {
        this.id = id;
        this.centre = centre;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.workoutType = workoutType;
        this.seats = seats;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setWorkoutType(WorkoutType workoutType) {
        this.workoutType = workoutType;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public long getId() {
        return id;
    }

    public Centre getCentre() {
        return centre;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public WorkoutType getWorkoutType() {
        return workoutType;
    }

    public int getSeats() {
        return seats;
    }



}
