import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("Student");
        System.out.println(student.getId());
        System.out.println(student.getName());

        Phone number = student.getPh().get(0);
        System.out.println(number.getMob());

        Address h = student.getAdd();
        System.out.println(h.getCity());
        System.out.println(h.getCountry());
        System.out.println(h.getState());
        System.out.println(h.getZipCode());
    }
}
