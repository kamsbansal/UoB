/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

/**
 *
 * @author Xxxxx
 */
public class Booking {

    public Booking(Date date, String roomId, int hour, String purpose) {
        this.date = date;
        this.roomId = roomId;
        this.hour = hour;
        this.purpose = purpose;
    }

    private Date date;

    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the value of date
     *
     * @param date new value of date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    private String roomId;

    /**
     * Get the value of roomId
     *
     * @return the value of roomId
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * Set the value of roomId
     *
     * @param roomId new value of roomId
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    private int hour;

    /**
     * Get the value of hour
     *
     * @return the value of hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * Set the value of hour
     *
     * @param hour new value of hour
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    private String purpose;

    /**
     * Get the value of purpose
     *
     * @return the value of purpose
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Set the value of purpose
     *
     * @param purpose new value of purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

}
