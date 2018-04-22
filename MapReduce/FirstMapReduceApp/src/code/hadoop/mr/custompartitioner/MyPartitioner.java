package code.hadoop.mr.custompartitioner;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class MyPartitioner extends Partitioner<Text, IntWritable>{

    @Override
    public int getPartition(Text K, IntWritable V, int numberOfReducer) {
	
	return 2; // It will send the result only to reducer[2] -> part-r-00002
    }

}
