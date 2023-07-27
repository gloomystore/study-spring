import part1.object.Book;

// 책: 제목, 가격, 출판사, 저자, 페이지수, isbn
public class BookTest {
    public static void main(String[] args) {
        // Book 객체 인스턴스 생성
        Book b = new Book();
        b.title = "자바";
        b.price = 30000;
        b.company = "대영컴퍼니";
        b.author = "대영";
        b.page = 700;
        b.isbn= "1199110";
    }
}
