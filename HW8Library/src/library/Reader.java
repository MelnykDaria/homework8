package library;

public class Reader {

    private String fullName;
    private String faculty;
    private String phone;
    private String birthday;

    public Reader(String fullName, String faculty, String phone, String birthday) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.phone = phone;
        this.birthday = birthday;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void takeBook(int count) {

        System.out.println(fullName + " взял " + count + " book");
    }

    public void returnBook(int count) {

        System.out.println(fullName + " return " + count + " book");
    }
    public void takeBook(Book...books) {

        System.out.println(fullName + " взял: "  );

        for (Book book : books) {
            System.out.println(book.getTitle());

        }
    }

    public void returnBook(Book...books) {

        System.out.println(fullName + " отдал: "  );

        for (Book book : books) {
            System.out.println(book.getTitle());

        }
    }
}

