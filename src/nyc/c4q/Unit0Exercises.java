package nyc.c4q;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Unit0Exercises {
    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     * additional information in the comments of each method
     */
    public static void main (String args[]) {
        // Use main to test your methods
        print();
    }

    public static void print() {
        // print out "I'm sorry Dave, I'm afraid I can't let you do that."
        System.out.println("I'm sorry Dave, I'm afraid I can't let you do that.");
    }

    public static boolean returnPrimitiveBooleanFalse()
    {
        return false;
    }

    public static int returnPrimitiveInt55Plus44() {
        int fiveFivePlusFourFour=55+44;
        return fiveFivePlusFourFour;
    }

    public static double returnPrimitiveDouble2Point718() {
        double twoPoint718=2.718;
        // This is the start of a famous mathematical constant.
        // What's that constant?
        return twoPoint718;
    }

    public static char returnPrimitiveCharASCII35() {
        char ascii35='#';
        // What's the character for the ASCII number 35?
        // Look at an ASCII table and return that character.
        // You can look at the ASCII table at http://www.asciitable.com/
        return ascii35;
    }

    public static boolean isEven(int n)
    {
        if (n % 2==0){
            return true;
        }
        else
        return false;
    }

    public static boolean isMultipleOfX(int n, int x) {
        if (n==0){
            return true;
        }
        if (n % x ==0){
            return true;
        }
        else

        // 0 is a multiple of every number (except 0)
        // For example:
        //      isMultipleOfX(0, 3) == true
        //      isMultipleOfX(1, 3) == false
        //      isMultipleOfX(3, 3) == true
        //      isMultipleOfX(10, 3) == false
        //      isMultipleOfX(28, 7) == true
        // TODO expect a ArithmeticException in Test with x==0
        return false;
    }

    public static int returnSumOfOddNumbersBetween1And100() {
        int num=0;
        for (int i=0;i<=100;i++)
        {
            if(i % 2 != 0)
            {
                num += i;
            }
        }
        // Starts with [1, 3, 5, ...]
        // Ends with   [..., 95, 97, 99]
      return num;
    }

    public static int returnSumOfTheFirst200MultiplesOf3() {
        int num=0;
        for (int i=0;i<=597;i++){
            if (i % 3==0){
                num+=i;
            }

        }
        // Starts with [0, 3, 6, ...]
        // Ends with   [..., 591, 594, 597]
      return num;
    }

    public static boolean isEmptyString(String str) {
        if(str==""){
            return true;
        }
        else
        return false;
    }

    public static String alternateS1AndS2Xtimes(String s1, String s2, int x) {
        String updated="";
        for(int i=0;i<x;i++){
            if(x==0)
            {
                updated = "";
            }
            else
                updated+=s1+s2;

            }

        // Given string `s1`, `s2` and a positive integer `x`,
        // return a string that is equal to s1 + s2 repeated x times.
        // If x is 0 or negative negative, return an empty string `""`.
        // For example:
        //      alternateS1AndS2Xtimes("abra", "cadabra", 0).equals("") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 1).equals("abracadabra") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 2).equals("abracadabraabracadabra") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 3).equals("abracadabraabracadabraabracadabra") == true
        return updated;
    }

    public static String stringSplit(String s, String splitOn) {
        String updateStr="";
        if(!s.contains(splitOn)){
            updateStr="";
        }
        else
        {
            for(int i = 0; i < s.length(); i++)
            {
                if(s.contains(splitOn) && s.charAt(i) == splitOn.charAt(0))
                {
                    break;
                }
                else updateStr += s.charAt(i);
            }
            // Given string s, return a string that stops at the first occurrence of "split".
            // For example:
            //      stringSplit("ubiquitous", "q").equals("ubi") == true
            //      stringSplit("hellogoodbye", "good").equals("hello") == true
            //      stringSplit("fancy seeing you", "there").equals("") == true
            // If the string does not contain split, then return the empty string "".
        }
        return updateStr;
    }

    public static Singer returnBeyonce() {
        Singer beyonce=new Singer("Beyonce","USA");
        //beyonce.setName("Beyonce");
        //beyonce.setLocation("USA");

      // should return an instance of Singer with the name "Beyonce" and location "USA"
      return beyonce;
    }

    public static Singer returnSingerChild(Singer s1, Singer s2) {

        Singer childSinger=new Singer(s1.getName(),s2.getLocation());
        //if(s1==null||s2==null){
            //childSinger=(null);

      // should return an instance of Singer with the name of s1 and the location of s2.
      // For example:
      //      Singer queenB = new Singer("Beyonce", "USA");
      //      Singer rihanna = new Singer("Rihanna", "Barbados");
      //      returnSingerChild(queenB, rihanna) ==> returns an instance of Singer with name "Beyonce" and location "Barbados".
      return childSinger;
    }

    public static HashMap<String, Singer> returnSingers() {
        HashMap<String, Singer> returnSingers= new HashMap<String, Singer>();
        Singer beyonce=new Singer("Beyonce", "USA");
        returnSingers.put(beyonce.getName(),beyonce);
        Singer jayZ=new Singer("Jay-Z", "USA");
        returnSingers.put(jayZ.getName(),jayZ);
        Singer bieber=new Singer("Bieber","Canada");
        returnSingers.put(bieber.getName(),bieber);
        Singer drake=new Singer("Drake", "Canada");
        returnSingers.put(drake.getName(),drake);
        Singer jepsen= new Singer("Jepsen","Canada");
        returnSingers.put(jepsen.getName(),jepsen);

        // should return a HashMap of the following singers:
        //      key="Beyonce",  Singer(name="Beyonce", location="USA")
        //      key="Jay-Z",    Singer(name="Jay-Z",   location="USA")
        //      key="Bieber",   Singer(name="Bieber",  location="Canada")
        //      key="Drake",    Singer(name="Drake",   location="Canada")
        //      key="Jepsen",   Singer(name="Jepsen",  location="Canada")
        return returnSingers;
    }

    public static boolean isFromCanada(Singer person) {

        if (person.getLocation()=="Canada")
        {
            return true;
        }
        else
            return false;

    }

    public static void changeJayZsLocationToLosAngeles(HashMap<String, Singer> people) {
        if(people.containsKey("Jay-Z")){
            people.get("Jay-Z").setLocation("Los Angeles");
        }
        // people will have the values of the `returnSingers()` method you filled in previously.
        // the city should be set to "Los Angeles"
        // old value of Jay-Z:
        //      Singer(name="Jay-Z",   location="USA")
        // new value of Jay-Z:
        //      Singer(name="Jay-Z",   location="Los Angeles")
    }

    public static void removeJepsenFromSingers(HashMap<String, Singer> people){
        if(people.containsKey("Jepsen")){
            people.remove("Jepsen");
        }
        // people will have the values of the `returnSingers()` method you filled in previously.
        // old keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake", "Jepsen"]
        // new keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake"]

    }

    // Bonus Problems
    public static void readFileAndOnlyPrintCanadianCelebrities() {
        // TODO Use Apache Commons CSV and provide boilerplate for reading the file
        // https://commons.apache.org/proper/commons-csv/
      try {
        FileReader fr = new FileReader("celebrities.csv");
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }

    public static void readFileAndPrintCelebrityAges(){
        // TODO similar as above
    }
}
