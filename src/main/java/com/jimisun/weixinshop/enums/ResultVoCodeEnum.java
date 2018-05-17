package com.jimisun.weixinshop.enums;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 22:12 2018-05-12
 * @Modified By:
 */
public enum  ResultVoCodeEnum {


    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    LOSE(1,"失败"),
    PRODUCT_NOT_EXIST(10,"商品不存在！"),
    PRODUCT_STOCK_ERROR(11,"库存不足！"),
    ORDER_NOT_EXIST(12,"订单不存在！"),
    ORDER_DETAIL_NOT_EXIST(13,"订单详情不存在！"),
    ORDER_STATUS_ERROR(14,"订单状态不正确！"),
    ORDER_UPDATE_FAIL(15,"订单更新失败！"),
    ORDER_DETAIL_EMPIY(15,"订单中没有商品！"),
    ORDER_PAY_STATUS_ERROR(16,"订单支付状态不正确"),
    PARAM_ERROR(17,"参数不正确"),
    CART_EMPTY(18,"购物车为空"),
    ORDER_OWNER_ERROR(19,"该订单无权访问！")
    ;


    private Integer code;

    private String msg;

    ResultVoCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
