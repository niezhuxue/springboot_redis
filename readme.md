本项目是springboot集成redis,通过jedis来操作的模板项目。
jedis版本：3.0.1




其中设计的jedis操作redis的方式有三种：

第一种：直接通过jedis对象操作

第二种：通过静态方法，创建使用连接池的jedis工具类方法

第三种：先创建jedis连接池对象，并在启动是注入到context里面；
通过自动注解的方式，在工具类里面直接使用jedis连接池