package com.changgou.goods.dao;
import com.changgou.goods.pojo.UndoLog;
import tk.mybatis.mapper.common.Mapper;
import org.springframework.stereotype.Repository;

/****
 * @Author:shenkunlin
 * @Description:UndoLog的Dao
 * @Date 2019/6/14 0:12
 *****/
@Repository
public interface UndoLogMapper extends Mapper<UndoLog> {
}
