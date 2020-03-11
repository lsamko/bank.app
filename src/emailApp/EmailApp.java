package emailApp;

public class EmailApp {

    public static void main(String[] args) {

        Email em1 = new Email("John", "Smith");
//        em1.setMailBoxCapacity(65);
//        System.out.println(em1.getMailBoxCapacity());

        System.out.println(em1.showInfo());
    }
}
