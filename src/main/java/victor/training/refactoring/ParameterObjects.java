package victor.training.refactoring;

public class ParameterObjects {
   public static void main(String[] args) {
      ParameterObjects target = new ParameterObjects();
      FullName fullName = new FullName("John", "Doe");
      target.placeOrder(fullName, "St. Albergue", "Paris", 99);
   }

   public void placeOrder(FullName fullName, String city, String streetName, Integer streetNumber) {
      if (fullName.getFirstName() == null || fullName.getLastName() == null) throw new IllegalArgumentException();

      System.out.println("Some Logic");
      System.out.println("Shipping to " + city + " on St. " + streetName + " " + streetNumber);

   }

}
//   class OrderRequest {} // too specific. Only usable in this workflow
//   class PlaceOrderRequest {} // too specific. Only usable in this workflow
//class Customer {} // too  vague. many developers will have ideas on what to add to this class
//class Name // silly. incorrect. company name doesnt have a first name
//class PersonName // too specific : user might also have first and last name
class FullName {
   private final String firstName;
   private final String lastName;

   FullName(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }

   public String getLastName() {
      return lastName;
   }

   public String getFirstName() {
      return firstName;
   }
}


class AnotherClass {
   public void otherMethod(String firstName, String lastName, int x) {
      if (firstName == null || lastName == null) throw new IllegalArgumentException();

      System.out.println("Another distant Logic " + x);
      System.out.println("Person: " + lastName);
   }
}

class Person {
   private Long id;
   private String firstName;
   private String lastName;
   private String phone;

   public Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
      if (firstName == null || lastName == null) throw new IllegalArgumentException();
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   // TODO hard-core: implement setter
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }
}

class PersonService {
   public void f(Person person) {
      String fullNameStr = person.getFirstName() + " " + person.getLastName().toUpperCase();
      System.out.println(fullNameStr);
   }

   public void p(String city, String streetName, Integer streetNumber) {
      System.out.println("Living in " + city + " on St. " + streetName + " " + streetNumber);
   }
}