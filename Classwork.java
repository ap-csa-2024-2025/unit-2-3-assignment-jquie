//FirstLastN
public class Classwork
{
  public static void main(String[] args)
  {
    String word = FirstlastN("dictionary", 3);
    System.out.println(word);
  }

  public static String FirstlastN(String s, int n)
  {
    int startingIndex = s.length() - n;
    String output = s.substring(0, startingIndex);
  
    int endingIndex = s.length() - n;
    String output2 = s.substring(endingIndex, s.length());
    return(output + output2);
  }

//DelEnd
  {
    String word = delEnd("computer", 5);
    System.out.println(word);
  }

  public static String delEnd(String s, int n)
  {
    int stoppingIndex = s.length() - n;
    String output = s.substring(0, stoppingIndex);
    return output;
  }

}
