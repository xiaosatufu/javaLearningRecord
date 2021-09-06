package com.homework.homework13;

public class homework {
    public static void main(String[] args) {
        Student student = new Student("小明",'男',15,"000110001");
        student.printInfo();
        Teacher teacher = new Teacher("张飞", '女', 50, 5);
        teacher.printInfo();

        Person[] persons = new Person[4];
        persons[0] = new Student("jack",'男',10,"0001");
        persons[1] = new Student("mary",'女',20,"0002");
        persons[2] = new Teacher("smith",'男',36,1);
        persons[3] = new Teacher("scott",'男',26,5);
//        homework.bubbleSort(persons);

        homework homework = new homework();
        homework.bubbleSort(persons);
        System.out.println("排序后的数组");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }

    public void bubbleSort(Person[] persons){
        Person temp = null;
        for (int i = 0; i < persons.length-1; i++) {
            for (int j = 0; j < persons.length-i-1; j++) {
                if(persons[j].getAge()<persons[j+1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }
    }
}


