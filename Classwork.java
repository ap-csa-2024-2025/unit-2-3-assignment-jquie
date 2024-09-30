//FirstLastN
public class Classwork
{
  public static void main(String[] args)
  {
    String word = FirstlastN("dictionary", 3);
    System.out.println(word);
    word = delEnd("computer", 5);
    System.out.println(word);
  }

  public static String FirstlastN(String s, int n)
  {
    String output = s.substring(0, n);
  
    int endingIndex = s.length() - n;
    String output2 = s.substring(endingIndex);
    return (output + output2);
  }

  public static String delEnd(String s, int n)
  {
    int stoppingIndex = s.length() - n;
    String output = s.substring(0, stoppingIndex);
    return output;
  }

// ComparingLowerCase 
  public static String compareLower(String s, String i)
  {
    
  }
}
