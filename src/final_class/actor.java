/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_class;

/**
 *
 * @author hilbe
 */
public class actor {
String name;
String Date_of_Birth;
String place_of_birth;
String occupation;
int active_years;
String spouse;
String children;
String activities;
String awards;
void playing()
{
    System.out.println("Actors will Play");
}
void acting()
{
    System.out.println("Actors will Act");
}
}
class Malayalam_actor extends actor
{
    Malayalam_actor()
    {
       super.name="Mohanlalal"; 
       super.place_of_birth="Kerala";
    }
    Malayalam_actor(String name1,String place)
    {
       super.name=name1;
       super.place_of_birth=place;
    }
   String actor_state;
   void actor_state()
   {
      System.out.println("Actor state is Kerala"); 
   }
   void actor_state(String state)
   {
     System.out.println("Actor state is "+ state);  
   }
   void acting()
   {
       System.out.println("Malayalam actor will act well");
   }
}