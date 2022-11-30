public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Александр";
        post.passport = "8800 № 55535350";
        post.patronymic = "Андреевич";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Морозов";
        post.subscription = "true";
        var birthday = new FormDate();
        birthday.day = 17;
        birthday.month = 8;
        birthday.year = 1996;
        post.birthday = birthday;
    }
}