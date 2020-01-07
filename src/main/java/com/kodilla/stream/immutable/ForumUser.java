package com.kodilla.stream.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ForumUser {
    private final String userName;
    private final String realName;
    private final Date birthDate;
    private final List<ForumUser> friends;

    public ForumUser(final String userName, final String realName, final int yearsOfBirthday,
                     final int monthOfBirthday, final int dayOfMonth) {
        this.userName = userName;
        this.realName = realName;
        this.birthDate = new Date(yearsOfBirthday,monthOfBirthday,dayOfMonth);
        friends = new ArrayList<>();
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
        return new ArrayList<>();
    }
}