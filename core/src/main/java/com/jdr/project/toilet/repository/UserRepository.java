package com.jdr.project.toilet.repository;

import com.jdr.project.toilet.entity.User;
import com.jdr.project.toilet.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户实体数据访问层
 *
 * @author zhoude
 * @date 2020/9/8 14:03
 */
@Repository
interface UserRepository extends BaseRepository<User, Long> {
}
