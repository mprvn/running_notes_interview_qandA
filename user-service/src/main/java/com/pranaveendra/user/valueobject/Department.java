package com.pranaveendra.user.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private long id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
