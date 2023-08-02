package com.nareshit.niranjana.main;
	
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.collections4.ListUtils;

import com.google.common.collect.Lists;

public class SplitList_Into_OwnChunkSize
{
	public static void main(String[] args) throws UnsupportedOperationException
	{
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		System.out.println("List of Array data: "+list);
		int partitionSize = 4;
		
		//process 1: Using Guava
        List<List<Integer>> partition = Lists.partition(list, partitionSize);//Here we use guava-r05.jar
        System.out.println("chunk of slitted Array data :"+partition);
        
        //process 2: Using Apache Commons Collections
        List<List<Integer>> partitions = ListUtils.partition(list, partitionSize);
        System.out.println("chunk of slitted Array data :"+partitions);//Here we use commons-collections4-4.4.jar
        
        //process 3:Using List.subList() method using Java 8 Stream API:
        List<List<Integer>> partitionss = new ArrayList<>();
        for (int i = 0; i < list.size(); i += partitionSize) 
        {
            partitionss.add(list.subList(i, Math.min(i + partitionSize,list.size())));
        }
        System.out.println("chunk of slitted Array data :"+partitionss);
        
      //process 4: using Java 8 Stream API:
        //call slpittedAsPartition() static method
        List<List<Integer>> partitionsss = slpittedAsPartition(list, partitionSize);
        System.out.println("chunk of slitted Array data :"+partitionsss);    
	}//main method close
	
	private static <T> List<List<T>> slpittedAsPartition(List<T> collection, int partitionSize)
    {
        return IntStream.rangeClosed(0, (collection.size() - 1) / partitionSize)
                .mapToObj(i -> collection.subList(i * partitionSize,
                    Math.min((i + 1) * partitionSize, collection.size())))
                .collect(Collectors.toList());
    }
}
