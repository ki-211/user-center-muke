package org.yupi.usercenter.common;

/**
 * 通用返回类工具类
 *
 * @author ZKT
 */
public class ResultUtils {

    // 添加私有构造函数来隐藏隐式的公共构造函数
    private ResultUtils() {
        // 可以抛出一个异常，防止反射调用私有构造函数创建实例
        throw new AssertionError("No instances of ResultUtils for you!");
    }

    /**
     * 成功
     * @param data 成功的参数
     * @return 返回成功
     * @param <T> 成功数据的类
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok", "");
    }

    /**
     * 失败
     *
     * @param errorCode 失败的参数
     * @return 返回成功
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param errorCode 失败的参数
     * @return 返回成功
     */
    public static BaseResponse error(ErrorCode errorCode, String description) {
        return new BaseResponse<>(errorCode.getCode(), null, errorCode.getMessage(), description);
    }

    /**
     * 失败
     *
     * @param errorCode 失败的参数
     * @return 返回成功
     */
    public static BaseResponse error(ErrorCode errorCode, String message, String description) {
        return new BaseResponse<>(errorCode.getCode(), null, message, description);
    }

    /**
     * 失败
     *
     * @param code 失败编码
     * @param message 失败信息
     * @param description 失败描述
     * @return 通用返回类
     */
    public static BaseResponse error(int code, String message, String description) {
        return new BaseResponse<>(code, null, message, description);
    }
}
