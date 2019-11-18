package com.blogProject.Blog.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class MakeGroups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;
    private Date date;
    private String groupName;
    @ManyToOne
    private Users creator;
    @ManyToMany
    private List<Users> participants;

    public int getGroupId() {
        return groupId;
    }

    public List<Users> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Users> participants) {
        this.participants = participants;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Users getCreator() {
        return creator;
    }

    public void setCreator(Users creator) {
        this.creator = creator;
    }
}
