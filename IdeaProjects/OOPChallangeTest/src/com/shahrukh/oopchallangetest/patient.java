package com.shahrukh.oopchallangetest;

public class patient {
    private String name;
    private  int age;
    private eye leftEye;
    private eye rightEye;
    private heart heart;
    private stomach stomach;
    private skin skin;

    public patient(String name, int age, eye leftEye, eye rightEye, com.shahrukh.oopchallangetest.heart heart, com.shahrukh.oopchallangetest.stomach stomach, com.shahrukh.oopchallangetest.skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public eye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(eye leftEye) {
        this.leftEye = leftEye;
    }

    public eye getRightEye() {
        return rightEye;
    }

    public void setRightEye(eye rightEye) {
        this.rightEye = rightEye;
    }

    public com.shahrukh.oopchallangetest.heart getHeart() {
        return heart;
    }

    public void setHeart(com.shahrukh.oopchallangetest.heart heart) {
        this.heart = heart;
    }

    public com.shahrukh.oopchallangetest.stomach getStomach() {
        return stomach;
    }

    public void setStomach(com.shahrukh.oopchallangetest.stomach stomach) {
        this.stomach = stomach;
    }

    public com.shahrukh.oopchallangetest.skin getSkin() {
        return skin;
    }

    public void setSkin(com.shahrukh.oopchallangetest.skin skin) {
        this.skin = skin;
    }
}
