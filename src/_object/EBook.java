package _object;

public class EBook {

    private int bookTypeId;
    private String title;
    private String author;

    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    // toString() 메서드 재정의

    @Override
    public String toString() {
        return  "bookTypeId" + bookTypeId + "title : " + title + "author : " + author;
    }

    // equals() 메서드 재정의

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof EBook){
            if(this.title.equals(((EBook) obj).title) && this.author.equals(((EBook) obj).author)){
                return  true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }

    // hashCode() 메서드 재정의
    @Override
    public int hashCode() {
        return bookTypeId;
    }


    public static void main(String[] args) {

        EBook eBook = new EBook(1,"제목","저자");

    }
}
