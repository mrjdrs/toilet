package com.jdr.project.toilet.service.biz.impl;

import com.jdr.project.toilet.common.enums.PitTypeEnum;
import com.jdr.project.toilet.common.strategy.UserIdea;
import com.jdr.project.toilet.entity.Toilet;
import com.jdr.project.toilet.repository.ToiletRepoService;
import com.jdr.project.toilet.service.biz.interfaces.IUser;
import com.jdr.project.toilet.service.bo.PaperTowelBO;
import com.jdr.project.toilet.service.bo.PitBO;
import com.jdr.project.toilet.service.bo.WashBasinBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 默认的用户行为实现
 *
 * @author zhoude
 * @date 2020/9/7 18:23
 */
@Service
@AllArgsConstructor
public abstract class AbstractUser implements IUser {

    private final ToiletRepoService toiletRepoService;

    /**
     * 默认的用户想法实现
     */
    @Override
    public List<PitTypeEnum> generateIdea() {
        return new UserIdea().generate().getPitType();
    }

    /**
     * 找到用户想法对应的可用坑位
     *
     * @param pitTypes 需要的坑位类型
     * @return 可用的坑位列表
     */
    @Override
    public List<Toilet> findToilet(List<PitTypeEnum> pitTypes) {
        return toiletRepoService.findAll().stream()
                .filter(toilet -> PitTypeEnum.convertCode(pitTypes).contains(toilet.getType()))
                .collect(Collectors.toList());
    }

    @Override
    public void lockTheDoor(PitBO pit) {

    }

    @Override
    public void restroom(PitBO pit) {

    }

    @Override
    public boolean wipeButt(PaperTowelBO paperTowel) {
        return false;
    }

    @Override
    public boolean flushTheToilet() {
        return false;
    }

    @Override
    public boolean handwashing(WashBasinBO washBasinBo) {
        return false;
    }

}
