package annotation.dao;


import org.springframework.stereotype.Repository;


//相当于@Repository, 但是如果在Service层中使用@Resource("testDao"),那么testDao不能省略
@Repository("testDao")

public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("实现了testdao的save方法");
    }


}
