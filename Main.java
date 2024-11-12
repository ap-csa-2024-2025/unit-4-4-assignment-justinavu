import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    p2("Peter Piper picked a pack of pickle peppers.");
    //p1("Peter Piper picked a pack of pickle peppers.");
  }

  public static void p2(String a)
  {
    String letters = "etaio";
    String ans = "";
    for (int i = 0; i < a.length(); i++)
    {
      if (!letters.contains(a.substring(i, i+1)))
      {
        ans += a.substring(i, i+1);
      }
    }
    System.out.println(ans);
  }
  public static void p1(String a)
  {
  int count = 0;
  for (int i = 0; i < a.length()-1; i++)
  {
  String pair = a.substring(i, i+2);
  pair = pair.toLowerCase();
  if (pair.equals("pa") || pair.equals("pe") || pair.equals("pi") || pair.equals("po") || pair.equals("pu"))
  {
    count++;
  }
  }
  System.out.println("Contains p followed by a vowel " + count + " times.");
  }
}
