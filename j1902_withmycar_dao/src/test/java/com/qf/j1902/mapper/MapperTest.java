package com.qf.j1902.mapper;


import com.qf.j1902.pojo.admin.AdminUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.j1902.mapper")
public class MapperTest {
    @Autowired
    private AdminUserMapper adminUserMapper;
    @Test
    public void findall(){
        List<AdminUser> all = adminUserMapper.findAll();
        for (AdminUser a:all){
            System.out.println(a);
        }
    }
}
