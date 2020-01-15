package com.kodilla.testing.forum.statistic;

import java.util.List;
import java.util.stream.Collectors;

public class StatisticCounting {
    Statistic statistic;

    public StatisticCounting(Statistic statistic){
        this.statistic = statistic;
    }
    public Integer quantityUser(){
        List<String> name = statistic.usersNames().stream()
                .map(n -> n.concat(String.valueOf(statistic.usersNames())))
                .collect(Collectors.toList());
        return name.size();
    }
    public Integer quantityPost(){
        Integer quantityAllPost = statistic.postsCount();
        return quantityAllPost;
    }
    public Integer quantityCommit(){
        Integer quantityAllCommit = statistic.commentsCount();
        return quantityAllCommit;
    }
    public double averageOfPostPerUser(){
        return quantityUser()/quantityPost();
    }
    public double averageOfCommitPerUser(){
        return quantityUser()/quantityCommit();
    }
    public double averageOfCommitPerPost(){
        return quantityPost()/quantityCommit();
    }
    public void calculateAdvStatics(Statistic statistic){


    }
    public void showStatistic(){
        quantityUser();
    }
}
