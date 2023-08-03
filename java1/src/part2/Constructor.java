package part2;

import model.PersonVO;

public class Constructor {
    public static void main(String[] args) {
        // Q. 생성자 메소드를 통해 PersonVO 객체에 이름 나이 전화번호를 저장하고 출력
        PersonVO vo = new PersonVO("name!!",1,"00000000");
        System.out.println(vo.getName());
    }
}
