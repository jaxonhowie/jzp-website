package com.jzp.dao;

import com.jzp.model.SteamApi;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Hongyi Zheng
 * @date 2018/12/20
 */
@Mapper
public interface SteamApiDao {

    List<SteamApi> queryAll();

    void delAll();

    void insertSelective(SteamApi steamApi);

    SteamApi selectByName(String name);

    void updateSelective(SteamApi steamApi);

    List<SteamApi> queryAllIgnoreDel();
}
