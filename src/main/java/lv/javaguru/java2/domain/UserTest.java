package lv.javaguru.java2.domain;

/**
 * This is sparta
 */
public class UserTest {

    public static void main (String[] args) {

        User us = UserBuilder.createUser().withFirstName("Ivan").withLastName("Ivanov").build();
        System.out.println(us.getFirstName());
        System.out.println(us.getLastName());
    }

}
