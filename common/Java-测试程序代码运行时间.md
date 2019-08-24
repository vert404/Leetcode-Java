**第一种是以毫秒为单位计算的**。
```
long startTime=System.currentTimeMillis();   //获取开始时间  
doSomeThing();  //测试的代码段  
long endTime=System.currentTimeMillis(); //获取结束时间  
System.out.println("程序运行时间： "+(endTime-startTime)+"ms");  
```

**第二种是以纳秒为单位计算的**。
```
long startTime=System.nanoTime();   //获取开始时间  
doSomeThing();  //测试的代码段  
long endTime=System.nanoTime(); //获取结束时间  
System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
```

