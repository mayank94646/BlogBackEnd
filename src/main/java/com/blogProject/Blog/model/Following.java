package com.blogProject.Blog.model;

import javax.persistence.*;

@Entity
public class Following {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int followingId;
    @ManyToOne
    private Users workingUser;

    public int getFollowingId() {
        return followingId;
    }

    public void setFollowingId(int followingId) {
        this.followingId = followingId;
    }

    public Users getWorkingUser() {
        return workingUser;
    }

    public void setWorkingUser(Users workingUser) {
        this.workingUser = workingUser;
    }

    public Users getFollowing() {
        return following;
    }

    public void setFollowing(Users following) {
        this.following = following;
    }

    @ManyToOne
    private Users following;


}
