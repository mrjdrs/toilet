package com.jdr.project.toilet.repository;

import com.jdr.project.toilet.entity.Pit;
import com.jdr.project.toilet.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * 坑位实体数据访问层
 *
 * @author zhoude
 * @date 2020/9/8 14:03
 */
@Repository
interface PitRepository extends BaseRepository<Pit, Long> {
}
