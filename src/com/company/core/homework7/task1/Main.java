package com.company.core.homework7.task1;

import com.company.core.homework7.task1.robots.CoffeeRobot;
import com.company.core.homework7.task1.robots.Robot;
import com.company.core.homework7.task1.robots.RobotCoocker;
import com.company.core.homework7.task1.robots.RobotDancer;

public class Main {
    public static void main(String[] args) {
        Robot Valli = new Robot();
        CoffeeRobot Smeg = new CoffeeRobot();
        RobotDancer bambelbi = new RobotDancer();
        RobotCoocker chappi = new RobotCoocker();

        Robot[] arrayRobots = {Valli, Smeg, bambelbi, chappi};

        for (Robot robot : arrayRobots) {
            robot.work();
        }
    }
}
