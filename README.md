## springcloud-config

### 介绍

> Spring Cloud Config项目是一个解决分布式系统的配置管理方案。它包含了Client和Server两个部分，server提供配置文件的存储、以接口的形式将配置文件的内容提供出去，client通过接口获取数据、并依据此数据初始化自己的应用。


### 使用


依次运行 springcloud-config-eureka、springcloud-config-server和springcloud-config-config。启动成功之后，在浏览器输入 `http://localhost:8080/` 进行查看相关信息！



**Git配置文件读取测试**

在 `springcloud-config-server`项目中的**application.properties** 将 `spring.cloud.config.server.git` 配置的信息填写完成，然后启动程序。

启动成功之后在浏览器输入:
>  http://localhost:8081/configtest/word

或

 > http://localhost:8081/configtest-pro.properties

即可查看配置的读取信息！

