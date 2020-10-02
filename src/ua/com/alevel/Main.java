package ua.com.alevel;

import ua.com.alevel.controller.StudentController;
import ua.com.alevel.oop.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();
        Mersedes mersedes = new Mersedes();
        mersedes.setType("mersedes S-class");
        list.add(mersedes);
        LandRover landRover1 = new LandRover();
        landRover1.setType("landRover RangeRover");
        landRover1.setYear(2019);
        System.out.println("landRover1 = " + landRover1.getYear());
        list.add(landRover1);
//        LandRover landRover2 = new LandRover(2020);
//        landRover2.setType("landRover RangeRover2");
//        System.out.println("landRover2 = " + landRover2.getYear());
//        list.add(landRover2);
        LandRover landRover3 = new LandRover(2021, "landRover RangeRover3");
        System.out.println("landRover3 = " + landRover3.getYear());
        list.add(landRover3);
        for (Car process : list) {
            System.out.println("getType = " + process.getType());
        }

//        StudentController controller = new StudentController();
//        controller.runConsole();
    }
}
