package ru.agavrilova.school;

public class Pupil implements Comparable<Pupil> {
    private Integer classNum;
    private String name;

    public Pupil(Integer classNum, String name) {
        this.classNum = classNum;
        this.name = name;
    }

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pupil value) {
        if (this.getClassNum() == value.getClassNum()){
            return this.getName().compareTo(value.getName());
        } else{
        return this.getClassNum() - value.getClassNum();
        }

    }

    @Override
    public String toString() {
        return "Pupil{" +
                "classNum=" + classNum +
                ", name='" + name + '\'' +
                '}';
    }
}
