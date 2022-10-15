package com.springboot.LMS_Backend.model;

import javax.persistence.*;


@Entity
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resourceID;
    private String name;
    private String addedOn;
    private String link;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "course_id", nullable = true)
    private Course course;

    public Resource(int resourceID, String name, String addedOn, String link) {
        this.resourceID = resourceID;
        this.name = name;
        this.addedOn = addedOn;
        this.link = link;
    }

    public Resource() {
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(String addedOn) {
        this.addedOn = addedOn;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


}
