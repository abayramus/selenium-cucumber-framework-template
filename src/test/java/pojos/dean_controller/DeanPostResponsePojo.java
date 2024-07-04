package pojos.dean_controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)

public class DeanPostResponsePojo implements Serializable {

//    Purpose:
//    It stores information about a response from a dean-related operation, including an object (like dean details), a message, and the HTTP status.
//    Usage :
//    It helps manage and represent data received from operations involving deans, such as saving or retrieving information, making it easier to handle and understand within a program.

    private ObjectPojo object;
    private String message;
    private String httpStatus;

    public ObjectPojo getObject() {
        return object;
    }

    public DeanPostResponsePojo() {
    }

    public DeanPostResponsePojo(ObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public void setObject(ObjectPojo object) {
        this.object = object;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String toString() {
        return
                "DeanPostResponsePojo{" +
                        "object = '" + object + '\'' +
                        ",message = '" + message + '\'' +
                        ",httpStatus = '" + httpStatus + '\'' +
                        "}";
    }
}