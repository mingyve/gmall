package com.zmy.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.ums.entity.MemberProductCategoryRelation;
import com.zmy.gmall.ums.mapper.MemberProductCategoryRelationMapper;
import com.zmy.gmall.ums.service.MemberProductCategoryRelationService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
public class MemberProductCategoryRelationServiceImpl extends ServiceImpl<MemberProductCategoryRelationMapper, MemberProductCategoryRelation> implements MemberProductCategoryRelationService {

}
