import java.io.*;    
import java.text.SimpleDateFormat;  
import java.util.*;  
public class Attendance {
	public static void main(String[] args) throws Exception {  
		if(args.length != 2){  
            System.out.println("�������벻��");  
            System.out.println("��ʽ��java RegisterApp �����ļ�����  �༶����");  
            System.exit(0);  
        }  
		 System.out.println("");
		 System.out.println("������������������������������������");  
	        System.out.println("����ǩ������");  
	        System.out.println("��ʦ�е����֣���𡮵���");  
	        System.out.println("1������       0��ȱ��");  
	        System.out.println("������������������������������������"); 
	        //arg[0]ѧ����arg[1]�༶
	        Date now = new Date();   
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMdd_HHMM");//���Է�����޸����ڸ�ʽ  
	        String Dates = dateFormat.format( now );   
	        System.out.println("ʱ�䣺"+Dates);   
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
	        
	        while(input.hasNext()){  //��ȡѧ������  
	            String Name = input.nextLine();  
	            System.out.println(Name);  
	            flag = sc.nextInt();  
	            if(flag==0){  
	                numberabsent = numberabsent+1;  
	                student = student + " " + Name;  
	            }  
	            //�ѿ��ڽ��д������  
	            output.print(Name);  
	            output.print("    ");  
	            output.println(flag);  
	  
	        }  
	        output.print("δ������");
	        output.print(numberabsent+" ");
	        output.print("name:");
	        output.print(student);
	        //�ر�I/O�ܵ�  
	        sc.close();  
	        output.close();       
	        input.close();  
	          
	        System.out.println("����������������������������������������������������");  
	        System.out.println("���ڽ���.");  
	        System.out.printf("һ����%d��ͬѧȱ�Σ��ֱ��ǣ�%s\n",numberabsent,student);   
	        System.out.println("ллʹ��");  
	  
	    }  
	}

