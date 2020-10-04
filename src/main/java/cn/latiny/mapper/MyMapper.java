package cn.latiny.mapper;

/**
 * @author Latiny
 * @description TODO
 * @create_time 2020-09-26 20:34
 * @since 1.0
 */
public interface MyMapper<T> {

    int insert(T record);

    void update(T record);

    T selectById(Long id);

    void delete(T record);
}
