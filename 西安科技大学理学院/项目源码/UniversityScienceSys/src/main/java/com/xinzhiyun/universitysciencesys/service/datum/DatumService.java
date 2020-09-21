package com.xinzhiyun.universitysciencesys.service.datum;

import com.xinzhiyun.universitysciencesys.pojo.datum.Datum;

import java.util.List;
import java.util.Map;

/**
 * 资源下载接口
 */
public interface DatumService {

    /**使用分页查找所有资源下载*/
    List<Datum> findDatumAll(Map<String, Object> map);

    /**查找所有资源下载总数*/
    int findDatumNum();

    /**根据资源下载编号查找查找资源下载*/
    Datum findDatumById(Integer datum_id);

    /**根据资源下载文件名查找查找资源下载*/
    Datum findDatumByFileName(String file_name);

    /**根据资源下载类别查找查找资源下载*/
    List<Datum> findDatumByType(Map<String, Object> map);

    /**根据资源下载编号修改资源下载*/
    Integer updateDatumById(Datum datum);

    /**增加资源下载*/
    Integer addDatum(Datum datum);

    /**根据编号删除资源下载*/
    Integer deleteDatumById(Integer datum_id);
}
