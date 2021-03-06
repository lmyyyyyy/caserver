package com.card.alumni.exception;

/**
 * 结果状态码接口
 *
 * @author liumingyu
 * @date 2019-11-19 10:40 PM
 */
public interface ResultCodeInterface {

    int SUCCESS_CODE = 0;

    int FAIL_CODE = 500;

    String SUCCESS_MSG = "成功";

    int getCode();

    String getMsg();
}
