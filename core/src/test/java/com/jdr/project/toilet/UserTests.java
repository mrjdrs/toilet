package com.jdr.project.toilet;

import com.jdr.project.toilet.common.enums.PitTypeEnum;
import com.jdr.project.toilet.entity.Toilet;
import com.jdr.project.toilet.service.biz.interfaces.IUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {

    @Autowired
    private IUser user;

    @Test
    public void testGenerateIdea() {
        List<PitTypeEnum> pitTypes = user.generateIdea();
        pitTypes.forEach(item -> System.out.println(item.getDesc()));
    }

    @Test
    public void findToilet() {
        List<Toilet> toilet = user.findToilet(user.generateIdea());
        System.out.println(toilet);
    }

}
