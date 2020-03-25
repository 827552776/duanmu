package com.louis.kitty.core.page;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.louis.kitty.common.utils.ReflectionUtils;

/**
 * MyBatis 分页查询助手
 * @author Louis
 * @date Aug 19, 2018
 */
public class MybatisPageHelper {

	public static final String findPage = "findPage";

	public static final String findPageCom = "findPageCom";

	public static final String findPageZhu = "findPageZhu";

	public static final String findPageQuery = "findPageQuery";

	public static final String findPage1 = "findPage1";

	public static final String findPageAb = "findPageAb";

	public static final String findPageQc = "findPageQc";

	public static final String findPagePr = "findPagePr";

	public static final String findPagePi = "findPagePi";
	public static final String findPageT = "findPageT";
//	public static final String findPageOut = "findPage";

	/**
	 * 分页查询, 约定查询方法名为 “findPage” 
	 * @param pageRequest 分页请求
	 * @param mapper Dao对象，MyBatis的 Mapper	
	 * @param
	 * @return
	 */
	public static PageResult findPage(PageRequest pageRequest, Object mapper) {
		return findPage(pageRequest, mapper, findPage);
	}
	public static PageResult findPageCom(PageRequest pageRequest, Object mapper) {
		return findPage(pageRequest, mapper, findPageCom);
	}
	public static PageResult findPageZhu(PageRequest pageRequest, Object mapper) {
		return findPage(pageRequest, mapper, findPageZhu);
	}
	public static PageResult findPageQuery(PageRequest pageRequest, Object mapper) {
		return findPage(pageRequest, mapper, findPageQuery);
	}
	public static PageResult findPage1(PageRequest pageRequest, Object mapper) {
		return findPage(pageRequest, mapper, findPage1);
	}
//	public static PageResult findPageOut(PageRequest pageRequest, Object mapper) {
//		return findPageOut(pageRequest, mapper, findPageOut);
//	}
	public static PageResult findPageAb(PageRequest pageRequest, Object mapper) {
		return findPage(pageRequest, mapper, findPageAb);
	}
	public static PageResult findPageQc(PageRequest pageRequest, Object mapper) {
		return findPage(pageRequest, mapper, findPageQc);
	}
	public static PageResult findPagePr(PageRequest pageRequest, Object mapper) {
		return findPage(pageRequest, mapper, findPagePr);
	}
	public static PageResult findPagePi(PageRequest pageRequest, Object mapper) {
		return findPage(pageRequest, mapper, findPagePi);
	}
	public static PageResult findPageT(PageRequest pageRequest, Object mapper) {
		return findPage(pageRequest, mapper, findPageT);
	}
	
	/**
	 * 调用分页插件进行分页查询
	 * @param pageRequest 分页请求
	 * @param mapper Dao对象，MyBatis的 Mapper	
	 * @param queryMethodName 要分页的查询方法名
	 * @param args 方法参数
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static PageResult findPage(PageRequest pageRequest, Object mapper, String queryMethodName, Object... args) {
		// 设置分页参数
		int pageNum = pageRequest.getPageNum();
		int pageSize = pageRequest.getPageSize();
		PageHelper.startPage(pageNum, pageSize);
		// 利用反射调用查询方法
		Object result = ReflectionUtils.invoke(mapper, queryMethodName, args);
		return getPageResult(pageRequest, new PageInfo((List) result));
	}

	/**
	 * 调用分页插件进行分页查询
	 * @param pageRequest 分页请求
	 * @param mapper Dao对象，MyBatis的 Mapper
	 * @param queryMethodName 要分页的查询方法名
	 * @param args 方法参数
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static PageResult findPageCom(PageRequest pageRequest, Object mapper, String queryMethodName, Object... args) {
		// 设置分页参数
		int pageNum = pageRequest.getPageNum();
		int pageSize = pageRequest.getPageSize();
		PageHelper.startPage(pageNum, pageSize);
		// 利用反射调用查询方法
		Object result = ReflectionUtils.invoke(mapper, queryMethodName, args);
		return getPageResult(pageRequest, new PageInfo((List) result));
	}

	/**
	 * 调用分页插件进行分页查询
	 * @param pageRequest 分页请求
	 * @param mapper Dao对象，MyBatis的 Mapper
	 * @param queryMethodName 要分页的查询方法名
	 * @param args 方法参数
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static PageResult findPageT(PageRequest pageRequest, Object mapper, String queryMethodName, Object... args) {
		// 设置分页参数
		int pageNum = pageRequest.getPageNum();
		int pageSize = pageRequest.getPageSize();
		PageHelper.startPage(pageNum, pageSize);
		// 利用反射调用查询方法
		Object result = ReflectionUtils.invoke(mapper, queryMethodName, args);
		return getPageResult(pageRequest, new PageInfo((List) result));
	}
	/**
	 * 调用分页插件进行分页查询
	 * @param pageRequest 分页请求
	 * @param mapper Dao对象，MyBatis的 Mapper
	 * @param queryMethodName 要分页的查询方法名
	 * @param args 方法参数
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static PageResult findPageAb(PageRequest pageRequest, Object mapper, String queryMethodName, Object... args) {
		// 设置分页参数
		int pageNum = pageRequest.getPageNum();
		int pageSize = pageRequest.getPageSize();
		PageHelper.startPage(pageNum, pageSize);
		// 利用反射调用查询方法
		Object result = ReflectionUtils.invoke(mapper, queryMethodName, args);
		return getPageResult(pageRequest, new PageInfo((List) result));
	}
	/**
	 * 调用分页插件进行分页查询
	 * @param pageRequest 分页请求
	 * @param mapper Dao对象，MyBatis的 Mapper
	 * @param queryMethodName 要分页的查询方法名
	 * @param args 方法参数
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static PageResult findPage1(PageRequest pageRequest, Object mapper, String queryMethodName, Object... args) {
		// 设置分页参数
		int pageNum = pageRequest.getPageNum();
		int pageSize = pageRequest.getPageSize();
		PageHelper.startPage(pageNum, pageSize);
		// 利用反射调用查询方法
		Object result = ReflectionUtils.invoke(mapper, queryMethodName, args);
		return getPageResult(pageRequest, new PageInfo((List) result));
	}


	/**
	 * 将分页信息封装到统一的接口
	 * @param pageRequest 
	 * @param
	 * @return
	 */
	private static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
		PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
		return pageResult;
	}

}
