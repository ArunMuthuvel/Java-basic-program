 class Vehicle
{
       void vehicle_details()
           {
             System.out.println("Moving");
            }



}
class Car extends Vehicle
{
       void car_details()
          {
            int wheel=4;
            String start="self start";
            System.out.println( wheel);
            System.out.println(start);
           }
}
class bike extends Vehicle
{
       void bike_details()
          {
            int wheel=2;
            String start="kick start";
            System.out.println( wheel);
            System.out.println(start);



          }

}
 public class Inheritance
  {
   public static void main(String[]args)
       {
        Car scorpio=new Car();
        scorpio.vehicle_details();
        scorpio.car_details();
        bike duke=new bike();
        duke.vehicle_details();
        duke.bike_details();


       }



  }





