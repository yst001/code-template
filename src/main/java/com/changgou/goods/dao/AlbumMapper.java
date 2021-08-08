package com.changgou.goods.dao;
import com.changgou.goods.pojo.Album;
import tk.mybatis.mapper.common.Mapper;
import org.springframework.stereotype.Repository;

/****
 * @Author:shenkunlin
 * @Description:Album的Dao
 * @Date 2019/6/14 0:12
 *****/
@Repository
public interface AlbumMapper extends Mapper<Album> {
}
