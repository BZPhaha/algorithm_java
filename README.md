# algorithm_java  
Algorithm implemented by Java.   
address:https://github.com/BZPhaha/algorithm_java  
基于java实现一些常用算法。  
**时间复杂度**：  
常数阶O(1):循环次数和n无关  
对数阶O(logN):循环次数和n相关，while(i<n){i= i * 2}   
线性阶O(n):循环次数和n相关，for(i=0;i<n;i++)  
线性对数阶O(mlogN):for(i=0;i<m;i++){while(i<n){i= i * 2}}  
平方阶O(n²):for(i=0;i<n;i++){for(j=0;j<n;j++){}}  
立方阶O(n³):类似O(n²)  
K次方阶O(n^k):类似O(n²)  
**空间复杂度**：  
常数阶O(1):占据的空间和n无关。  
线性阶O(n):占据的空间和n相关，int[] m = new 
**各个排序算法**
名称	 最优	 平均 	最坏	 内存   稳定  
冒泡排序	n 	n^2 	n^2	1	Yes  
插入排序	n	n^2	n^2	1	Yes  
选择排序	n^2	n^2	n^2	1	No  
堆排序	n log(n)	n log(n)	n log(n)	1	No  
归并排序	n log(n)	n log(n)	n log(n)	n	Yes  
快速排序	n log(n)	n log(n)	n^2	log(n)	No  
希尔排序	n log(n)	取决于差距序列	n (log(n))^2	1	No    

:laughing:
