package com.sentinel.smarter.modules.pelita.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity
@Table(name="sarana_kalender_minggu")
@Immutable
public class MeansCalendarWeekView {
    @Id
    private Long ID;
    private String title;
    private String start;
    private String end;

    public Long getID() {
        return ID;
    }

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
