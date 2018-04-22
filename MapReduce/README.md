# MapReduce

### Partitioner


### Combiner
* Combiner is a mini reducer, which can be run at the mapper side.
* Combiner logic in equivalant to reducer logic.
*Combiner class can be written in the same way we write Reducer class. i.e. by extending Reducer<> class overriding reduce() method
* If Aggregation follows Associative rule, then we can use the Reduce class itself as the combiner class.
* myJob.setCombinerClass(Combiner/Reducer class name)
* Though we mention Combiner class, it is not guranteed to execute for each map task.


### Scheduling (Job Scheduler)

