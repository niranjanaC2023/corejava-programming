package com.nit.sisu.sh.methods;
/*
//retrieve duplicate number
public class DuplicateElement
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1,2,1,3,2,3,5,6,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				System.out.println(arr[j]);
			}
		}
	}
}
*/
//retrieve duplicate character
public class DuplicateElement
{
	public static void main(String[] args)
	{
		String s1 = "susanta";
		char ch[] = s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(ch[i]==ch[j])
				System.out.println(ch[j]);
			}
		}
	}
}

/*
public class DuplicateElement {
 public static void main(String argu[]) {

  String str = "w3schools";
  int cnt = 0;
  char[] inp = str.toCharArray();
  System.out.println("Duplicate Characters are:");
  for (int i = 0; i < str.length(); i++) {
   for (int j = i + 1; j < str.length(); j++) {
    if (inp[i] == inp[j]) {
     System.out.println(inp[j]);
     cnt++;
     break;
    }
   }
}
}
}
*/