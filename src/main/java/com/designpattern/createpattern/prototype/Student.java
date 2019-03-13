package com.designpattern.createpattern.prototype;

import java.io.*;

public class Student implements Serializable,Cloneable {
    public Student( ) { }
    public Student(String name, Integer age, String addr, Student gf) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.gf = gf;
    }

    private static final long serialVersionUID = 8703027563434375744L;
    private String name;//姓名
    private Integer age;//年龄
    private String addr;//地址
    private Student gf;//girlfriend

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String getAddr() { return addr; }
    public void setAddr(String addr) { this.addr = addr; }
    public Student getGf() { return gf; }
    public void setGf(Student gf) { this.gf = gf; }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", gf=" + gf +
                '}';
    }

    //深克隆
    public Object deepClone() throws IOException, OptionalDataException,
            ClassNotFoundException {
        // 将对象写到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        // 从流里读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());
    }

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Student gf = new Student("小芳", 18, "帝都", null);
        Student xiaoming = new Student("小明", 18, "帝都", gf);
        //浅克隆
        Student shallowCopy = (Student)xiaoming.clone();
        //浅克隆
        Student deeoCopy = (Student)xiaoming.deepClone();
        xiaoming.setName("小明同胞兄弟");
        gf.setName("小芳的闺蜜");
        System.out.println(shallowCopy);
        System.out.println(deeoCopy);

    }
}
