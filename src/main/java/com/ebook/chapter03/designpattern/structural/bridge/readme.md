曾经项目中遇到这样一个问题：
给前端提供了一些认证接口(v1版本)实现方式是：

```java
interface AuthorizationService{
    autoStep1();
    autoStep2();
    autoStep3();
}
class AuthorizationImpl implements AutorizationService{
    authStep1(){coreService.step1();}
    authStep2(){coreService.step2();}
    authStep3(){coreService.step2();}
}


class CoreService{
    step1();
    step2();
    step3();
}


```

现在应为一些原因，需要使用V2版本的接口，coreService只是做了些细微的变化，只是调用的参数做了些变化，可是呢V1版本和V2版本又必须同时存在(历史兼容问题)
第一感觉想到的实现方式是：
在AuthorizationService接口增加方法
```java
interface AuthorizationService{
    /****v1***/
    authStep1();
    authStep2();
    authStep3();
    
    /****v2***/
    authStep1V2();
    authStep2V2();
    authStep3V2();
}
```

然后实现类也跟着修改，再然后就是改CoreService;其实这种接口改变实现类也改变捆绑严重的方式维护起来挺麻烦的。是不是在最开始实现的时候就使用桥接模式呢?
```java
abstract class Authorization{
    
    CoreService coreService;
    authStep1();
    authStep2();
    authStep3();
}


class AuthorizationImplV1 extends Authorization{
        CoreService coreService1;
        authStep1(){coreService1.auth1();}
        authStep2(){coreService1.auth2();}
        authStep3(){coreService1.auth3();}
}

class AuthorizationImplV2 extends Authorization{
    CoreService coreService2;//CoreServiceV2
    authStep1(){coreService2.auth1();}
    authStep2(){coreService2.auth2();}
    authStep3(){coreService2.auth3();}
}

interface CoreService{
    auth1();
    auth2();
    auth3();
}

class CoreServiceV1 implements CoreService{
    
}

class CoreServiceV2 implements CoreService{
    
}

```

怎样一来Client调用Authorization的接口不需要改变，可以在AuthorizationImplV1/V2 和CoreServiceV1/V2中独立修改逻辑

