package com.sentinel.smarter.modules.pelita.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="pesan_kalender_bulan")
@Immutable
public class OrderCalendarMonthView {
    @Id
    private String title;
    private String start;
    private String end;

    public String getTitle() {
        return title;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }
}
