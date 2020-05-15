import java.util.ArrayList;

public class PhoneBookDemo{
    public static void main(String [] args){

        // Create at least five PhoneBookEntry objects
        PhoneBookEntry Lisa = new PhoneBookEntry();
        Lisa.setName("Lisa");
        Lisa.setNumber("202-555-0121");
        PhoneBookEntry John = new PhoneBookEntry();
        John.setName("John");
        John.setNumber("202-555-0122");
        PhoneBookEntry Anne = new PhoneBookEntry();
        Anne.setName("Anne");
        Anne.setNumber("202-555-0162");
        PhoneBookEntry Dave = new PhoneBookEntry();
        Dave.setName("Dave");
        Dave.setNumber("202-555-0146");
        PhoneBookEntry Jill = new PhoneBookEntry();
        Jill.setName("Jill");
        Jill.setNumber("202-555-0103");

        // Store objects in an ArrayList
        ArrayList <String> nameList = new ArrayList <String> (); //Array to hold names
        ArrayList <String> numberList = new ArrayList <String> (); //Array to hold numbers

        nameList.add(Lisa.getName());
        numberList.add(Lisa.getNumber());

        nameList.add(John.getName());
        numberList.add(John.getNumber());

        nameList.add(Anne.getName());
        numberList.add(Anne.getNumber());

        nameList.add(Dave.getName());
        numberList.add(Dave.getNumber());

        nameList.add(Jill.getName());
        numberList.add(Jill.getNumber());

        // Use a loop to display the contents of each object in the ArrayList

        System.out.println("Name:         Number:");
        System.out.println("_________     ____________");
        for (int i = 0; i < nameList.size(); i++)
        {
            System.out.printf("%2s          %s\n",nameList.get(i),numberList.get(i));
        }

    }
}