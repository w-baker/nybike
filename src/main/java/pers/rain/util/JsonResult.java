package pers.rain.util;

/**
 * 封装服务器返回的json数据
 */
public class JsonResult<T> {

    private Integer state; // 封装自定义响应状态码
    private String msg; // 封装提示信息
    private T data; // 封装响应数据
    private static final int SUCCESS_STATE=1000; // 表示正常响应的状态码

    /**
     * 快速生成表示正常响应的JsonResult对象
     * 不携带任何数据
     * @return
     */
    public static JsonResult<Void> getSuccessJR(){
        return new JsonResult<>(SUCCESS_STATE,"OK");
    }

    /**
     * 快速生成表示正常响应的JsonResult对象
     * 携带服务器返回的数据
     * @param data 服务器返回的数据
     * @param <T> 数据对应的Java类型
     * @return
     */
    public static <T> JsonResult<T> getSuccessJR(T data){
        return new JsonResult<>(SUCCESS_STATE,"OK",data);
    }

    public JsonResult() {
    }

    public JsonResult(Integer state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public JsonResult(Integer state, String msg, T data) {
        this.state = state;
        this.msg = msg;
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "state=" + state +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
