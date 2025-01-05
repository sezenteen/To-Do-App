package com.example.todo.Task.model;

import jakarta.persistence.Entity;
import org.w3c.dom.Text;

import java.util.Date;

@Entity
public class Note extends BaseEntity {
    private String note;

    private Date date;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
