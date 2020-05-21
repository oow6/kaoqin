import java.io.*;    
import java.text.SimpleDateFormat;  
import java.util.*;  
public class Attendance {
	public static void main(String[] args) throws Exception {  
		if(args.length != 2){  
            System.out.println("参数输入不对");  
            System.out.println("格式：java RegisterApp 名单文件名称  班级名称");  
            System.exit(0);  
        }  
		 System.out.println("");
		 System.out.println("——————————————————");  
	        System.out.println("简易签到程序");  
	        System.out.println("老师叫到名字，请答‘到’");  
	        System.out.println("1：到课       0：缺课");  
	        System.out.println("——————————————————"); 
	        //arg[0]学生，arg[1]班级
	        Date now = new Date();   
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMdd_HHMM");//可以方便地修改日期格式  
	        String Dates = dateFormat.format( now );   
	        System.out.println("时间："+Dates);   
	        String fileList = args[0];  
	        String fileCheck = args[1] + Dates + ".txt";  
	     
	        File fileInput = new File(fileList);  
	        File fileOutput = new File(fileCheck); 
	        Scanner input = new Scanner(fileInput);  
	        Scanner sc = new Scanner(System.in);  
	        PrintWriter output = new PrintWriter(fileOutput); 
	        
	        String student = "";  
	        int numberabsent = 0;  
	        int flag = 0;  
	        
	        while(input.hasNext()){  //读取学生数据  
	            String Name = input.nextLine();  
	            System.out.println(Name);  
	            flag = sc.nextInt();  
	            if(flag==0){  
	                numberabsent = numberabsent+1;  
	                student = student + " " + Name;  
	            }  
	            //把考勤结果写入名单  
	            output.print(Name);  
	            output.print("    ");  
	            output.println(flag);  
	  
	        }  
	        output.print("未到人数");
	        output.print(numberabsent+" ");
	        output.print("name:");
	        output.print(student);
	        //关闭I/O管道  
	        sc.close();  
	        output.close();       
	        input.close();  
	          
	        System.out.println("——————————————————————————");  
	        System.out.println("考勤结束.");  
	        System.out.printf("一共有%d个同学缺课，分别是：%s\n",numberabsent,student);   
	        System.out.println("谢谢使用");  
	  
	    }  
	}

