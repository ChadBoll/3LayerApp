package com.example.a3layerapp;

/**
 * Created by Chad on 10/16/2017.
 */

public class Team {
    private String name;
    private String Stats;

    public static final Team[] workouts = {
            new Team("The Limb Loosener",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Team("Core Agony",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Team("The Wimp Special",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Team("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    //Each Workout has a name and description
    private Team(String name, String Stats) {
        this.name = name;
        this.Stats = Stats;
    }

    public String getStats() {
        return Stats;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }

}
