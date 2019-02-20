class A {

    public void add() {
        sout("添加");
    }

    public void remove();

}

class ProxyA {

    public void add() {
        sout("添加");
        sout("记录日志");
    }

}

---------------------------------------------------

A a;

ProxyA a;

---------------------------------------------------
OOP:面向对象编程
AOP:面向切面编程

    连接点：
        类中的所有方法

    切入点：
        类中的具体方法

    目标对象：

    代理对象：

    增强：
        扩展代码

    织入：
        把【增强】应用到【目标对象】产生【代理对象】的过程

    切面：
        【切入点】 & 【增强】 的结合

---------------------------------------------------
Spring & Mybatis 整合

1、
    mybtais.jar
    mysql-connector.jar
    c3p0.jar

    mybatis-spring.jar



SqlSessionFactory = SqlSessionFactoryBuile().build("")

SqlSessionFactory  ---  SqlSessionFactoryBean
SqlSession         ---  SqlSessionTemplate


























