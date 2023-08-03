package part2;

import model.PersonVO;

public class Constructor {
    public static void main(String[] args) {
        // Q. 생성자 메소드를 통해 PersonVO 객체에 이름 나이 전화번호를 저장하고 출력
        PersonVO vo = new PersonVO("name!!",1,"00000000");
        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
        
        // toString은 생략가능함. js에서는 [Object]로 뜨겠지만...java는 아닌듯
        System.out.println(vo.toString());
        System.out.println(vo);
    }
}
