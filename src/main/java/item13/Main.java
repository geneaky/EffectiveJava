package item13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //cloneable 구현 후 복제 객체가 원본 객체와 같지 않음
//        PhoneNumber p1 = new PhoneNumber("1234");
//        System.out.println("p1.clone()!=p1 = " + (p1.clone()!=p1));
//
//        Stack stack = new Stack();
//        System.out.println("stack.clone()!=stack = " + (stack.clone()!=stack));
//
//
//        Integer[] test = {1,2,3,4};
//        HashTable ht = new HashTable(test);
//        HashTable tt = (HashTable) ht.clone();
//        //깊은 복사가 이루어 지지 않아 내부 참조 주소가 동일하게 나옴
//        System.out.println("ht.clone(). == ht.getBuckets() = " + (tt.getBuckets() == ht.getBuckets()));
//
//
//        NotClone nc = new NotClone("hi");
//        //NotClone cnt = nc.clone(); clone()메서드를 동작하지 않도록 재정의하여 하위 클래스에서 재정의하지 못하게 만들었다.

        //deepcopy시 복사 생성자나 복사 팩터리 방식으로 객체 복사하는 방법도 있다.
        
        
        Teacher teacher = new Teacher();
        Student student = new Student();
        System.out.println("student.clone().equals(student) = " + student.clone().equals(student));
        System.out.println("student==student.clone() = " + (student==student.clone()));

        System.out.println("teacher==teacher.clone() = " + (teacher==teacher.clone()));
        System.out.println("teacher.equals(teacher.clone()) = " + teacher.equals(teacher.clone()));
        teacher.studentList = new ArrayList<>();
        teacher.studentList.add(student);
        System.out.println("teacher.studentList==((Teacher)teacher.clone().studentList = " +
                teacher.studentList.equals(((Teacher)teacher.clone()).studentList));
        //분명 다른 객체인데 studentList는 논리적으로 동치

        Teacher otherTeacher = (Teacher) teacher.clone();

        otherTeacher.studentList.add(new Student());

        System.out.println("otherTeacher.studentList == teacher.studentList = " + (otherTeacher.studentList == teacher.studentList));
        System.out.println("otherTeacher.studentList.equals(teacher.studentList) = " + otherTeacher.studentList.equals(teacher.studentList));
        
        
        Teacher constructorTeacher = new Teacher();
        constructorTeacher.name = "teacher";
        constructorTeacher.age = 24;
        constructorTeacher.studentList.add(new Student());
        Teacher otherConstructorTeacher = new Teacher(constructorTeacher);

        System.out.println("otherConstructorTeacher.studentList == constructorTeacher.studentList = " + (otherConstructorTeacher.studentList == constructorTeacher.studentList));
        System.out.println("otherConstructorTeacher.studentList.equals(constructorTeacher.studentList) = " + otherConstructorTeacher.studentList.equals(constructorTeacher.studentList));

    }
}
