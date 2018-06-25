package cn.e3mall.jedis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {
	
	@Test
	public void testJedis() {
		Jedis jedis=new Jedis("192.168.25.123", 6379);
		jedis.set("test1", "my first jedis test");
		System.out.println(jedis.get("test1"));
		jedis.close();
	}
	
	
}
