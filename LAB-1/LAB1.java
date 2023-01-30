import java.util.Scanner;
public class LAB1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= scan.nextLine();
        System.out.println("Enter your age:");
        int age= Integer.parseInt(scan.nextLine());
        System.out.println("Enter you gender:");
        char gender = scan.next().charAt(0);
        System.out.println("Enter your state:");
        String locality = scan.next();
        System.out.println("Enter the previous company you worked in :");
        String mnc = scan.next();
        System.out.println("NAME : "+name);
        System.out.println("Age : "+age);
        System.out.println("The state candidate belong :"+locality);
        System.out.println("The previous company the candidate worked in :"+mnc);
       
		// checking if user is female
		if(gender == 'F') 
		System.out.println("The gender is FEMALE");
		
		
		// checking if user is male
		else{
            System.out.println("The gender is MALE");

        }
		
        System.out.println("The locality is :");
        switch(locality){
            
            case "Jammu and Kashmir":
            System.out.println("The candidate is from North The preferable work location is"+locality);
            break;
            case "Himachal Pradesh":
            System.out.println("The candidate is from North;The preferable work location is"+locality);
            break;
            case "Punjab":
            System.out.println("The candidate is from North;The preferable work location is"+locality);
            break;
            case "Uttarakhand":
            System.out.println("The candidate is from North ;The preferable work location is"+locality);
            break;
            case "Hariyana":
            System.out.println("The candidate is from North;The preferable work location is"+locality);
            break;
            case "Delhi":
            System.out.println("The candidate is from North The preferable work location is" +locality);
            break;
            case "Rajasthan":
            System.out.println("The candidate is from North The preferable work location is"+locality);
            break;
            case "Uttar Pradesh":
            System.out.println("The candidate is from North The preferable work location is"+locality);
            break;
            case "Chattisgharh":
            System.out.println("The candidate is from North The preferable work location is"+locality);
            break;
            case "Arunachal Pradesh":
            case "Assam":
            case "Manipur":
            case "Meghalaya":
            case "Mizoram":
            case "Nagaland":
            case "Tripura":
            case "Andaman & Nicobar Islands":
            case "Bihar":
            case "Jharkhand":
            case "Orissa":
            case "Sikkim":
            case "West Bengal":
                System.out.println("The candidate is from the 'eastern' states of India; Preferable work location is in " +locality);

           case "Andhra Pradesh":
           case "Karnataka":
           case "Kerala":
           case "Lakshadweep":
           case "Pondicherry":
           case "Tamil Nadu":
                System.out.println("The candidate is from the 'southern' states of India; Preferable work location is in " +locality);
                    break;
           default:
                System.out.println("The Employee is from the 'western' states of India; Preferable work location is in " +locality);
                    break;

          }
          switch(mnc)
          {
              case "Facebook":
              case "Google":
              case "Microsoft":
              case "Samsung":
              case "IBM":
              case "Apple":
                  System.out.println("The candidate is working in Top MNC Companies.");
                  break;
              default:
                  System.out.println();
                  break;
          }
	}
    
}