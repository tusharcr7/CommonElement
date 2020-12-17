import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String a[]={"1","w","e","r","y","4"};
  String b[]={"g","fg"};
  System.out.println(checkIfAnyCommon(a,b));
  }

public static Boolean checkIfAnyCommon(String a[], String b[])
{
  boolean stat= false;
 HashSet<String> set=new HashSet<>(Arrays.asList(a));

for(String h:b)
{
if(!set.add(h))
{
stat=true;
break;
}
}
  return stat; 
}
}