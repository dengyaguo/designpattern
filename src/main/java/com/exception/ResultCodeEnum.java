package com.exception;

/**
 * @description: 自定义状态码枚举类
 * 参考： http://www.cnblogs.com/zhanghengscnc/p/8824820.html
 */
public enum ResultCodeEnum {


    /**
     * 成功状态码
     */
    SUCCESS(1, "请求成功"),

    /**
     * 失败状态码
     */
    FAIL(0, "失败"),

    /**
     * 参数错误
     */
    PARAMS_IS_NULL(999001000, "参数为空错误"),
    PARAMS_NOT_COMPLETE(999001010, "参数不全"),
    PARAMS_TYPE_ERROR(999001020, "参数类型匹配错误"),
    PARAMS_IS_INVALID(999001030, "参数无效"),

    /**
     * 数据错误
     */
    DATA_NOT_FOUND(999002000, "数据未找到"),
    DATA_IS_WRONG(999002010, "数据有误"),
    DATA_ALREADY_EXISTED(999002020, "数据已存在"),

    /**
     * 用户错误
     */
    USER_NOT_EXIST(999003000, "用户不存在"),
    USER_NOT_LOGGED_IN(999003010, "用户未登陆"),
    USER_ACCOUNT_ERROR(999003020, "用户名或密码错误"),
    USER_ACCOUNT_FORBIDDEN(999003030, "用户账户已被禁用"),
    USER_HAS_EXIST(999003040, "该用户已存在"),
    USER_CODE_ERROR(999003050, "验证码错误"),



    /**
     * 接口错误，系统错误
     */
    INTERFACE_INNER_INVOKE_ERROR(999005000, "系统内部接口调用异常"),
    INTERFACE_OUTER_INVOKE_ERROR(999005010, "系统外部接口调用异常"),
    INTERFACE_FORBIDDEN(999005020, "接口禁止访问"),
    INTERFACE_ADDRESS_INVALID(999005030, "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT(999005040, "接口请求超时"),
    INTERFACE_EXCEED_LOAD(999005050, "接口负载过高"),
    SYSTEM_INNER_ERROR(999005060, " 系统内部错误"),
    SERVICE_TRANSFER_ERROR(999005070, "跨服务调用错误"),
    SERVICE_HYSTRIX_ERROR(999005080, "服务不可用"),

    /**
     * 业务错误
     */
    BUSINESS_ERROR(999006000, "系统业务出现问题"),
    ID_GENERATOR_ERROR(999006010, "ID生成异常"),
    HTTP_REQUEST_METHOD_ERROR(999006020, "请求方式异常"),
    CODE_IS_EXIST_ERROR(999006030, "该编码已存在"),
    MONGO_QUERY_TYPE_ERROR(999006040,"查询mongo异常"),
    MONGO_ADD_TYPE_ERROR(999006050,"新增mongo异常，主键重复"),

    /**
     * 权限错误
     */
    PERMISSION_NO_ACCESS(999007000, "当前按钮没有访问权限"),

    /**
     * 基础数据
     */
    TYPE_CODE_ALREADY_EXSIT(999009010,"类型名称已存在！"),
    SERVICE_CODE_ALREADY_EXSIT(999009020,"服务类型编码已存在！"),
    FEES_CODE_ALREADY_EXSIT(999009030,"费用类型编码已存在！"),

    /***
     * 文件上传1
     */
    FILE_UPLOAD_ERROR(999008010, "文件上传失败"),
    FILE_DOWNLOAD_ERROR(999008020, "文件下载失败"),
    FILE_DELETE_ERROR(999008030, "文件删除失败"),
    FILE_GET_ERROR(999008040, "获取文件失败"),
    FILE_TYPE_ERROR(999008050, "文件类型错误"),
    MODULE_TYPE_ERROR(999008060, "模块类型错误"),;


    private int code;
    private String msg;

    ResultCodeEnum() {
    }

    ResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    @Override
    public String toString() {
        return "ResultCodeEnum [code=" + code + ", msg=" + msg + "]";
    }
}
