package com.it.po;

import java.io.Serializable;
import java.util.Date;

public class LendList implements Serializable {


    private ReaderCard readerCard;

    private BookInfo bookInfo;

    public ReaderCard getReaderCard() {
        return readerCard;
    }

    public void setReaderCard(ReaderCard readerCard) {
        this.readerCard = readerCard;
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.id
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.book_id
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    private Integer bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.reader_id
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    private Integer readerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.lend_date
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    private Date lendDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.back_date
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    private Date backDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.type
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_list.remarks
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lend_list
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.id
     *
     * @return the value of lend_list.id
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.id
     *
     * @param id the value for lend_list.id
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.book_id
     *
     * @return the value of lend_list.book_id
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.book_id
     *
     * @param bookId the value for lend_list.book_id
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.reader_id
     *
     * @return the value of lend_list.reader_id
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public Integer getReaderId() {
        return readerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.reader_id
     *
     * @param readerId the value for lend_list.reader_id
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.lend_date
     *
     * @return the value of lend_list.lend_date
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public Date getLendDate() {
        return lendDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.lend_date
     *
     * @param lendDate the value for lend_list.lend_date
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.back_date
     *
     * @return the value of lend_list.back_date
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public Date getBackDate() {
        return backDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.back_date
     *
     * @param backDate the value for lend_list.back_date
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public void setBackDate(Date backDate) {
        this.backDate = backDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.type
     *
     * @return the value of lend_list.type
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.type
     *
     * @param type the value for lend_list.type
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_list.remarks
     *
     * @return the value of lend_list.remarks
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_list.remarks
     *
     * @param remarks the value for lend_list.remarks
     *
     * @mbggenerated Tue Dec 08 15:59:31 CST 2020
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}