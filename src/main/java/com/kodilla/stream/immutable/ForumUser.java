package com.kodilla.stream.immutable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ForumUser {
    private final String userName;
    private final String realName;
    private final Date birthDate;
    private final List<String> friends;

    public ForumUser(final String userName, final String realName, final int yearsOfBirthday,
                     final int monthOfBirthday, final int dayOfMonth,final ArrayList <String> friends) {
        this.userName = userName;
        this.realName = realName;
        this.birthDate = new Date(yearsOfBirthday,monthOfBirthday,dayOfMonth);
        this.friends = friends;
    }
    public String getUserName() {
        return userName;
    }
    public String getRealName() {
        return realName;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public ArrayList<String> getFriends() {
        return (ArrayList<String>) friends;
    }
}