package part2;

import model.StudentVO;

public class StudentArrayTest {
    public static void main(String[] args) {
        StudentVO[] students = new StudentVO[4];
        students[0] = new StudentVO("홍길동1",15,"컴퓨터공학","dd@nad.com",3,"010-1111-1111");
        students[1] = new StudentVO("홍길동2",15,"컴퓨터공학","dd@nad.com",3,"010-1111-1111");
        students[2] = new StudentVO("홍길동3",15,"컴퓨터공학","dd@nad.com",3,"010-1111-1111");
        students[3] = new StudentVO("홍길동4",15,"컴퓨터공학","dd@nad.com",3,"010-1111-1111");
        for(int i=0;i<students.length;i++) {
            System.out.println("student = " + students[i]);
        }

        for( StudentVO st : students) {
            System.out.println("st = " + st);
        }

    }

}
