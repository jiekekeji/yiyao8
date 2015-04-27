package com.jack.yiyao8.constant;

/**
 * 数据库和表的一些常量
 * 
 * @author Administrator
 *
 */
public class DbTableContant {

	/**
	 * 数据库名
	 */
	public static final String DB_NAME = "yiyao.db";

	/**
	 * 数据库版本
	 */
	public static final int DB_VERSION = 1;

	/**
	 * 记录每一次请求 
	 * @author Administrator
	 */
	public static class BaseTableColumns {
		/**
		 * 主键
		 */
		public static final String TABLE_ID = "t_id";
		/**
		 * 请求第几页
		 */
		public static final String QUERY_PAGE = "q_page";
		/**
		 * 每页几条数据
		 */
		public static final String QUERY_LIMIT = "q_limit";
		/**
		 * 排序方式 id：最新时间，count：访问最多，默认是id，按最新时间。
		 */
		public static final String QUERY_TYPE = "q_type";
		/**
		 * id：这里是指知识分类的ID 默认为 null ，也就是全部。
		 */
		public static final String QUERY_ID = "q_id";
		/**
		 * 请求时间
		 */
		public static final String QUERY_TIME = "q_time";
	}

	/**
	 * 健康咨询
	 */
	public static final String HEALTH_NEWS_TABLE_NAME = "health_news";

	/**
	 * 热词
	 */
	public static final String HOT_WORD_TABLE_NAME = "hot_word";
	/**
	 * 健康知识
	 */
	public static final String HEALTH_KNOWLEDGE_TABLE_NAME = "health_knowledge";
	/**
	 * 健康一问
	 */
	public static final String HEALTH_ASK_TABLE_NAME = "health_ask";
	/**
	 * 健康图书
	 */
	public static final String HEALTH_BOOK_TABLE_NAME = "health_book";
	/**
	 * 药品直达
	 */
	public static final String DRUG_NEWS_TABLE_NAME = "drug_news";
	/**
	 * 健康食谱
	 */
	public static final String HEALTH_FOOD_TABLE_NAME = "health_food";
	/**
	 * 食疗大全
	 */
	public static final String FOOD_HEAL_TABLE_NAME = "food_heal";
	/**
	 * 疾病查找
	 */
	public static final String SICK_FIND_TABLE_NAME = "sick_find";
	/**
	 * 病状查找
	 */
	public static final String SYMPTOM_FIND_TABLE_NAME = "symptom_find";
	/**
	 * 检查项目
	 */
	public static final String sick_check_TABLE_NAME = "sick_check";
	/**
	 * 手术项目
	 */
	public static final String surgery_project_TABLE_NAME = "surgery_project";
	
	

}
