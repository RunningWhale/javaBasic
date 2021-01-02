第一个SpringMVC项目，用户在页面发起请求，请求交给SpringMVC控制器对象，并显示处理的请求结果
实现步骤：
1、新建web maven工程
2、加入依赖
    spring-webmvc依赖，会间接地把spring依赖加入到项目
    jsp，servlet依赖
3、web.xml中注册springmvc框架的核心对象DispatcherServlet
4、创建发起请求的页面index.jsp
5、创建控制器类
    在类上加@Controller注解，创建对象，并放入springmvc容器中
    在类方法上加入@RequestMapping注解
6、创建一个作为结果的jsp,显示请求处理结果
7、创建springmvc配置文件
    声明组件扫描器，指定@Controller注解所在包名
    声明视图解析器