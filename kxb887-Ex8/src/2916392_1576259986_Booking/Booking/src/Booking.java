/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Booking {
    private String room;
    private Date date;
    private int hour;
    private String purpose;
    public Booking(String _room, Date _date, int  _hour, String  _purpose){
        this.room=_room;
        this.date=_date;
        this.hour=_hour;
        this.purpose=_purpose;
    }
    public String getRoom(){
        return room;
    }
    public void setRoom(String _room){
        room=_room;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date _date){
        date=_date;
    }
    public int getHour(){
        return hour;
    }
    public void setPurpose(String _purpose){
        purpose=_purpose;
    }
    public String getPurpose(){
        return purpose;
    }
}
