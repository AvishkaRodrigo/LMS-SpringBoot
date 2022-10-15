package com.springboot.LMS_Backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resourceID;
    private String name;
    private String addedOn;
    private String link;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "course_id", nullable = true)
    private Course course;

    public Resource(int resourceID, String name, String addedOn, String link) {
        this.resourceID = resourceID;
        this.name = name;
        this.addedOn = addedOn;
        this.link = link;
    }


}
