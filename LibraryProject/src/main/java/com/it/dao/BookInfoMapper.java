package com.it.dao;

import com.it.po.BookInfo;

import java.util.List;

public interface BookInfoMapper {
    /**
     * 查询全部图书信息
     */
    List<BookInfo> queryBookInfoAll(BookInfo bookInfo);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    int insert(BookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    int insertSelective(BookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    BookInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    int updateByPrimaryKeySelective(BookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(BookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    int updateByPrimaryKey(BookInfo record);


}