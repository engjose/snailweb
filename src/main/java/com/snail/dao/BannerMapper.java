package com.snail.dao;

import com.snail.pojo.domain.Banner;
import com.snail.pojo.domain.BannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    int countByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    int deleteByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `banner`",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `banner` (`id`, `img_url`, ",
        "`title`, `content`, ",
        "`jump_url`, `app`, `upate_at`, ",
        "`create_at`, `status`)",
        "values (#{id,jdbcType=INTEGER}, #{imgUrl,jdbcType=VARCHAR}, ",
        "#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{jumpUrl,jdbcType=VARCHAR}, #{app,jdbcType=VARCHAR}, #{upateAt,jdbcType=TIMESTAMP}, ",
        "#{createAt,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER})"
    })
    int insert(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    int insertSelective(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    List<Banner> selectByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "`id`, `img_url`, `title`, `content`, `jump_url`, `app`, `upate_at`, `create_at`, ",
        "`status`",
        "from `banner`",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Banner selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Banner record, @Param("example") BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Banner record, @Param("example") BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    @Update({
        "update `banner`",
        "set `img_url` = #{imgUrl,jdbcType=VARCHAR},",
          "`title` = #{title,jdbcType=VARCHAR},",
          "`content` = #{content,jdbcType=VARCHAR},",
          "`jump_url` = #{jumpUrl,jdbcType=VARCHAR},",
          "`app` = #{app,jdbcType=VARCHAR},",
          "`upate_at` = #{upateAt,jdbcType=TIMESTAMP},",
          "`create_at` = #{createAt,jdbcType=TIMESTAMP},",
          "`status` = #{status,jdbcType=INTEGER}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Banner record);
}