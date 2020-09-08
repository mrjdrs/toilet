package com.jdr.project.toilet.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 坑位实体层
 *
 * @author zhoude
 * @date 2020/9/7 17:59
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "t_toilet_pit")
@Table(name = "t_toilet_pit")
public class Pit extends BaseEntity {

    /**
     * 坑位类型
     * {@link com.jdr.project.toilet.common.enums.PitTypeEnum}
     */
    @Column(name = "price")
    private Integer price;

    /**
     * 所属厕所
     */
    @ManyToOne(targetEntity = Toilet.class)
    @JoinColumn(name = "parentToilet",referencedColumnName = "id")
    private Toilet parentToilet;

    /**
     * 占有用户
     */
    @ManyToOne(targetEntity = Toilet.class)
    @JoinColumn(name = "occupied_user",referencedColumnName = "id")
    private User occupiedUser;

}
