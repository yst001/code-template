# code-template
代码生成器，基于MySQL+Freemarker

使用只需要修改application.properties文件即可，可以参考阅读`resource.使用说明`

使用快速生成代码，使用过程中如果路径中有中文会出现问题

解决方案：https://blog.csdn.net/WinstonLau/article/details/90205141

推荐使用博客中的方案二解决

---

2021.08.08修改

+ 修改application.properties乱码
+ 解决路径中出现中文后的乱码报错问题
+ 重写mapper.java模板，给每个mapper添加@Repository注解
