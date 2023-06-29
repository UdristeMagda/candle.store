package com.candle.store.enums;

import com.candle.store.entity.Role;

public enum UserRole {
    ROLE_ADMIN,
    ROLE_USER;

   public String friendlyName(){
       return switch (this){
           case ROLE_ADMIN -> "Admin";
           case ROLE_USER -> "User";
       };
   }
}
