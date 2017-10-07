package com.snail.dao;

import com.snail.pojo.domain.Menu;
import com.snail.pojo.domain.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated
     */
    int countByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated
     */
    int deleteByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `menu`",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `menu` (`id`, `level`, ",
        "`name`, `desc`, `parent_id`, ",
        "`app`, `url`, `update_at`, ",
        "`create_at`, `create_by`, ",
        "`update_by`, `status`)",
        "values (#{id,jdbcType=INTEGER}, #{level,jdbcType=INTEGER}, ",
        "#{name,jdbcType=VARCHAR}, #{desc,jdbcType=VARCHAR}, #{parentId,jdbcType=INTEGER}, ",
        "#{app,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{updateAt,jdbcType=TIMESTAMP}, ",
        "#{createAt,jdbcType=TIMESTAMP}, #{createBy,jdbcType=VARCHAR}, ",
        "#{updateBy,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER})"
    })
    int insert(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated
     */
    int insertSelective(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated
     */
    List<Menu> selectByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "`id`, `level`, `name`, `desc`, `parent_id`, `app`, `url`, `update_at`, `create_at`, ",
        "`create_by`, `update_by`, `status`",
        "from `menu`",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Menu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated
     */
    @Update({
        "update `menu`",
        "set `level` = #{level,jdbcType=INTEGER},",
          "`name` = #{name,jdbcType=VARCHAR},",
          "`desc` = #{desc,jdbcType=VARCHAR},",
          "`parent_id` = #{parentId,jdbcType=INTEGER},",
          "`app` = #{app,jdbcType=VARCHAR},",
          "`url` = #{url,jdbcType=VARCHAR},",
          "`update_at` = #{updateAt,jdbcType=TIMESTAMP},",
          "`create_at` = #{createAt,jdbcType=TIMESTAMP},",
          "`create_by` = #{createBy,jdbcType=VARCHAR},",
          "`update_by` = #{updateBy,jdbcType=VARCHAR},",
          "`status` = #{status,jdbcType=INTEGER}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Menu record);
}