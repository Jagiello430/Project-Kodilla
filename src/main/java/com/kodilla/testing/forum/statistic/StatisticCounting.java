package com.kodilla.testing.forum.statistic;

import java.util.ArrayList;
import java.util.List;

public class StatisticCounting {
    Statistic statistic;

    public StatisticCounting(Statistic statistic){
        this.statistic = statistic;
    }
    public double quantityUser(){
        int quantityAllUser = statistic.usersNames().size();
        return quantityAllUser;
    }
    public double quantityPost(){
        int quantityAllPost = statistic.postsCount();
        return quantityAllPost;
    }
    public double quantityCommit(){
        int quantityAllCommit = statistic.commentsCount();
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
    public List <Double> calculateAdvStatics(Statistic statistic){
        List <Double> listOfMethods = new ArrayList<>();
        listOfMethods.add((double)quantityUser());
        listOfMethods.add((double)quantityPost());
        listOfMethods.add((double)quantityCommit());
        listOfMethods.add(averageOfPostPerUser());
        listOfMethods.add(averageOfCommitPerUser());
        listOfMethods.add(averageOfCommitPerPost());
        return new ArrayList<>(listOfMethods);
    }
    public List<Double> showStatistic(){
        return calculateAdvStatics(statistic);
    }
}
