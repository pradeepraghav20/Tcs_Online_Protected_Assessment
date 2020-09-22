import java.util.Scanner;
class Player{
	int playerId;
	String playerName;
	int score1,score3,score2;
	public Player(int playerId, String playerName, int score1, int score3, int score2) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.score1 = score1;
		this.score3 = score3;
		this.score2 = score2;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getScore1() {
		return score1;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public int getScore3() {
		return score3;
	}
	public void setScore3(int score3) {
		this.score3 = score3;
	}
	public int getScore2() {
		return score2;
	}
	public void setScore2(int score2) {
		this.score2 = score2;
	}
	
	
	
	
	
	
}

public class PlayerSoluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 Player player[]=new Player[2];
		 for (int i=0;i<player.length;i++) {
			 int id=sc.nextInt();
			 sc.nextLine();
			 String name=sc.nextLine();
			 int s1=sc.nextInt();
			 int s2=sc.nextInt();
			 int s3=sc.nextInt();
			 sc.nextLine();
			 player[i]=new Player(id,name, s1,s2,s3); 
		 }	 
		 int res=findTotalHundred(player);
		 System.out.println(res);
		 Player res1=getTopPlayer(player);
		 System.out.println(res1.getPlayerId());
		 
		 
		 
	}
	
	public static int findTotalHundred(Player[]player) {
		int count=0;
		for (Player i:player) {
			if (i.getScore1()>=100) {
				count+=1;
			}
			
			
			if (i.getScore2()>=100) {
				count+=1;
			}
			
			if (i.getScore3()>=100) {
				count+=1;
			}
			}
		
		if (count>0) {
			return count;
		}
		else {
			return 0;
		}
		
	}
	public static Player getTopPlayer(Player[] players) {
		Player res=null;
		int max=0;
		for (Player i:players) {
			int sum=i.getScore1()+i.getScore2()+i.getScore3();
			if (sum>max) {
				max=sum;
				res=i;
			}
		}
		
		return res;
		
	}
	
}
