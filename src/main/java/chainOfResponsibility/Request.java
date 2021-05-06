package chainOfResponsibility;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/6
 * @description：请求类，封装请求类型和请求数量
 */

public class Request {

    private String requestType;
    private int requestNum;


    public int getRequestNum() {
        return requestNum;
    }

    public void setRequestNum(int requestNum) {
        this.requestNum = requestNum;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

}
