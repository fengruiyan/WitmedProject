package com.whackon.witmed.base.util;
import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author
 * @date
 * @since
 */
@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;
	private  Logger logger = LoggerFactory.getLogger(RedisUtil.class);
	/**
	 * <b>将对象存入到 Redis 中</b>
	 *
	 * @param key
	 * @param value
	 * @return
	 */
	public  boolean saveToRedis(String key, Object value, Long expireSec) {
		try {
			//创建JsonMapper对象
			JsonMapper jsonMapper = new JsonMapper();
			String JAONString = jsonMapper.writeValueAsString(value);
			//将对象存入 Redis 中
			redisTemplate.opsForValue().set(key , JAONString);
			//设定存储时长
			redisTemplate.expire(key, expireSec, TimeUnit.SECONDS);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage()+":"+new Date(),e);
		}
		return false;
	}
	/**
	 * <b>将对象从Redis中取出</b>
	 * @param key
	 * @param type
	 * @return
	 */
	public  Object findFronRedis(String key,Class type) {
		//创建JsonMapper对象
		JsonMapper jsonMapper = new JsonMapper();
		try {
			//根据 key 从 Redis 获取数据
			String jsonString = redisTemplate.opsForValue().get("key");
			if(StrUtil.isNotBlank(jsonString)) {
				//讲啊对应JSON变为对象
				return jsonMapper.readValue(jsonString, type);
			}
		}catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage()+":"+new Date(),e);
		}
		return null;
	}
}