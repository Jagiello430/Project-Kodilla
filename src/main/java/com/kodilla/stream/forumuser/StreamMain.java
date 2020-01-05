package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> listAfterFilter = forum.listWithUser.stream()
                .filter( x -> x.getSex() != 'F')
                .filter(x -> x.getBirthday().getYear()<2000)
                .filter(x -> x.getNumberOfPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUniqueUserID, x -> x));
        System.out.println(listAfterFilter);
    }
}
