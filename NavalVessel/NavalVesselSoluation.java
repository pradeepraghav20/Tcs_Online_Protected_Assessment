package tcs_new;
import java.util.*;
class NavalVessel{
	int vesselId;
	String vesselName;
	int noOfVoyagesPlanned;
	int onOfVoyagesCompleted;
	String purpose;
	String classification;
	public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int onOfVoyagesCompleted,
			String purpose, String classification) {
		super();
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.noOfVoyagesPlanned = noOfVoyagesPlanned;
		this.onOfVoyagesCompleted = onOfVoyagesCompleted;
		this.purpose = purpose;
		this.classification = classification;
	}
	public int getVesselId() {
		return vesselId;
	}
	public void setVesselId(int vesselId) {
		this.vesselId = vesselId;
	}
	public String getVesselName() {
		return vesselName;
	}
	public void setVesselName(String vesselName) {
		
		this.vesselName = vesselName;
	}
	public int getnoOfVoyagesPlanned() {
		return noOfVoyagesPlanned;
	}
	public void setnoOfVoyagesPlanned(int noOfVoyagesPlanned) {
		this.noOfVoyagesPlanned = noOfVoyagesPlanned;
	}
	public int getOnOfVoyagesCompleted() {
		return onOfVoyagesCompleted;
	}
	public void setOnOfVoyagesCompleted(int onOfVoyagesCompleted) {
		this.onOfVoyagesCompleted = onOfVoyagesCompleted;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
}
public class NavalVesselSoluation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		NavalVessel nv[]= new NavalVessel[2];
		for (int i=0;i<nv.length;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String vesselName= sc.nextLine();
			int noOfVoyagesPlanned=sc.nextInt();
			int onOfVoyagesCompleted=sc.nextInt();
			sc.nextLine();
			String purpose=sc.nextLine();
			String classification=sc.nextLine();
			nv[i]=new NavalVessel(id,vesselName,noOfVoyagesPlanned,
					onOfVoyagesCompleted,purpose,classification);
			}	
		int percent=sc.nextInt();
		int output1=findAvgVoyagesByPact(nv,percent);
		System.out.println(output1);
		
		sc.nextLine();
		String purpose=sc.nextLine();
		
		NavalVessel output2=	findVesselByGrade(nv,purpose);
		if (output2!=null) {
			System.out.println(output2.getVesselName() +"#"+ output2.getClassification());
		}else {
			System.out.println("No Record Found");
			
		}
		
	
	}
	
	public static int findAvgVoyagesByPact(NavalVessel[] navalVessel,int percentage) {
		int sum=0;
		int count=0;
		for (int i=0;i<navalVessel.length;i++) {
			int pact=(navalVessel[i].getOnOfVoyagesCompleted()*100)/navalVessel[i].getnoOfVoyagesPlanned();
			if (pact>percentage) {
				sum+=navalVessel[i].getOnOfVoyagesCompleted();
				count++;
			}
		}
		if (count>0) {
			return sum/count;
			
		}
		else {
			return 0;
		}
		
	}
	
	public static NavalVessel findVesselByGrade(NavalVessel[] navalVessel ,String purpose){
		NavalVessel nv=null;
		for (int i=0;i<navalVessel.length;i++) {
			if (navalVessel[i].getPurpose().equalsIgnoreCase(purpose)) {
				nv=navalVessel[i];
				int pact=(navalVessel[i].getOnOfVoyagesCompleted()*100)/navalVessel[i].getnoOfVoyagesPlanned();
				if (pact==100) {
					navalVessel[i].setClassification("Star");
				}
				else if (pact<=99 &&pact>=88) {
					navalVessel[i].setClassification("Leader");
					
				}
				
				else if (pact<=79 &&pact>=55) {
					navalVessel[i].setClassification("Inspire");
					
				}
				
				else
				{
					navalVessel[i].setClassification("Striver");
					
				}
				break;
				
			}
		}
		return nv;
		
		
	}

	}
