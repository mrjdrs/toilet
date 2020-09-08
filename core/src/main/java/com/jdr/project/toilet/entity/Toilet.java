package com.jdr.project.toilet.entity;

import com.jdr.project.toilet.common.enums.ToiletTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * 厕所实体类
 *
 * @author zhoude
 * @date 2020/9/7 17:59
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "t_toilet_paper_towel")
@Table(name = "t_toilet_paper_towel")
public class Toilet extends BaseEntity {

    /**
     * 厕所类型
     * {@link ToiletTypeEnum}
     */
    @Column(name = "type")
    private Integer type;

    /**
     * 厕所楼层
     */
    @Column(name = "floor")
    private Integer floor;

    /**
     * 此厕所拥有的坑位
     */
    @OneToMany(targetEntity = Pit.class)
    @JoinColumn(name = "pits", referencedColumnName = "id")
    private Set<Pit> pits;

    /**
     * 管理人
     */
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "admin", referencedColumnName = "id")
    private User admin;

}
