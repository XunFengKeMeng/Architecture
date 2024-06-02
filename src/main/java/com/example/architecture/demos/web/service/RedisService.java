package com.example.architecture.demos.web.service;

/**
 * redis操作Service,
 * 对象和数组都以json形式进行存储
 */
public interface RedisService {

    /**
     * 存储数据
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * 获取数据
     * @param key
     * @return
     */
    Object get(String key);

    /**
     * 设置超时时间
     * @param key
     * @param time
     */
    boolean expire(String key, long time);

    /**
     * 删除数据
     * @param key
     */
    void remove(String key);

    /**
     * 自增操作
     * @param key
     * @param delta
     * @return
     */
    Long increment(String key, long delta);
}