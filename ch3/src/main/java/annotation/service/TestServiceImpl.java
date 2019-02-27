package annotation.service;


import annotation.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("testService") //相当于@Service()
public class TestServiceImpl implements TestService {


    @Resource(name = "testDao")
    private TestDao testDao;

    @Override
    public void save() {
        testDao.save();
        System.out.println("testService save");
    }
}
