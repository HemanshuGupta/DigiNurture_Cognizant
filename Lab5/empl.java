package Lab5;

import java.util.*;

interface employee{
    int Empid=0000;
    char Ename=0000;
    void get_details();
}

interface manager extends employee{
    int Deptid=0000;
    char Deptname=0000;
    void get_dept_details();
}

class head implements manager{
    public head(int Empid,char Ename,int Deptid,char Deptname){
        this.Empid=Empid;
        this.Ename='';
        this.Deptid=Deptid;
        this.Deptname='';
    }
}

public class empl {
    
}
