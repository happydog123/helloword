package com.helloword.gsonObject.responseProtocol;

import com.helloword.gsonObject.GlobalUserDetails;

public class LogoutResponseProtocol extends GlobalResponseProtocol {
    
    private GlobalUserDetails details;

    public GlobalUserDetails getDetails() {
        return details;
    }

    public void setDetails(GlobalUserDetails details) {
        this.details = details;
    }

}