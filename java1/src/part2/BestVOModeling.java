package part2;

import model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO vo = new MovieVO("아바타", 20221214, "제이크 셜리", "액션", 100.0f, 12);
        System.out.println("vo = " + vo);
        System.out.println("vo.getLevel = " + vo.getLevel());
    }
}
