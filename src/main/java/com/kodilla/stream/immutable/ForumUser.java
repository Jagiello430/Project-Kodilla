package com.kodilla.stream.immutable;

import java.util.Date;
import java.util.List;

public final class ForumUser {
    private final String userName;
    private final String realName;
    private final Date birthDate;
    private final List<ForumUser> friends;

    public ForumUser(final String userName, final String realName, final int yearsOfBirthday,
                     final int monthOfBirthday, final int dayOfMonth,final List<ForumUser> friends) {
        this.userName = userName;
        this.realName = realName;
        this.friends = friends;
        this.birthDate = new Date(yearsOfBirthday,monthOfBirthday,dayOfMonth);
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
    public List<ForumUser> getFriends() {
        return friends;
    }
}