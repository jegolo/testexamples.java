package de.lostuxos.testexamples.approvals;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class SampleDTOTest {

    private static class Person {
       private String name;
       private String firstname;
       private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public Person(String name, String firstname, String age) {
            this.name = name;
            this.firstname = firstname;
            this.age = age;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }

    @Test
    public void testDto() {
        Person person = new Person("Mustermann", "Max", "15");

        Approvals.verify(person);
    }
}
