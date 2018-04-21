## FirstMapReduceApp

Problem : We are given a details of player with their score in each match. We need to find out total runs scored by a player.

Dataset : The dataset is a tab separated file with the below details

| Plaayer Name | Run | Ball Faced | 6s | 4s | Time | Average |
| ------ | ------ | ------ | ------ | ------ | ------ | ------ |
| D.A.Warner | 6 | 11 | 0 | 1 | 8 | 75.00 |
| E.J.M.Cowan | 4 | 21 | 0 | 1 | 13 | 30.77 |
| P.J.Hughes | 19 | 84 | 0 | 4 | 57 | 33.33 |

To run this code
```sh
$ hadoop jar FirstMapReduceApp.jar <hdfs_input_directory> <hdfs_output_directory>
```
