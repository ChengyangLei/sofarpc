# sofarpc
蚂蚁金服高性能 Java RPC 框架


1.使用idea 新建springboot项目。

2.Spring Boot 的 parent 依赖，改为 SOFABoot 提供的 parent 依赖。
  <parent>
    <groupId>com.alipay.sofa</groupId>
    <artifactId>sofaboot-dependencies</artifactId>
    <version>3.0.0</version>
  </parent>

3.配置 application.properties。
  spring.application.name=AppName
  
4.引入 RPC Starter依赖。
  <dependency>
     <groupId>com.alipay.sofa</groupId>
     <artifactId>rpc-sofa-boot-starter</artifactId>
  </dependency>
  
5.在resources下新建rpc-sofa-boot-starter-samples.xml文件，配置服务端和客户端的服务。

6.修改SofarpcApplication。

7.启动，控制台打印sync。
