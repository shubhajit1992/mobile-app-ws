package com.shubhajit.mobileappws.web.model.response;

public class OperationStatus {
    private String operationResult;
    private String OperationName;

    public String getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(String operationResult) {
        this.operationResult = operationResult;
    }

    public String getOperationName() {
        return OperationName;
    }

    public void setOperationName(String operationName) {
        OperationName = operationName;
    }
}
