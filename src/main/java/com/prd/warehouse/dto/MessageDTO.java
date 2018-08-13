package com.prd.warehouse.dto;

import com.prd.warehouse.util.PropertiesUtil;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-07-26  18:02
 */
public class MessageDTO {

    private int code;
    private String msg;

    //general exception
    public final static MessageDTO DATEBASE_ERROR = new MessageDTO(PropertiesUtil.getInt("database.error.code"),PropertiesUtil.getString("database.error.msg"));
    public final static MessageDTO SERVLET_ERROR = new MessageDTO(PropertiesUtil.getInt("servlet.error.code"),PropertiesUtil.getString("servlet.error.msg"));

    //general module instruction
    public final static MessageDTO MODULE_WAREHOUSE = new MessageDTO(-7,"库房模块关闭，无法启动响应");



    //input
    public final static MessageDTO INPUT_SUCCESS = new MessageDTO(1, PropertiesUtil.getString("dispatch.input.success"));
    public final static MessageDTO INPUT_FAIL = new MessageDTO(0,PropertiesUtil.getString("dispatch.input.failure"));
    //output
    public final static MessageDTO OUTPUT_SUCCESS = new MessageDTO(1, PropertiesUtil.getString("dispatch.output.success"));
    public final static MessageDTO OUTPUT_FAIL = new MessageDTO(0,PropertiesUtil.getString("dispatch.output.failure"));
    //transfer
    public final static MessageDTO TRANSFER_SUCCESS = new MessageDTO(1, PropertiesUtil.getString("dispatch.transfer.success"));
    public final static MessageDTO TRANSFER_FAIL = new MessageDTO(0,PropertiesUtil.getString("dispatch.transfer.failure"));


    private MessageDTO(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}
