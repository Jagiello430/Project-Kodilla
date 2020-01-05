package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int uniqueUserID;
    private final String userName;
    private final char sex;
    private final LocalDate birthday;
    private final int numberOfPublishedPosts;

    public ForumUser(final int uniqueUserID, final String userName,final char sex,
                     final int yearOfBirthday, final int monthOfBirthday,final
                     int dayOfMonth,final int numberOfPublishedPosts){
        this.uniqueUserID = uniqueUserID;
        this.userName = userName;
        this.sex = sex;
        this.birthday = LocalDate.of(yearOfBirthday, monthOfBirthday,dayOfMonth);
        this.numberOfPublishedPosts = numberOfPublishedPosts;
    }

    public int getUniqueUserID() {
        return uniqueUserID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueUserID=" + uniqueUserID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", numberOfPublishedPosts=" + numberOfPublishedPosts +
                '}';
    }
}
