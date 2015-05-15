
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hungnguyen
 */
public class testlmdb {
    public static void main(String[] args) {
        JedisPool jedisPool = new JedisPool();
        JedisPoolConfig poolCfg = new JedisPoolConfig();
        poolCfg.setMaxTotal(100);
        poolCfg.setMaxIdle(50);
        poolCfg.setMaxWaitMillis(1000);
        jedisPool = new JedisPool(poolCfg, "10.211.55.11", 6379);
        Jedis jd = jedisPool.getResource();
        
        String lmdbget = jd.lmdbget("a");
//        String get =jd.get("sdfdfdf");
//        System.out.println(get);
        System.out.println(lmdbget);
        
        
    }
    
}
