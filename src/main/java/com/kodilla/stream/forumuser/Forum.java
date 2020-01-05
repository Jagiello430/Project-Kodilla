package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public List<ForumUser> listWithUser = new ArrayList<>();

    public Forum() {

        listWithUser.add(new ForumUser(0, "Jan222", 'M',
                    2002, 2, 23, 2));
        listWithUser.add(new ForumUser(1, "Janex25", 'M',
                    1994, 5, 3, 16));
        listWithUser.add(new ForumUser(2, "GeraldZRivi", 'M',
                    1218, 5, 6, 0));
        listWithUser.add(new ForumUser(3, "Jana", 'F',
                    1985, 2, 28, 26));
        listWithUser.add(new ForumUser(4, "Joanna", 'F',
                    1920, 6, 27, 28));
        listWithUser.add(new ForumUser(5, "Wioletta", 'F',
                    2005, 7, 20, 0));
    }
}

