## FirstMapReduceApp

**Problem** : We are given a details of player with their score in each match. We need to find out total runs scored by a player.

**Dataset** : The dataset is a tab separated file with the below details

you can find the dataset inside resources folder. First upload this to your HDFS then try running this code.

| Plaayer Name | Run | Ball Faced | 6s | 4s | Time | Average |
| ------ | ------ | ------ | ------ | ------ | ------ | ------ |
| D.A.Warner | 6 | 11 | 0 | 1 | 8 | 75.00 |
| E.J.M.Cowan | 4 | 21 | 0 | 1 | 13 | 30.77 |
| P.J.Hughes | 19 | 84 | 0 | 4 | 57 | 33.33 |

To run this code
```sh
$ hadoop jar FirstMapReduceApp.jar <hdfs_input_directory> <hdfs_output_directory>
```

#### Setting number of Reducers explicitly
If we set 4 reducer, then it will create 4 files as output.

To merge all the output files to a single file store in local file system, run
```sh
$ hadoop fs -getmerge <hdfs_source_directory> <local_destination)directory>
```

If we are setting numbers of reducers to zero, then the mapper output will be the final output.

If we are not specifying the Reducer class, then it will use the default reducer, called Identity Reducer.
output of run :

If we are not specifying the Mapper class, then it will use the default mapper, called Identity Mapper.
output of run :

