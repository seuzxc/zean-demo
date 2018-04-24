- 设计模式
指的是针对某些特定类型的问题，长期以来形成的比较成熟的解决方法。

- 针对涉及模式主要的点
  
  - 使用涉及模式需要考虑需求上下文，考虑问题是否适合，不能把设计模式当做一个教条，遇到问题及想着设计模式解决
  - 同上一条，不用到处都用设计模式，什么都想着往设计模式套路
    (If all you have is a hammer, everything looks like a nail.)

- 分类
  
  - 创建型( creational )    能够高效灵活可复用的创建对象 
     - 工厂方法模式(Factory Method): 在父类提供接口创建对象，子类可以改变创建的对象的类型 
       工厂方法模式体现了面向对象变成中的“针对接口后编程而不是针对实现”原则，将具体的实现和调用者隔离
       优点：对象的创建都是在自己的子类实现的，某一个需要创建的对象改变不会影响其他的对象，符合“开闭原则”
       缺点：如果创建的对象类别很多，慢慢的会有很多的子类进行继承维护，慢慢的会比较麻烦。
       
     - 抽象工厂模式(abstract factory)：创建一组相关的对象，在工厂类中定义创建多个对象的方法
       和工厂方法有类似之处，不过抽象工厂是针对一系列的关联对象，而工厂方法针对的是单个的对象。
     - 构建者模式(builder)：能够使用同样的构建过程创建对象的不同表示。
       在对象比较复杂的时候（比如需要很多可选的属性设置），通过builder pattern 可以方便灵活的构建出对象
       ```
       eg apache httpcomponents-client配置信息就用到了builder模式，构建过程显得清晰简洁
       RequestConfig requestConfig = RequestConfig.custom()
                          .setSocketTimeout(1000)
                          .setConnectTimeout(1000)
                          .build();
       ```
     - 原型模式(prototype): 可以通过copy一个已经存在的对象来创建新的对象
     - 单例模式(Singleton): 创建只实例化一次的对象
     
     ```text
        可以看出创建型的模式创建时符合：
        1) 面向接口编程
        2) 开放/封闭原则
     ```
  - 结构型(Structural)
    构建简单高效的类结构以及他们之间的关系
    - 适配器：通过对一个已存在的类进行接口封装，使得两个不兼容的类可以一起协作
      Spring 中就用到了很多adapter，比如DispatcherServlet中处理请求时
      对不同的请求使用不同的adapter进行出来（HandlerAdapter）
      其目的一般是为了利用不兼容的已有服务，而又不修改已有的代码（可以新增代码）
    - 桥接模式(bridge): 将抽象和实现分开，从而可以使得两个抽象和实现独立的变化
    - 组合模式(composite): 将对象组成树形结构以表示“部分-整体”的层次结构，
      可是使得用户对单个对象和组合对象的使用具有一致性   
    - 装饰者模式(decorator): 通过将对象放到包装对象里面可以使对象获得一些额外的行为特性
      该模式在jdk中也有应用（Java IO：InputStream BufferedInputStream,FileInputStream etc.）
    - 外观模式(facade): 为子系统中一组接口提供一个统一的接口。
      简化对外接口(复杂的东西留着子系统内部，对外看起来只是简单的必须的接口)
    - 享元模式(flyweight): 通过共享的技术以支持更多细粒度的对象
     （减少重复的数据，从而在有大量对象时减少内存的消耗）
    - 代理模式(proxy) 为其他对象提供一种代理以控制对这个对象的访问
  - 行为型( Behavioral)   
    高效安全的实施程序对象间的行为
    - 责任链模式(Chain of responsibility): 将一个请求的发送者和接受者解耦，
    从而可以使多个接受者处理这个请求（所有接受者以链式连接，请求沿着链进行，知道有一个处理它）
    -命令模式(Command): 将一个请求封装为一个对象，从而使你可以用不同的请求对客户端进行参数化;
    对请求排序，记录请求日志。同时支持可撤销的操作
   
     




















参考
======    
https://springframework.guru/gang-of-four-design-patterns/
https://refactoring.guru/design-patterns/chain-of-responsibility