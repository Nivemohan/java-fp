# java-fp
class Project1
{
public static void main(String a[])
{
int empNo[]={1001,1002,1003,1004,1005,1006,1007};
String empName[]={"ashish","sushma","rahul","chahat","ranjan","suman","tanmay"},
 joinDate[]={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005",
 "1/1/2000","12/06/20"};
char designCode[]={'e','c','k','r','m','e','c'};
String dept[]={"R&D","PM","Acct","FrontDesk","Engg","Manufacturing","PM"};
int basic[]={20000,30000,10000,12000,50000,23000,29000},
hra[]={8000,12000,8000,6000,20000,9000,12000},
it[]={3000,9000,1000,2000,20000,4400,10000};
int empId=Integer.parseInt(a[0]);
int total=0,salary=0,j=0;
char choice=' ';
String designation=null;
for(int i=0;i<7;i++)
{
if(empNo[i]==empId)
{
total=basic[i]+hra[i]-it[i];
choice=designCode[i];
j=i;
}
}
switch(choice)
{
case 'e':salary=total+20000;
designation="Engg";
break;
case 'c':salary=total+32000;
designation="Clerk";
break;
case 'k':salary=total+12000;
designation="Clerk";
break;
case 'r':salary=total+15000;
designation="Receptionist";
break;
case 'm':salary=total+40000;
designation="Manager";
break;
}
System.out.println("EmpNo EmpName Department Designation Salary\n"+empNo[j]+"
"+empName[j]+" "+dept[j]+" "+designation+" "+salary);
}
}
