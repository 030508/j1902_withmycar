package com.qf.j1902.mapper;


import com.qf.j1902.pojo.admin.AdminMenu;
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
    private  AdminMenuMapper adminMenuMapper;
    @Autowired
    private AdminUserMapper adminUserMapper;
    /*@Test
    public void findall(){
        List<AdminUser> all = adminUserMapper.findAll();
        for (AdminUser a:all){
            System.out.println(a);
        }
    }*/
    @Test
    public void findall2(){

        List<AdminUser> all = adminUserMapper.findAll(1,3);
        for (AdminUser a:all){
            System.out.println(a);
        }
    }
    @Test
    public void tete(){
        AdminUser oneByName = adminUserMapper.findOneByName("admin");
        System.out.println(oneByName);
    }

    @Test
    public void qwqw(){
        List<AdminMenu> admin = adminMenuMapper.findAdminMenusByUserName("admin");
        for (AdminMenu menu: admin){
            System.out.println(menu);
        }
    }

}
