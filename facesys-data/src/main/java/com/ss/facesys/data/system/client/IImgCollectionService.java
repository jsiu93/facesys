package com.ss.facesys.data.system.client;

import com.ss.exception.ServiceException;
import com.ss.facesys.data.system.common.model.ImgCollection;

import java.util.List;

/**
 * IImgCollectionService
 *
 * @author FrancisYs
 * @date 2020/2/18
 * @email yaoshuai@ss-cas.com
 */
public interface IImgCollectionService {

    List<ImgCollection> pages(ImgCollection query, int currentPage, int pageSize);

    String remove(ImgCollection imgCollection) throws ServiceException;

}