package ru.agavrilova;

import ru.agavrilova.school.Pupil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Pupil p1 = new Pupil(9, "Иванов");
        Pupil p2 = new Pupil(10, "Петров");
        Pupil p3 = new Pupil(11, "Сидоров");
        Pupil p4 = new Pupil(9, "Григорьев");
        Pupil p5 = new Pupil(9, "Сергеев");
        Pupil p6 = new Pupil(10, "Яковлев");

        List<Pupil> listPupil = new ArrayList<>();
        listPupil.add(p1);
        listPupil.add(p2);
        listPupil.add(p3);
        listPupil.add(p4);
        listPupil.add(p5);
        listPupil.add(p6);
        Collections.sort(listPupil);

  //      System.out.println(listPupil);

        for (Pupil value : listPupil) {
            System.out.println(value.getClassNum() + " " + value.getName());
        }
    }
}
