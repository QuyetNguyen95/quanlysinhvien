/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapquanlysinhvien;

/**
 *
 * @author Nguyen Cuong Quyet
 */
public class DayOff {
    private int id;
    private int id_student;
    private String dayoff;

    public DayOff() {
    }

    public DayOff(int id, int id_student, String dayoff) {
        this.id = id;
        this.id_student = id_student;
        this.dayoff = dayoff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getDayoff() {
        return dayoff;
    }

    public void setDayoff(String dayoff) {
        this.dayoff = dayoff;
    }
    
}
