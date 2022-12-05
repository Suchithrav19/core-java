import java.io.*;
import java.util.*;
class Anagram
{
static int no_of_chars=256;
static boolean areAnagram(char str1[],char str2[])
{
int count1[]=new int[no_of_chars];
Arrays.fill(count1,0);
int count2[]=new int[no_of_chars];
Arrays.fill(count2,0);
int i;
for(i=0;i<str1.length && i<str2.length;i++)
count1[str1[i]]++;
count1[str2[i]]++;
}
if(str1.length!=str2.length)
return false;
  for(i=0;i<no_of_chars;i++)
  if(count1[i]!=count2[i])
  return false;
  return true;
  }
  
  public static void main(Stringargs[])
  {
  char str1[]=("gram").toCharArray;
  char str2[]=("arm").toCharArray();
  if(areAnagram(str1,str2))
  System.out.println("the two strings are" + "anagram of each other");
  else
    System.out.println("the two strings are are" + "anagram of each other");
  }
  }
  
  
