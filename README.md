# 智慧物业
最终项目展示如下
![image](https://github.com/a2433616623/Smart-property/assets/85396953/9d8cec57-2e31-4848-a184-bf98eac0742c)

# 项目描述
本项目由springboot制作而成
项目文件在com文件夹里面
包含了static静态文件（网页文件）

也包含了整合mybatis数据库的文件

pom.xml配置了本项目的所有依赖

# 项目架构
本项目采用了三层架构
Model-View-Controller 即 模型-视图-控制器 模式

本项目还有其他的文件夹，分别代表着不同的层
**common：**

这个包通常用于存放项目中通用的类、工具类、常量等。这些类或工具可能在整个项目中多次使用，因此将它们放在这里可以使代码更加整洁和易于维护。
**controller：**

在MVC（Model-View-Controller）架构中，控制器负责处理用户的请求和返回响应。通常，每个控制器类都对应一个或多个URL路径，并处理与该路径相关的HTTP请求。
**dao (Data Access Object)：**

DAO层负责与数据库进行交互。它包含用于查询、插入、更新和删除数据库记录的方法。DAO层通常与实体类（通常在domain包中）一起使用，以执行数据库操作。
**domain (或 model 或 entity)：**

这个包包含项目的实体类，这些类通常映射到数据库中的表。每个实体类通常包含私有字段、构造函数、getter和setter方法，以及与这些字段相关的其他业务逻辑。
**exception：
**
这个包用于存放项目中自定义的异常类。当业务逻辑中发生特定错误时，可以抛出这些异常。这有助于更好地处理错误，并使代码更具可读性。
**service：**

服务层包含业务逻辑代码。它通常调用DAO层的方法来执行数据库操作，并可能调用其他服务来执行其他业务逻辑。服务层将应用程序的业务逻辑与底层的数据访问逻辑分开，使代码更加模块化和可维护。
