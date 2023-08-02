package com.nareshit.niranjana.main;


//public class SplitString_Into_OwnChunkSize 
//{
//	public static void main(String[] args) {
//        String s = "ABCDEFGHIJKLMNO";
//        int chunkSize = 5;
//        Iterable<String> chunks = Splitter.fixedLength(chunkSize).split(s);
//        System.out.println(Arrays.asList(chunks));  //OUTPUT: doesnot working(getting object)
//    }
//}

//===================================================================================
//Process 1: using String.split() method 

//import java.util.Arrays;
//public class SplitString_Into_OwnChunkSize
//{
//    public static void main(String[] args) {
//        String s = "ABCDEFGHIJKLMNO";
//        int chunkSize = 3;
// 
//        String[] chunks = s.split("(?<=\\G.{" + chunkSize + "})");
//        System.out.println(Arrays.toString(chunks));
//    }
//}
//==============================================================================

//Process 2: Using String.substring() method

//import java.util.ArrayList;
//import java.util.List;
//public class SplitString_Into_OwnChunkSize
//{
//    public static List<String> split(String s, int chunkSize) 
//    {
//        List<String> chunks = new ArrayList<>();
//        for (int i = 0; i < s.length(); i += chunkSize) 
//        {
//            chunks.add(s.substring(i, Math.min(s.length(), i + chunkSize)));
//        }
//        return chunks;
//    }
//    public static void main(String[] args) 
//    {
//        String s = "ABCDEFGHIJKLMNO";
//        int chunkSize = 4;
//        System.out.println(split(s, chunkSize));
//    }
//}
//===================================================================
//Process 3: Using Stream API
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class SplitString_Into_OwnChunkSize
{
    public static List<String> split(String s, int chunkSize) {
        return IntStream.iterate(0, i -> i < s.length(), i -> i + chunkSize)
                .mapToObj(i -> s.substring(i, Math.min(s.length(), i + chunkSize)))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNO";
        int chunkSize = 2;
        System.out.println(split(s, chunkSize));
    }
}