package com.sangeng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sangeng.domain.entity.Menu;

import java.util.List;


/**
 * 菜单权限表(Menu)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-28 19:38:07
 */
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long userId);

    //查询超级管理员的路由信息(权限菜单)
    List<Menu> selectAllRouterMenu();
    //查询普通用户的路由信息(权限菜单)
    List<Menu> selectOtherRouterMenuTreeByUserId(Long userId);

    //修改角色-根据角色id查询对应角色菜单列表树
    List<Long> selectMenuListByRoleId(Long roleId);
}

